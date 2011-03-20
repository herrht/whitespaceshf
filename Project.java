package szlab4_whitespaces;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Project
{

	private Map<Integer,AElement> elements;
        //elements.put(ID, new OR(inputnum));           // csak, hogy egybol lassuk
	private int ID;
        private Set<Integer> setOfLeds;

	public Project()
        {
		System.out.println("Project | Project() | Project konstruktor");
                ID = 0;
                elements = new HashMap<Integer,AElement>();
                setOfLeds = new HashSet<Integer>();
	}

	/**
	 * 
	 * @return 
	 */
	public void AddAnd(int inputnum)
        {
		System.out.println("Project | AddAnd(inputnum) | And kapu letrehozas");
                elements.put(ID, new AND(inputnum, ID));
                ++ID;
	}

	/**
	 * 
	 * @return 
	 */
	public void AddOr(int inputnum)
        {
		System.out.println("Project | AddOr(inputnum) | Or kapu letrehozas");
                elements.put(ID, new OR(inputnum, ID));
                ++ID;
	}

	/**
	 * 
	 * @return 
	 */
	public void AddInverter()
        {
		System.out.println("Project | AddInverter() | Inverter letrehozas");
                elements.put(ID, new Inverter(ID));
                ++ID;
	}

	/**
	 * 
	 * @return 
	 */
	public void AddLed()
        {
		System.out.println("Project | AddLed() | LED letrehozas");
                elements.put(ID, new Led(ID));
                setOfLeds.add(ID);
                ++ID;
	}

	/**
	 * 
	 * @return 
	 */
	public void AddSwitch()
        {
		System.out.println("Project | AddSwitch() | Switch letrehozas");
                elements.put(ID, new Switch(ID));
                ++ID;
	}



	/**
	 * 
	 * @return 
	 */
	public void AddFix0()
        {
		System.out.println("Project | AddFix0() | Fix0 forras letrehozas");
                elements.put(ID, new Fix0(ID));
                ++ID;
	}

	/**
	 * 
	 * @return 
	 */
	public void AddFix1()
        {
		System.out.println("Project | AddFix1() | Fix1 forras letrehozas");
                elements.put(ID, new Fix1(ID));
                ++ID;
	}

        /**
	 * 
	 * @return 
	 */
        public void AddGenerator(int[] rate)
        {
                System.out.println("Project | AddGenerator(rate) | Generator letrehozas");
                elements.put(ID, new Generator(rate, ID));
                ++ID;
        }

        public void AddWire(int Gate1ID, int Gate1Pin, int Element2ID)
        {
                AGate TmpGate1;
                AElement TmpGate2;

                System.out.println("AddWire Kapu1 elem: "+elements.get(Gate1ID)+", Kapu2 elem: "+elements.get(Element2ID) );
                TmpGate1 = (AGate)elements.get(Gate1ID);
                TmpGate2 = elements.get(Element2ID);

                elements.put(ID, new Wire(TmpGate1.inputs.get(Gate1Pin), TmpGate2.output, ID));
                ++ID;
        }
	/**
	 * 
	 * @param e
	 * @return 
	 */
	public void DeleteElement(int id)
        {
               System.out.println("DeleteItem: "+elements.get(id));
               elements.get(id).Delete();
	}

	/**
	 * 
	 * @param fw
	 * @return 
	 */
	public void Save(FileWriter fw)
        {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fr
	 * @return 
	 */
	public void Load(FileReader fr)
        {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
j	 */
	public void Start()
        {
            System.out.println("Project | start() | szinuláció indítása");
            Iterator it = this.setOfLeds.iterator();
            while (it.hasNext())
            {
               int tmp = (Integer)it.next();
               this.elements.get(tmp).GetValue();
            }
            System.out.println("Project | start() | szinuláció indítása");
	}
}
