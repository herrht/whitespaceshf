package szlab4_whitespaces;

import java.awt.event.*;
import java.io.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

//A program Controllerje.
public class ProgramController extends JPanel implements ActionListener {

    private ElementView view; //Az elemek megjelenítőjére mutató referencia.
    private Program progi; //A program példányra mutató referencia.
    private String flag; //Ezt a flaget fogjuk a gombnyomásra beállítani.
    private Coordinate c; //Egy segédváltozó
    private AElement el; //Egy segéfváltozó
    private JFileChooser fc; //FileChooser példány, ezt fogjuk a mentésre és a betöltésre használni
    private int popval; //A felhasználótól bekért adatok.
    private String popin; //A felhasználótól bekért adatok String formában.

    public ProgramController(ElementView v) {


        fc = new JFileChooser(); // Új FileChooser létrehozása.
        c = new Coordinate(0, 0); //C segédváltozó példányosítása
        view = v; //Paraméterül kapja az ElementView referenciát
        progi = new Program(); //Új program létrehozása.
        progi.view = view; //A program-ban lévő view beállítása.
        progi.NewProject(); //Új project létrehozása
        flag = "IDLE"; //A flag beállítása üresjáratra.
        view.addMouseListener(new MouseAdapter() { //A viewhoz létrehozunk egy MouseListenert, ami a kattintásokat fogja kezelni.

            @Override
            public void mouseClicked(MouseEvent e) {
                if (flag.equals("RUNNING")) { //Ha a szimuláció fut, akkor kattintással csak a kapcsolót tudjuk állítani.
                    el = null;
                    c = new Coordinate(e.getX(), e.getY()); //A kattintás koordinátájának eltárolása.
                    Coordinate cor = new Coordinate(0, 0); //Egy új koordináta pédányosítása
                    int i = 0; //ciklusváltozó létrehozása
                    boolean found = false; //egy segédváltozó a ciklusból való kilépéshez
                    while (i < view.c.size() && !found) { //Addig megyünk míg nem értünk végig a koordináták listáján, vagy nem találtuk meg a kívánt elemet.
                        cor = view.c.get(i); //Lekérjük az i. elemet a Koordináták közül.
                        if (cor.equal(c)) { //Ha a lekért koordináta megegyezik a kattintáséval
                            found = true;   //akkor megtaláltuk a kívánt elemet tehát kilépünk a ciklusból és
                            el = view.elements.get(cor); //az el változóba eltároljuk a kívánt elemet
                        }
                        i++; //növlejük a ciklusváltozót
                    }
                    try {
                        if (el.toString().equals("Switch0") || el.toString().equals("Switch1")) { // ha a megtalált elem egy kapcsoló
                            Switch sw = (Switch) progi.proj.elements.get(el.ID);
                            sw.SwitchOutput(); //akkor meghívjuk a SwitchOutput fv-ét, hogy átkapcsoljuk.

                        }
                    } catch (Exception exc) {
                    }

                    view.repaint(); //újrarajzoljuk a view-t, hogy megjelenjen a változás a képernyőn.

                } else {
                    if (flag.equals("AND")) { //Ha a falg AND (az and gombot nyomtuk meg) akkor hozzáadunk egy és kaput a projecthez.

                        pop("Hány bemenete legyen a kapunak? (2-4)"); // Megkérdezzük a felhasználótól, hogy hány bemenete legyen a kapunak
                        while ((popval < 2 || popval > 4) && popin != null) { //Ha nem 2 és 4 közötti számot adott meg
                            pop("A bemenetnek 2 és 4 között kell lennie!");   //akkor bekérjük újra.
                        }
                        if (popval != -1) {
                            int i = progi.proj.AddAnd(popval); //Hozzáadunk a projecthez egy És kaput a bekért számú bementtel és eltároljuk az idjét egy segédváltozóba
                            c = new Coordinate(e.getX(), e.getY()); //lekérjük a kattintás koordinátáját
                            AElement el = (AElement) progi.proj.elements.get(i); //eltároljuk a az újonnan létrehozott elemet egy segédváltozóban
                            view.elements.put(c, el); //betesszük az elementview elemjei közé a koordinátával
                            view.c.add(c); //a koordináták közé betesszük a koordinátát
                            view.repaint(); //újrarajzoljuk az elementviewt, hogy megjelenjen az elem.
                        }
                        flag = "IDLE"; //a flaget beállítjuk üresjáratra
                    }
                    if (flag.equals("OR")) { //Teljesen ugyanúgy működik mint az és kapu hozzáadása.
                        pop("Hány bemenete legyen a kapunak? (2-4)");
                        while ((popval < 2 || popval > 4) && popin != null) {
                            pop("A bemenetnek 2 és 4 között kell lennie%");
                        }
                        if (popval != -1) {
                            int i = progi.proj.AddOr(popval);
                            c = new Coordinate(e.getX(), e.getY());
                            AElement el = (AElement) progi.proj.elements.get(i);
                            view.elements.put(c, el);
                            view.c.add(c);
                            view.repaint();
                        }
                        flag = "IDLE";
                    }
                    if (flag.equals("INV")) { //Ha invertert adunk hozzá.
                        int i = progi.proj.AddInverter(); //Hozzáadunk egy invertert a projecthez, az id-jét eltároljuk egy segédváltozóba.
                        c = new Coordinate(e.getX(), e.getY()); //A kattintás koordinátáját eltároljuk egy segédváltozóba.
                        AElement el = (AElement) progi.proj.elements.get(i); //Az elemet eltároljuk egy segédbe
                        view.elements.put(c, el); //hozzáaadjuk ez elementviewhoz a koordináta-elem párost
                        view.c.add(c); //A koordinátát hozzáadjuk az elementview koordináta listájához.
                        view.repaint(); //újrarajzoljuk az ElementViewt hogy megjelenjen a változás.

                        flag = "IDLE"; //A flaget visszaállítjuk üresjáratra.
                    }
                    if (flag.equals("F0")) { //Ugyanúgy működik, mint az inverter
                        int i = progi.proj.AddFix0();
                        c = new Coordinate(e.getX(), e.getY());
                        AElement el = (AElement) progi.proj.elements.get(i);
                        view.elements.put(c, el);
                        view.c.add(c);
                        view.repaint();
                        el = null;
                        flag = "IDLE";
                    }
                    if (flag.equals("F1")) { //Ugyanúgy működik, mint az inverter
                        int i = progi.proj.AddFix1();
                        c = new Coordinate(e.getX(), e.getY());
                        AElement el = (AElement) progi.proj.elements.get(i);
                        view.elements.put(c, el);
                        view.c.add(c);
                        view.repaint();
                        el = null;
                        flag = "IDLE";
                    }
                    if (flag.equals("GEN")) { //Generátor hozzáadása.
                        pop("Mi legyen a generatorban? (01110)"); //Bekérjük a shiftelgetni kívánt jelsorozatot.
                        int[] rate = new int[popin.length()]; //eltároljuk egy tömbbe egyesével a a bekért értékeket
                        for (int i = 0; i < popin.length(); i++) {
                            try {
                                rate[i] = Character.digit(popin.charAt(i), 10);
                                if (rate[i] > 1 || rate[i] < 0) { //ha nem 0 vagy 1 szám szerepel akkor hibát dob
                                    throw new Exception();
                                }
                            } catch (Exception exc) {
                                JOptionPane.showMessageDialog(null, "0 vagy 1 számok szerepelhetnek csak!", "HIBA", 1);
                                return;
                            }
                        }

                        int i = progi.proj.AddGenerator(rate); //hozzáadunk egy generátort az előbb létrehozott tömbbel paraméterezve a projekthez
                        c = new Coordinate(e.getX(), e.getY()); //lekérjük a kattintás koordinátáját
                        AElement el = (AElement) progi.proj.elements.get(i); //lekérjük a generátorra mutató referenciát
                        view.elements.put(c, el); //eltároljuk az elemk között
                        view.c.add(c); //a koordinátát hozzáadjuk az ElementView koordináta listájához
                        view.repaint(); //újrarazoljuk az ElementView-t.

                        flag = "IDLE"; //Üresjáratba állítjuk a flaget.
                    }
                    if (flag.equals("COMP")) { //Ugyanúgy működik, mint az inverter.
                        int i = progi.proj.AddComposite();
                        c = new Coordinate(e.getX(), e.getY());
                        AElement el = (AElement) progi.proj.elements.get(i);
                        view.elements.put(c, el);
                        view.c.add(c);
                        view.repaint();

                        flag = "IDLE";
                    }
                    if (flag.equals("LED")) { //Ugyanúgy működik, mint az Inverter
                        int i = progi.proj.AddLed();
                        c = new Coordinate(e.getX(), e.getY());
                        AElement el = (AElement) progi.proj.elements.get(i);
                        view.elements.put(c, el);
                        view.c.add(c);
                        view.repaint();

                        flag = "IDLE";
                    }
                    if (flag.equals("OSC")) { //Úgyanúgy működik, mint a Led
                        int i = progi.proj.AddOscilloscope();
                        c = new Coordinate(e.getX(), e.getY());
                        AElement el = (AElement) progi.proj.elements.get(i);
                        view.elements.put(c, el);
                        view.c.add(c);
                        view.repaint();

                        flag = "IDLE";
                    }

                    if (flag.equals("DEL")) { //Egy elem törlése


                        el = null;
                        c = new Coordinate(e.getX(), e.getY()); //Lekérjük a kattintás koordinátáját.
                        Coordinate cor = new Coordinate(0, 0); //Létrehozunk egy segédkoordinátát.
                        int i = 0;
                        boolean found = false;
                        while (i < view.c.size() && !found) { //Végigmegyünk az ElementView elements Mapján és ha benne található a Mapban a kattintás koordinátájánál elem, akkor eltároljuk
                            cor = view.c.get(i);
                            if (cor.equal(c)) {
//                                System.out.println(cor.equal(c));
                                found = true;
                                el = view.elements.get(cor);
                            }
                             i++;

                        }
                        Coordinate cord = new Coordinate(0, 0); //Létrehozunk egy segédkoordinátát
                        if (el != null) { //Ha nem találtunk elemet akkor nem csinálunk semmit.
                            if (el.toString().equals("And") || el.toString().equals("Or") || el.toString().equals("Inverter")) //Ha és kapu, Or vagy Inverter a kattintott elem akkor
                            {
                                AGate gt = (AGate) el; //átkasztoljuk AGate-té

                                cord.setX(cor.getX() + 50); //A segédváltozót beállítjuk a kimeneti pinjéhez.
                                cord.setY(cor.getY() + 25);
                                DeleteWireFromView(cord); //Töröljük a kimeneti pinhez tartozó vezetéket.
                                
                                if (gt.getInputnum() == 1) { //Ha 1 bemenete van, akkor töröljük a bemenethez tartozó vezetéket
                                    cord.setX(cor.getX()); //Az X koordináta megyegyezik az elem X koordinátájával
                                    cord.setY(cor.getY() + 25); //az Y pedig 25-el több, mint az elemével, mivel 1 bemenetnél középpen van.
                                    DeleteWireFromView(cord); //meghívjuk a vezeték törlés fv-t a kapott koordinátával.
                                }
                                if (gt.getInputnum() == 2) { //Ha 2 bemenete van, akkor töröljük a bemeneteihez tartozó vezetékeket.
                                    cord.setX(cor.getX()); //Az X koordináta a kapu X koordinátája.
                                    cord.setY(cor.getY() + 12); //Az első láb Y koordinátája.
                                    DeleteWireFromView(cord);

                                    cord.setX(cor.getX());
                                    cord.setY(cor.getY() + 37); //A 2. lába Y koordinátája.
                                    DeleteWireFromView(cord);

                                    

                                }
                                if (gt.getInputnum() == 3) {
                                    cord.setX(cor.getX());
                                    cord.setY(cor.getY() + 12); //Az első láb
                                    DeleteWireFromView(cord);

                                    cord.setX(cor.getX());
                                    cord.setY(cor.getY() + 25); //A második láb
                                    DeleteWireFromView(cord);
//

                                    cord.setX(cor.getX());
                                    cord.setY(cor.getY() + 37); //A harmadik láb
                                    DeleteWireFromView(cord);


                                }
                                if (gt.getInputnum() == 4) {

                                    cord.setX(cor.getX());
                                    cord.setY(cor.getY()); //Az első láb
                                    DeleteWireFromView(cord);

                                    cord.setX(cor.getX());
                                    cord.setY(cor.getY() + 12); //A második láb
                                    DeleteWireFromView(cord);

                                    
                                    cord.setX(cor.getX());
                                    cord.setY(cor.getY() + 25); //A harmadik láb
                                    DeleteWireFromView(cord);

                                    cord.setX(cor.getX());
                                    cord.setY(cor.getY() + 37); //A 4. láb
                                    DeleteWireFromView(cord);

                                    cord.setX(cor.getX());
                                    cord.setY(cor.getY() + 50);
                                    DeleteWireFromView(cord);

                                   

                                }
                                                               
                            }
                            if (el.toString().equals("Led0") ||el.toString().equals("Led1") || el.toString().equals("Oscilloscope")) //Ha led vagy oscilloszkóp van rákötve
                            {
                                AGate gt = (AGate) el;

                                cord.setX(cor.getX()); //Töröljük a bemeneti vezetéket
                                cord.setY(cor.getY()+25);
                                DeleteWireFromView(cord);
                             }
                            if (el.toString().equals("Fix1") || el.toString().equals("Fix0") || el.toString().equals("Generator1")|| el.toString().equals("Switch0")|| el.toString().equals("Switch1") || el.toString().equals("Generator2") || el.toString().equals("Generator3") || el.toString().equals("Generator4") || el.toString().equals("Generator5"))
                            {
                                //Ha Fix1, Fix0, Kapcsoló vagy generátor.
                                cord.setX(cor.getX()+50); //Töröljük a kimenetének a vezetékét
                                cord.setY(cor.getY()+25);
                                DeleteWireFromView(cord);
                            }
                            }
                                progi.proj.elements.get(el.ID).Delete(); //töröljük az elemet
                                progi.proj.elements.remove(el.ID); //az elemet töröljük a listából
                                view.elements.remove(cor); //az ElemenViewből is töröljük
                                view.c.remove(cor); //a koordinátáját is töröljük
                                view.repaint(); //Újrafestjük a panelt, hogy eltűnjön a képernyőről
                                flag = "IDLE"; //beállítjuk a flaget üresejáratra
                            
                       }
                       
                   



                    if (flag.equals("SW")) { //Ugyanaz, mint az Inverter hozzáadása
                        int i = progi.proj.AddSwitch();
                        c = new Coordinate(e.getX(), e.getY());
                        AElement el = (AElement) progi.proj.elements.get(i);
                        view.elements.put(c, el);
                        view.c.add(c);
                        view.repaint();
                        flag = "IDLE";
                    }

                }
            }
        });

    }

