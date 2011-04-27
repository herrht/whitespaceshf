package szlab4_whitespaces;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;



public class Project {
    /*------------------------- Attibutumok -------------------------*/

    public Map<Integer, AElement> elements;                 //elements.put(ID, new OR(inputnum));           // csak, hogy egybol lassuk
    private int freq;
    private int ID;                                         //a sorszámot tároló integer
    private Set<Integer> setOfLeds;
    private Set<Integer> setOfGenerators;
    private Map<Integer, Composite> composites;
    /*------------------------- Osztaly kezelo fgv -------------------------*/

    public Project() {
//       System.out.println("Project | Project() | Project konstruktor");        //kiírat
        this.ID = 0;                                             //kezdetben a sorszámot tároló integert 0-ba állítja
        this.elements = new HashMap<Integer, AElement>();        //egy hashmapet kreál
        this.setOfLeds = new HashSet<Integer>();                 //egy hashsetet kreál
        this.composites = new HashMap<Integer, Composite>();                 //egy hashsetet kreál
        this.setOfGenerators = new HashSet<Integer>();          //egy hashsetet kreál
    }

    public void SetFreq(int newFreq)    // Frekvenciát állítjuk be
    {
        this.freq = newFreq;            // Paraméterben kapott értéket eltároljuk
    }

    public void Start()                 // A project start függvénye: a szimuláció
    {
        // if (óraütés) && (!stop), akkor:
        this.Simulation();
        //else wait/return
    }

    public void Stop()                  // A project Stop függvénye: a szimuláció
    {
        // Leállítja a szimulációt (a Start függvény ne fusson tovább)
    }

    public int Simulation() //a project start függvénye: a szimuláció
    {
//        System.out.println("Project | start() | szimuláció indítása");      //kiírat

        Set<Map.Entry<Integer, AElement>> set = elements.entrySet();
        for (Map.Entry<Integer, AElement> me : set) {
            me.getValue().SetReady();
        }

        Iterator it = this.setOfLeds.iterator();
        while (it.hasNext()) //a ledekre meghívja a SetValue függvényt
        {
            int tmp = (Integer) it.next();
            elements.get(tmp).SetValue();
        }
        it = this.setOfGenerators.iterator();
        while (it.hasNext()) //a generátorokra meghívja a Shift() fgvnyt
        {
            int tmp = (Integer) it.next();
            elements.get(tmp).SetValue();
        }
        return 1;
    }

    /*------------------------- Elemek torles, listazas -------------------------*/
    public void DeleteElement(int id) //a program törlés függvénye
    {
        System.out.println("DeleteItem: " + elements.get(id));     //kiírat
        elements.get(id).Delete();       //meghívja a törölni kívánt elem törlő függvényét
        elements.remove(id);
    }

