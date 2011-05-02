package szlab4_whitespaces;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class ProgramController extends JPanel implements ActionListener {

    private ElementView view;
    private Program progi;
    private String flag;
    private Coordinate c;
    private AElement el;
    private JFileChooser fc;
    private Dialog dial;
    private int popval;
    private String popin;

    public ProgramController(ElementView v) {


        fc = new JFileChooser();
        c = new Coordinate(0, 0);
        view = v;
        progi = new Program();
        progi.view = view;
        progi.NewProject();
        flag = "IDLE";
        view.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (flag.equals("AND")) {

                    pop("Hány bemenete legyen a kapunak? (2-4)");
                    while ((popval < 2 || popval > 4) && popin != null) {
                        pop("A bemenetnek 2 és 4 között kell lennie");
                    }
                    if (popval != -1) {
                        int i = progi.proj.AddAnd(popval);
                        c = new Coordinate(e.getX(), e.getY());
                        AElement el = (AElement) progi.proj.elements.get(i);
                        view.elements.put(c, el);
                        view.c.add(c);
                        view.repaint();
                    }
                    flag = "IDLE";
                }
                if (flag.equals("OR")) {
                    pop("Hány bemenete legyen a kapunak? (2-4)");
                    while ((popval < 2 || popval > 4) && popin != null) {
                        pop("A bemenetnek 2 és 4 között kell lennie");
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
                if (flag.equals("INV")) {
                    int i = progi.proj.AddInverter();
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.c.add(c);
                    view.repaint();

                    flag = "IDLE";
                }
                if (flag.equals("F0")) {
                    int i = progi.proj.AddFix0();
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.c.add(c);
                    view.repaint();
                    el = null;
                    flag = "IDLE";
                }
                if (flag.equals("F1")) {
                    int i = progi.proj.AddFix1();
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.c.add(c);
                    view.repaint();
                    el = null;
                    flag = "IDLE";
                }
                if (flag.equals("GEN")) {
                    int[] rate = {0, 1}; // majd meg kell írni a beolvasását valahogy
                    int i = progi.proj.AddGenerator(rate);
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.c.add(c);
                    view.repaint();

                    flag = "IDLE";
                }
                if (flag.equals("COMP")) {
                    int i = progi.proj.AddComposite();
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.c.add(c);
                    view.repaint();

                    flag = "IDLE";
                }
                if (flag.equals("LED")) {
                    int i = progi.proj.AddLed();
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.c.add(c);
                    view.repaint();

                    flag = "IDLE";
                }
                if (flag.equals("OSC")) {
                    int i = progi.proj.AddOscilloscope();
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.c.add(c);
                    view.repaint();

                    flag = "IDLE";
                }
                if (flag.equals("WIRE1")) {
                    //valahogy be kell, majd olvasni a Canvasról, hogy melyik kapura kattintok (ez lesz a forrás)
                    //el kell tárolni az első kattintás kapuját, és bekérni a láb számát
                    flag = "WIRE2";

                }
                if (flag.equals("WIRE2")) {
                    //második kattintás kapuját el kell tárolni (ez lesz a cél)
                    //be kell kérni a láb számát
                    // a két kapuval meg a 2 lábbal meg kell hívni az AddWire-t és eltárolni, a view hasmapjában is
                    flag = "IDLE";

                }
                if (flag.equals("DEL")) {
                    // be kell olvasni, hogy hova kattintottunk és kijelölni azt az elemet, majd meghívni rá a Delete() fv-t
                    // majd ezt is kitaláljuk.
                    flag = "IDLE";
                }
                if (flag.equals("SW")) {
                    int i = progi.proj.AddSwitch();
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.c.add(c);
                    view.repaint();
                    flag = "IDLE";
                }
                if (flag.equals("IDLE")) {
                    System.out.println(e.getX() + "  " + e.getY());
                }
                if (flag.equals("GRAB")) {
                    //majd..
                }





            }
        });

    }

    public void actionPerformed(ActionEvent e) {
        JButton tmp = (JButton) e.getSource();

        if (tmp.getText().equals("And")) {
            flag = "AND";
        } else if (tmp.getText().equals("Or")) {
            flag = "OR";
        } else if (tmp.getText().equals("Inverter")) {
            flag = "INV";
        } else if (tmp.getText().equals("Fix0")) {
            flag = "F0";
        } else if (tmp.getText().equals("Fix1")) {
            flag = "F1";
        } else if (tmp.getText().equals("Generator")) {
            flag = "GEN";
        } else if (tmp.getText().equals("NewProject")) {
            view.elements.clear();
            view.c.clear();
            view.wires.clear();
            progi.NewProject();
            view.repaint();
        } else if (tmp.getText().equals("Save")) {
            fc.setDialogType(JFileChooser.SAVE_DIALOG);
            int returnVal = fc.showSaveDialog(ProgramController.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                save(file);
            }
        } else if (tmp.getText().equals("Load")) {
            int returnVal = fc.showOpenDialog(ProgramController.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                load(file);
            }

        } else if (tmp.getText().equals("Composite")) {
            flag = "COMP";
        } else if (tmp.getText().equals("Led")) {
            flag = "LED";
        } else if (tmp.getText().equals("Start")) {
            progi.t.start();
            view.repaint();
        } else if (tmp.getText().equals("Stop")) {
            progi.t.stop();
        } else if (tmp.getText().equals("Setfreq")) {
            freqi();
        } else if (tmp.getText().equals("Oscilloscope")) {
            flag = "OSC";
        } else if (tmp.getText().equals("Wire")) {

            el = null;
            Coordinate co = new Coordinate(0, 0);
            Coordinate co2 = new Coordinate(0, 0);
            WireCoordinate wc = new WireCoordinate(0, 0, 0, 0);
           
            int w1, w2, w3, w4 = 0;
            popin = null;
            pop("A forrás IDje:");
            if (popin == null) {
                return;
            }
            w3 = popval;
            Collection ids = progi.proj.elements.keySet();
            while (!ids.contains(w3) || popin == null) {
                pop("Nincs ilyen IDjű elem!");
                w3 = popval;
            }
            
            w4 = 0;
            pop("A Cél IDje:");
            w1 = popval;
            while (!ids.contains(w1) || popin == null) {
                pop("Nincs ilyen IDjű elem!");
                w1 = popval;
            }
            System.out.println(popval);
            popval = -1;
            pop("A Cél melyik lábához akarod kötni?:");

            w2 = popval;
            AGate g = (AGate) progi.proj.elements.get(w1);
            while (popval < 0 || popval > g.getInputnum() || popin == null) {
                pop("Nincs ilyen IDjű láb!");
                w2 = popval;
            }
            System.out.println(popval);
            progi.proj.AddWire(w1, w2, w3, w4);
            
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
            System.out.println(co2.getX()+" "+co2.getY());
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
            System.out.println(wc.getX()+" "+ wc.getY()+" "+wc.getX2()+" "+wc.getY2());
            view.repaint();
            flag = "IDLE";
            return;
        } else if (tmp.getText().equals("Delete")) {
            flag = "DEL";
        } else if (tmp.getText().equals("Switch")) {
            flag = "SW";
        }

    }

    public void pop(String s) {
        popval = -1;
        popin = JOptionPane.showInputDialog(null, s);
        if (popin != null) {
            try {
                popval = Integer.valueOf(popin);
            } catch (Exception ex) {
                pop("Számot kell beírni!");
            }
        }
    }

    public void load(File f) {
        progi.NewProject();
        view.elements.clear();
        view.c.clear();
        view.repaint();
        try {
            FileReader fr = new FileReader(f);
            BufferedReader in = new BufferedReader(fr);   //beolvasandó fájl megadása
            String sor = new String();
            while ((sor = in.readLine()) != null) {
                String darabolt[] = sor.split(" ");
                int count = darabolt.length;
                String param[] = new String[count - 1];
                for (int i = 0; i < count - 1; i++) {
                    param[i] = darabolt[i + 1];
                }
//                for(int i =0; i<count-1; i++) System.out.println(param[i]);
                Command cmd = new Command(progi.proj, darabolt[0], param, view);
                cmd.run();
            }
            in.close();
        } catch (Exception e) // EOFException elkapása
        {
            System.out.println("A fájl beolvasása végetért!");
        }
    }
    public static String newline = System.getProperty("line.separator");

    public void save(File f) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(f.getPath()));
            Iterator it = view.c.iterator();
            String command = "";
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
}
