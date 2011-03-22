package szlab4_whitespaces;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Project
{

	public Map<Integer,AElement> elements;
        //elements.put(ID, new OR(inputnum));           // csak, hogy egybol lassuk
	private int ID;     //a sorszámot tároló integer
        private Set<Integer> setOfLeds;

	public Project()
        {
		System.out.println("Project | Project() | Project konstruktor");        //kiírat
                ID = 0;     //kezdetben a sorszámot tároló integert 0-ba állítja
                elements = new HashMap<Integer,AElement>();     //egy hashmapet kreál
                setOfLeds = new HashSet<Integer>();     //egy hashsetet kreál
	}

	/**
	 * 
	 * @return 
	 */
	public void AddAnd(int inputnum)        // a program azon függvénye, amivel egy AND kaput tudunk létrehozni
        {
		System.out.println("Project | AddAnd(inputnum) | And kapu letrehozas");     //kiírat
                elements.put(ID, new AND(inputnum, ID));        //kreál egy AND kaput a jelenlegi sorszámmal
                ++ID;       //növeli a kiosztott sorszámok értékét
	}

	/**
	 * 
	 * @return 
	 */
	public void AddOr(int inputnum)     //a program azon függvénye, amivel egy OR kaput kreálhatunk
        {
		System.out.println("Project | AddOr(inputnum) | Or kapu letrehozas");       //kiírat
                elements.put(ID, new OR(inputnum, ID));     //kreál egy OR kaput a jelenlegi sorszámmal
                ++ID;       //növeli a kiosztott sorszámok értékét
	}

	/**
	 * 
	 * @return 
	 */
	public void AddInverter()       // a program azon függvénye, amivel egy invertert kreálhatunk
        {
		System.out.println("Project | AddInverter() | Inverter letrehozas");        //kiírat
                elements.put(ID, new Inverter(ID));     //kreál egy Invertert, a jelenlegi sorszámmal
                ++ID;       //növeli a kiosztott sorszámok értékét
	}

	/**
	 * 
	 * @return 
	 */
	public void AddLed()        //a program azon függvénye, amivel egy Ledet kreálhatunk
        {
		System.out.println("Project | AddLed() | LED letrehozas");      //kiírat
                elements.put(ID, new Led(ID));      //kreál egy Led-et a jelenlegi sorszámmal
                setOfLeds.add(ID);
                ++ID;       //növeli a kiosztott sorszámok értékét
	}

	/**
	 * 
	 * @return 
	 */
	public void AddSwitch()     //a program azon függvénye amivel egy Switch-et kreálhatunk
        {
		System.out.println("Project | AddSwitch() | Switch letrehozas");        //kiírat
                elements.put(ID, new Switch(ID));       //kreál egy switchet a jelenlegi sorszámmal
                ++ID;          //növeli a kiosztott sorszámok értékét
	}



	/**
	 * 
	 * @return 
	 */
	public void AddFix0()       //a program azon függvénye, amivel egy Fix0-t kreálhatunk
        {
		System.out.println("Project | AddFix0() | Fix0 forras letrehozas");     //kiírat
                elements.put(ID, new Fix0(ID));     //kreál egy Fix0-t a jelenlegi sorszámmal
                ++ID;       //növeli a kiosztott sorszámok értékét
	}

	/**
	 * 
	 * @return 
	 */
	public void AddFix1()       // a program azon függvénye, amivel egy Fix1-t kreálhatunk
        {
		System.out.println("Project | AddFix1() | Fix1 forras letrehozas");     //kiírat
                elements.put(ID, new Fix1(ID));     //kreál egy fix1-et a jelenlegi sorszámmal
                ++ID;       //növeli a kiosztott sorszámok értékét
	}

        /**
	 * 
	 * @return 
	 */
        public void AddGenerator(int[] rate)        //a program azon függvénye, amivel egy generátort kreálhatunk
        {
                System.out.println("Project | AddGenerator(rate) | Generator letrehozas");      //kiírat
                elements.put(ID, new Generator(rate, ID));      //kreál egy generátort a jelenlegi sorszámmal, és azzal a számsorral, ami majd a generátorban fog váltakozni
                ++ID;       //növeli a sorszám értékét
        }

        public void AddWire(int Gate1ID, int Gate1Pin, int Element2ID)      // a program azon függvénye, amivel Wire-vel köthetünk össze két elemet
        {
                AGate TmpGate1;
                AElement TmpGate2;

                System.out.println("AddWire Kapu1 elem: "+elements.get(Gate1ID)+", Kapu2 elem: "+elements.get(Element2ID) );
                TmpGate1 = (AGate)elements.get(Gate1ID);
                TmpGate2 = elements.get(Element2ID);
                Wire tmp = new Wire(TmpGate1.inputs.get(Gate1Pin), TmpGate2.output, ID);
                elements.put(ID, tmp);
                TmpGate1.inputs.get(Gate1Pin).SetWire(tmp);
                TmpGate2.output.SetWire(tmp);
                System.out.print(TmpGate1.inputs.get(Gate1Pin).elem);
                ++ID;
        }
	/**
	 * 
	 * @param e
	 * @return 
	 */
	public void DeleteElement(int id)       //a program törlés függvénye
        {
               System.out.println("DeleteItem: "+elements.get(id));     //kiírat
               elements.get(id).Delete();       //meghívja a törölni kívánt elem törlő függvényét
	}

	/**
	 * 
	 * @param fw
	 * @return 
	 */
	public void Save(FileWriter fw)     //a program mentés függvénye
        {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fr
	 * @return 
	 */
	public void Load(FileReader fr)     //a program töltés függvénye
        {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
j	 */
	public void Start()     //a project start függvénye: a szimuláció
        {
            System.out.println("Project | start() | szimuláció indítása");      //kiírat
            Iterator it = this.setOfLeds.iterator();
            while (it.hasNext())    //a ledekre meghívja a SetValue függvényt
            {
               int tmp = (Integer)it.next();
               System.out.println();
               this.elements.get(tmp).SetValue();
            }
	}
}