    public void actionPerformed(ActionEvent e) { //A gombnyomások kezelése
        JButton tmp = (JButton) e.getSource(); //Lekérdezzük, hogy melyik gombot nyomtuk le

        if (tmp.getText().equals("And")) { //Ha az And gombot nyomtuk meg
            if (!flag.equals("RUNNING")) { //és nem fut a szimuláció
                flag = "AND";              //akkor beállítjuk a flaget "AND"-re
            }

        } else if (tmp.getText().equals("Or")) { //Lsd.: and
            if (!flag.equals("RUNNING")) {
                flag = "OR";
            }

        } else if (tmp.getText().equals("Inverter")) { //Lsd.: and
            if (!flag.equals("RUNNING")) {
                flag = "INV";
            }

        } else if (tmp.getText().equals("Fix0")) { //Lsd.: and
            if (!flag.equals("RUNNING")) {
                flag = "F0";
            }

        } else if (tmp.getText().equals("Fix1")) { //Lsd.: and
            if (!flag.equals("RUNNING")) {
                flag = "F1";
            }

        } else if (tmp.getText().equals("Generator")) { //Lsd.: and
            if (!flag.equals("RUNNING")) {
                flag = "GEN";
            }

        } else if (tmp.getText().equals("NewProject")) { //Ha az új projectet nyomjuk meg
            if (!flag.equals("RUNNING")) {              //és nem fut a szimuláció
                
                view.wires.clear();                     //töröljük a vezetékeket a viewról
                view.elements.clear();                  //töröljük az elemeket a viewról
                view.c.clear();                         //töröljük a koordinátákat a viewról
                progi.NewProject();                     //új projectet hozunk létre
                view.repaint();                         //újrafestjük a viewt
            }

        } else if (tmp.getText().equals("Save")) { //Ha a Save gombot nyomjuk meg
            if (!flag.equals("RUNNING")) {         //és nem fut a szimuláció
                fc.setDialogType(JFileChooser.SAVE_DIALOG); //megnyitunk egy filechoosert
                int returnVal = fc.showSaveDialog(ProgramController.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile(); //eltároljuk a választott fájlt
                    save(file); //meghívjuk a save fv-t a választott fájllal.
                }
            }
        } else if (tmp.getText().equals("Load")) { //ugyanaz, mint a save, csak itt letöröljük a képernyő, mint a NewProjectnél
                
            if (!flag.equals("RUNNING")) {
                view.wires.clear();
                view.elements.clear();
                view.c.clear();
                int returnVal = fc.showOpenDialog(ProgramController.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    load(file);
                }

            }
        } else if (tmp.getText().equals("Composite")) { //Lsd.: and
            if (!flag.equals("RUNNING")) {
                flag = "COMP";
            }

        } else if (tmp.getText().equals("Led")) { //Lsd.: and
            if (!flag.equals("RUNNING")) {
                flag = "LED";
            }

        } else if (tmp.getText().equals("Oscilloscope")) {//Lsd.: and
            if (!flag.equals("RUNNING")) {
                flag = "OSC";
            }

        } else if (tmp.getText().equals("Wire")) { //Ha a Wire gombra kattintunk

            if (!flag.equals("RUNNING")) { //és nem fut a program
                int w1, w2, w3, w4 = 0; //segédválzotók
                popin = null;
                pop("A forrás IDje:"); //bekérjük a forrás id-jét
                if (popin == null) { //ha Cancel-t nyomunk kilép
                    return;
                }
                w3 = popval; //a w3 a forrás idje lesz

                Collection ids = progi.proj.elements.keySet(); //eltároljuk az elemek id-jét egy Setben

                while (!ids.contains(w3)) { //ha nincs benne a w3 az id-k között (nincs ilyen id-jű elem
                    pop("Nincs ilyen IDjű elem!"); //újra bekérjük
                    w3 = popval;
                    if (popin == null) {
                    return;}
                }
                w4 = 0; //Ugyanaz, mint a forrás idjének bekérése.
                pop("A Cél IDje:");
                if (popin == null) {
                    return;}
                w1 = popval;
                while (!ids.contains(w1)) {
                    pop("Nincs ilyen IDjű elem!");
                    if (popin == null) {
                    return;
                }
                    w1 = popval;
                }
                popval = -1;
                pop("A Cél melyik lábához akarod kötni?:"); //Bekérjük a felhasználótól a láb idjét
                if (popin == null) {
                    return;}
                w2 = popval;
                AGate g = (AGate) progi.proj.elements.get(w1);
                while (popval < 0 || popval > g.getInputnum()) { //Ha 0-nál kisebb és a kapu méreténél nagyonn számot adunk meg
                    if (popin == null) {
                    return;
                }
                    pop("Nincs ilyen IDjű láb!"); //újra bekéri a láb idjét
                    w2 = popval;
                    if (popin == null) {
                    return;}
                }

                if (g.pinIsUsed(w2)){ //ha a bekért idjű láb már használt.
                    JOptionPane.showMessageDialog(null, "Az a láb már foglalt", "Error", JOptionPane.ERROR_MESSAGE); //hibaüzenetet dob és kilép
                    return;
                }

                progi.proj.AddWire(w1, w2, w3, w4); //hozzáadjuk a vezetéket a projekthez
                AddWireToView(w1, w2, w3, w4); //hozzáadjuk a vezetéket a viewhoz
                

                view.repaint(); //újrafestjük a viewt hogy megjelenjen a vezeték
                flag = "IDLE"; //a flag üresjáratra állítjuk
               
            }
        } else if (tmp.getText().equals("Delete")) { //Lsd.: and
            if (!flag.equals("RUNNING")) {
                flag = "DEL";
            }
        } else if (tmp.getText().equals("Switch")) { //Lsd.: and
            if (!flag.equals("RUNNING")) {
                flag = "SW";
            }
        } else if (tmp.getText().equals("Start")) { //Ha a Startra kattintunk
            if (!flag.equals("RUNNING")) {          // és még nem fut
                if (!progi.proj.Start()){ //meghívjuk a project Start fvét, ha ez hamissal tér vissza, akkor van lógó bemenet
                    JOptionPane.showMessageDialog(null, "Nincs minden bemenet használatban!", "Error", 0); //és dob egy hibaüzenetet, majd kilép
                    flag = "IDLE";
                    return;
                }
                progi.t.start(); //elindítja a szimulációt
                view.repaint();
                flag = "RUNNING";
                
            }

        } else if (tmp.getText().equals("Stop")) { //Lsd.: and
            progi.t.stop();
            flag = "IDLE";
        } else if (tmp.getText().equals("Setfreq")) { //A SetFreq gomb megnyomására
            freqi();                                  //meghívja a freqi() fv-t
        }
    
    }
    public void pop(String s) { //A popupwindowt kezelő fv
        popval = -1;
        popin = JOptionPane.showInputDialog(null, s); //megjelenít egy a paraméterül adott szövegű popupwindowt
        if (popin != null) { //ha nem Cancel-t nyomtunk
            try {
                popval = Integer.valueOf(popin); //beállítja a popvalt
            } catch (Exception ex) { //ha betűt írtunk
                pop("Számot kell beírni!"); //bekéri újra az adatokat
            }
        }
    }