    public void ListElements() //a program törlés függvénye
    {
        System.out.println("Felvett elemek listaja: ");      //kiírat

        Set<Map.Entry<Integer, AElement>> set = elements.entrySet();

        for (Map.Entry<Integer, AElement> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }

    /*------------------------- Kompozit elem szerkesztes -------------------------*/
    public void AddID(Composite c)
    {
        this.composites.put(ID, c);                  //felveszi a Composite elemet a jelenlegi sorszámmal
        ++this.ID;

    }

    //Altalanos kompozit elem szereksztő (id: azonositp, func: muvelet, p1: inpputnum/Gate1ID, p2: Gate1Pin, p3: Gate2ID, p4: Gate2Pin, rate: jelsorozat)
    public void EditComposite(int id, String func, int p1, int p2, int p3, int p4, int[] rate) //a program törlés függvénye
    {
        Composite comp = (Composite) elements.get(id);

        //AddAnd, AddComposite, AddFix0, AddFix1, AddGenerator, AddInverter, AddLed, AddOr, AddSwitch, AddWire, DeleteElement

        if (func.equals("AddAnd"))
        {
            System.out.println("AddAnd");
            comp.AddAnd(p1);
        }else

        if(func.equals("AddComposite"))
        {
            System.out.println("AddComposite");
            comp.AddComposite();
        }else

        if (func.equals("AddFix0"))
        {
            System.out.println("AddFix0");
            comp.AddFix0();
        }else

        if (func.equals("AddFix1"))
        {
            System.out.println("AddFix1");
            comp.AddFix1();
        }else

        if (func.equals("AddGenerator"))
        {
            System.out.println("AddGenerator");
            comp.AddGenerator(rate);
        }else

        if (func.equals("AddInverter"))
        {
            System.out.println("AddInverter");
            comp.AddInverter();
        }else

        if (func.equals("AddOr"))
        {
            System.out.println("AddOr");
            comp.AddOr(p1);
        }else

        if (func.equals("AddSwitch"))
        {
            System.out.println("AddSwitch");
            comp.AddSwitch();
        }else

        if (func.equals("AddWire"))
        {
            System.out.println("AddWire");
            comp.AddWire(p1, p1, p3, p4);
        }else

        if (func.equals("DeleteElement"))
        {
            System.out.println("DeleteElement");
            comp.DeleteElement(p1);
        }
    }


    /*------------------------- Elemek felvetele -------------------------*/
    public int AddAnd(int inputnum) // a program azon függvénye, amivel egy AND kaput tudunk létrehozni
    {
        //System.out.println("Project | AddAnd(inputnum) | And kapu letrehozas");     //kiírat
        elements.put(ID, new AND(inputnum, ID));        //kreál egy AND kaput a jelenlegi sorszámmal
        ++ID;       //növeli a kiosztott sorszámok értékét
        return ID-1;
    }

    public int AddComposite() //a program azon függvénye, amivel egy OR kaput kreálhatunk
    {
        //System.out.println("Project | AddComposite() | Composite elem letrehozas");       //kiírat
        elements.put(ID, new Composite(ID));     //kreál egy Composite elemet a jelenlegi sorszámmal
        //++ID;       //növeli a kiosztott sorszámok értékét
        //nem szükséges, mivel a kopmozit konstruktora állítja be (beágyazás miatt érdekes)
        ++ID;
        return ID-1;
    }

    public int AddFix0() //a program azon függvénye, amivel egy Fix0-t kreálhatunk
    {
        //System.out.println("Project | AddFix0() | Fix0 forras letrehozas");     //kiírat
        elements.put(ID, new Fix0(ID));     //kreál egy Fix0-t a jelenlegi sorszámmal
        ++ID;       //növeli a kiosztott sorszámok értékét
        return ID-1;
    }

    public int AddFix1() // a program azon függvénye, amivel egy Fix1-t kreálhatunk
    {
       // System.out.println("Project | AddFix1() | Fix1 forras letrehozas");     //kiírat
        elements.put(ID, new Fix1(ID));     //kreál egy fix1-et a jelenlegi sorszámmal
        ++ID;       //növeli a kiosztott sorszámok értékét
        return ID-1;
    }

    public int AddGenerator(int[] rate) //a program azon függvénye, amivel egy generátort kreálhatunk
    {
        //System.out.println("Project | AddGenerator(rate) | Generator letrehozas");      //kiírat
        elements.put(ID, new Generator(rate, ID));      //kreál egy generátort a jelenlegi sorszámmal, és azzal a számsorral, ami majd a generátorban fog váltakozni
        setOfGenerators.add(ID);    // generátorok hozzáadása a set-hez
        ++ID;       //növeli a sorszám értékét
        return ID-1;
    }

    public int AddInverter() // a program azon függvénye, amivel egy invertert kreálhatunk
    {
//        System.out.println("Project | AddInverter() | Inverter letrehozas");        //kiírat
        elements.put(ID, new Inverter(ID));     //kreál egy Invertert, a jelenlegi sorszámmal
        ++ID;       //növeli a kiosztott sorszámok értékét
        return ID-1;
    }

    public int AddLed() //a program azon függvénye, amivel egy Ledet kreálhatunk
    {
//        System.out.println("Project | AddLed() | LED letrehozas");      //kiírat
        elements.put(ID, new Led(ID));      //kreál egy Led-et a jelenlegi sorszámmal
        setOfLeds.add(ID);
        ++ID;       //növeli a kiosztott sorszámok értékét
        return ID-1;
    }

    public int AddOr(int inputnum) //a program azon függvénye, amivel egy OR kaput kreálhatunk
    {
//        System.out.println("Project | AddOr(inputnum) | Or kapu letrehozas");       //kiírat
        elements.put(ID, new OR(inputnum, ID));     //kreál egy OR kaput a jelenlegi sorszámmal
        ++ID;       //növeli a kiosztott sorszámok értékét
        return ID-1;
    }

    public int AddOscilliscope() //a program azon függvénye, amivel egy Oszcilloszkópot kreálhatunk
    {
//        System.out.println("Project | AddOscilloscope() | Oszcilloszkóp letrehozas");      //kiírat
        elements.put(ID, new Oscilloscope(ID));      //kreál egy Led-et a jelenlegi sorszámmal
        setOfLeds.add(ID);
        ++ID;       //növeli a kiosztott sorszámok értékét
        return ID-1;
    }

    public int AddSwitch() //a program azon függvénye amivel egy Switch-et kreálhatunk
    {
//        System.out.println("Project | AddSwitch() | Switch letrehozas");        //kiírat
        elements.put(ID, new Switch(ID));       //kreál egy switchet a jelenlegi sorszámmal
        ++ID;          //növeli a kiosztott sorszámok értékét
        return ID-1;
    }

    public int AddWire(int Gate1ID, int Gate1Pin, int Element2ID, int Element2Pin) // a program azon függvénye, amivel Wire-vel köthetünk össze két elemet
    {
        AGate TmpGate1;
        AElement TmpGate2;

//        System.out.println("AddWire Kapu1 elem: " + elements.get(Gate1ID) + ", Kapu2 elem: " + elements.get(Element2ID));
        TmpGate1 = (AGate) elements.get(Gate1ID);
        TmpGate2 = elements.get(Element2ID);

        Wire tmp = new Wire(TmpGate1.inputs.get(Gate1Pin), TmpGate2.outputs.get(Element2Pin), ID);
        elements.put(ID, tmp);
        TmpGate1.inputs.get(Gate1Pin).SetWire(tmp);
        TmpGate2.outputs.get(Element2Pin).SetWire(ID, tmp);
        ++ID;
        return ID-1;
    }

    /*------------------------- Fajlkezelo fgv -------------------------*/
    public void Load(FileReader fr) //a program töltés függvénye
    {
        throw new UnsupportedOperationException();
    }

    public void Save(FileWriter fw) //a program mentés függvénye
    {
        throw new UnsupportedOperationException();
    }
}
/*------------------------- Osztaly vege -------------------------*/
