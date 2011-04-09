package szlab4_whitespaces;

import java.util.*;

public class Composite extends AGate {
    /*------------------------- Attibutumok -------------------------*/

    public Map<Integer, AElement> elements;                 //elements.put(IDsub, new OR(inputnum));           // csak, hogy egybol lassuk
    private int IDsub;                                      //a sorszámot tároló integer

    /*------------------------- Osztaly kezelo fgv -------------------------*/
    public Composite(int ID) {
        System.out.println("Composite | Composite() | Composite konstruktor");        //kiírat
        ready = true;
        this.ID = ID;
        IDsub = 0;                                          //kezdetben a sorszámot tároló integert 0-ba állítja
        elements = new HashMap<Integer, AElement>();        //egy hashmapet kreál
    }

    public int GetID() {
        System.out.println(this + " | GetID() | CALL");     //kiírat
        return this.ID;                                     //visszaadja az elem sorszámát
    }

    public int GetValue()
    {
        System.out.println(this + " | GetValue() | CALL\n");

        if (!(this.ready)) {
            return value;
        } else {
            this.SetValue();        //meghívja a SetValue függvényét,a mivel beállítja az értékét
            System.out.println(this + " | GetValue() | RETURN\n");
            this.ready = false;
            return value;           //visszaadja a jelenlegi értékét a hívónak
        }
    }

    public void Delete() {                                  //az elem törlő függvénye amely törli a be és kimenő lábakat
        System.out.println(this + " | Delete() | Composite torles fuggvenye ");
        for (int i = 0; i < inputnum; i++) {
            inputs.get(i).Delete();
        }

        for (int i = 0; i < outputnum; i++) {
            outputs.get(i).Delete();
        }
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
        return "Composite" + ID;
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

    /*------------------------- Elemek felvetele, torlese -------------------------*/
    public void AddAnd(int inputnum) // a program azon függvénye, amivel egy AND kaput tudunk létrehozni
    {
        System.out.println("Project | AddAnd(inputnum) | And kapu letrehozas");     //kiírat
        elements.put(IDsub, new AND(inputnum, IDsub));        //kreál egy AND kaput a jelenlegi sorszámmal
        ++IDsub;       //növeli a kiosztott sorszámok értékét
    }

    public void AddComposite() //a program azon függvénye, amivel egy OR kaput kreálhatunk
    {
        System.out.println("Project | AddComposite(inputnum) | Or kapu letrehozas");       //kiírat
        elements.put(ID, new Composite(ID));     //kreál egy OR kaput a jelenlegi sorszámmal
        ++ID;       //növeli a kiosztott sorszámok értékét
    }

    public void AddFix0() //a program azon függvénye, amivel egy Fix0-t kreálhatunk
    {
        System.out.println("Project | AddFix0() | Fix0 forras letrehozas");     //kiírat
        elements.put(IDsub, new Fix0(IDsub));     //kreál egy Fix0-t a jelenlegi sorszámmal
        ++IDsub;       //növeli a kiosztott sorszámok értékét
    }

    public void AddFix1() // a program azon függvénye, amivel egy Fix1-t kreálhatunk
    {
        System.out.println("Project | AddFix1() | Fix1 forras letrehozas");     //kiírat
        elements.put(IDsub, new Fix1(IDsub));     //kreál egy fix1-et a jelenlegi sorszámmal
        ++IDsub;       //növeli a kiosztott sorszámok értékét
    }

    public void AddGenerator(int[] rate) //a program azon függvénye, amivel egy generátort kreálhatunk
    {
        System.out.println("Project | AddGenerator(rate) | Generator letrehozas");      //kiírat
        elements.put(IDsub, new Generator(rate, IDsub));      //kreál egy generátort a jelenlegi sorszámmal, és azzal a számsorral, ami majd a generátorban fog váltakozni
        ++IDsub;       //növeli a sorszám értékét
    }

    public void AddInverter() // a program azon függvénye, amivel egy invertert kreálhatunk
    {
        System.out.println("Project | AddInverter() | Inverter letrehozas");        //kiírat
        elements.put(IDsub, new Inverter(IDsub));     //kreál egy Invertert, a jelenlegi sorszámmal
        ++IDsub;       //növeli a kiosztott sorszámok értékét
    }

    public void AddOr(int inputnum) //a program azon függvénye, amivel egy OR kaput kreálhatunk
    {
        System.out.println("Project | AddOr(inputnum) | Or kapu letrehozas");       //kiírat
        elements.put(IDsub, new OR(inputnum, IDsub));     //kreál egy OR kaput a jelenlegi sorszámmal
        ++IDsub;       //növeli a kiosztott sorszámok értékét
    }

    public void AddSwitch() //a program azon függvénye amivel egy Switch-et kreálhatunk
    {
        System.out.println("Project | AddSwitch() | Switch letrehozas");        //kiírat
        elements.put(IDsub, new Switch(IDsub));       //kreál egy switchet a jelenlegi sorszámmal
        ++IDsub;          //növeli a kiosztott sorszámok értékét
    }

    public void AddWire(int Gate1ID, int Gate1Pin, int Element2ID, int Element2Pin) // a program azon függvénye, amivel Wire-vel köthetünk össze két elemet
    {
        AGate TmpGate1;
        AElement TmpGate2;

        System.out.println("AddWire Kapu1 elem: " + elements.get(Gate1ID) + ", Kapu2 elem: " + elements.get(Element2ID));
        TmpGate1 = (AGate) elements.get(Gate1ID);
        TmpGate2 = elements.get(Element2ID);

        Wire tmp = new Wire(TmpGate1.inputs.get(Gate1Pin), TmpGate2.outputs.get(Element2Pin), ID);
        elements.put(ID, tmp);
        TmpGate1.inputs.get(Gate1Pin).SetWire(tmp);
        TmpGate2.outputs.get(Element2Pin).SetWire(ID, tmp);
        ++ID;
    }

    public void DeleteElement(int id) //a program törlés függvénye
    {
        System.out.println("DeleteItem: " + elements.get(id));     //kiírat
        elements.get(id).Delete();       //meghívja a törölni kívánt elem törlő függvényét
    }
}

/*------------------------- Osztaly vege -------------------------*/