    public void load(File f) { //betöltés fv.
        progi.NewProject();
        view.elements.clear();
        view.c.clear();
        view.repaint();
        try {
            FileReader fr = new FileReader(f); //Soronként végigmegy a beolvasott fájlon
            BufferedReader in = new BufferedReader(fr);   
            String sor = new String();
            while ((sor = in.readLine()) != null) {
                String darabolt[] = sor.split(" ");
                int count = darabolt.length;
                String param[] = new String[count - 1];
                for (int i = 0; i
                        < count - 1; i++) {
                    param[i] = darabolt[i + 1];
                }
               for(int i =0; i<count-1; i++) System.out.println(param[i]);
                Command cmd = new Command(progi.proj, darabolt[0], param, view, this); //létrehoz egy Command példányt
                cmd.run(); //lefuttatja
            }

            in.close(); //bezárja a fájlt
        } catch (Exception e) // EOFException elkapása
        {

        }
    }
    public static String newline = System.getProperty("line.separator");

    public void save(File f) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(f.getPath()));
            Iterator it = view.c.iterator(); //beállít egy iterátort a koordinátákra
            String command = ""; //létrehoz egy parancsot
            while (it.hasNext()) {
                Coordinate cord = (Coordinate) it.next();
                AElement elem = view.elements.get(cord);
                command += elem.toFile1();
                command += cord;
                command += elem.toFile2();
                System.out.println(cord);
                command += newline;
                out.write(command);
                command = "";
            }
            for (int i = 0; i
                    < progi.proj.wires.size(); i++) {
                out.write(progi.proj.wires.get(i).toString() + newline);
            }
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ProgramController.class.getName()).log(Level.SEVERE, null, ex);
        }
 }

    public void freqi() {
        int freqi = 0;
        popin = JOptionPane.showInputDialog(null, "Hány millisecenként legyen órajel?");
        if (popin != null) {
            try {
                freqi = Integer.valueOf(popin);
            } catch (Exception ex) {
                freqi();
            }
        }
        System.out.println(freqi);
        progi.SetFreq(freqi);
    }

    public void AddWireToView(int w1, int w2, int w3, int w4) {
        el = null;
        Coordinate co = new Coordinate(0, 0);
        Coordinate co2 = new Coordinate(0, 0);
        WireCoordinate wc = new WireCoordinate(0, 0, 0, 0);

        el = progi.proj.elements.get(w3);
        int i = 0;
        boolean found = false;
        while (i < view.c.size() && !found) {
            System.out.println(found);
            co = view.c.get(i);
            if (el == view.elements.get(co)) {
                found = true;
            }
            i++;
        }

        wc.setX2(co.getX() + 50);
        wc.setY2(co.getY() + 25);

        el = progi.proj.elements.get(w1);
        i = 0;
        found = false;
        while (i < view.c.size() && !found) {
            co2 = view.c.get(i);
            if (el == view.elements.get(co2)) {
                found = true;
            }
            i++;
        }
        System.out.println(co2.getX() + " " + co2.getY());
        System.out.println(el);
        AGate gt = (AGate) el;
        wc.setX(co2.getX());
        wc.setX(co2.getX());
        if (gt.getInputnum() == 1) {
            wc.setY(co2.getY() + 25);
        } else if (gt.getInputnum() == 2) {
            if (w2 == 0) {
                wc.setY(co2.getY() + 12);
            }
            if (w2 == 1) {
                wc.setY(co2.getY() + 37);
            }

        } else if (gt.getInputnum() == 3) {
            if (w2 == 0) {
                wc.setY(co2.getY() + 12);
            }
            if (w2 == 1) {
                wc.setY(co2.getY() + 25);
            }
            if (w2 == 2) {
                wc.setY(co2.getY() + 37);
            }
        } else if (gt.getInputnum() == 4) {
            if (w2 == 0) {
                wc.setY(co2.getY());
            }
            if (w2 == 1) {
                wc.setY(co2.getY() + 12);
            }
            if (w2 == 2) {
                wc.setY(co2.getY() + 25);
            }
            if (w2 == 3) {
                wc.setY(co2.getY() + 50);
            }
        }
        view.wires.add(wc);
    }
    public void DeleteWireFromView(Coordinate cord){
        System.out.println("A paraméterül kapott coordináta: "+cord.getX()+" "+cord.getY());

        if (!view.wires.isEmpty()) {
            for (int i = 0; i < view.wires.size(); i++) {
                System.out.println("View coord: " + view.wires.get(i).getX() + " " + view.wires.get(i).getY() + " " + view.wires.get(i).getX2() + " " + view.wires.get(i).getY2());
                if (view.wires.get(i).getX() == cord.getX() && view.wires.get(i).getY() == cord.getY()) {
                    view.wires.remove(i);

                }
            }
        }
        if (!view.wires.isEmpty()) {
            for (int i = 0; i < view.wires.size(); i++) {
                System.out.println("View coord: " + view.wires.get(i).getX() + " " + view.wires.get(i).getY() + " " + view.wires.get(i).getX2() + " " + view.wires.get(i).getY2());
                if (view.wires.get(i).getX2() == cord.getX() && view.wires.get(i).getY2() == cord.getY()) {
                    view.wires.remove(i);

                }
            }
        }
    }
}
