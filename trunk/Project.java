package szlab4_whitespaces;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Project
{

	private Map<Integer,Object> elements;
        //elements.put(ID, new OR(inputnum));           // csak, hogy egybol lassuk
	private int ID;

	public Project()
        {
		System.out.println("Project | Project() | Project konstruktor");
                ID = 0;
                elements = new HashMap<Integer,Object>();
	}

	/**
	 * 
	 * @return 
	 */
	public void AddAnd(int inputnum)
        {
		System.out.println("Project | AddAnd(inputnum) | And kapu letrehozas");
                elements.put(ID, new AND(inputnum));
                ++ID;
	}

	/**
	 * 
	 * @return 
	 */
	public void AddOr(int inputnum)
        {
		System.out.println("Project | AddOr(inputnum) | Or kapu letrehozas");
                elements.put(ID, new OR(inputnum));
                ++ID;
	}

	/**
	 * 
	 * @return 
	 */
	public void AddInverter()
        {
		System.out.println("Project | AddInverter() | Inverter letrehozas");
                elements.put(ID, new Inverter());
                ++ID;
	}

	/**
	 * 
	 * @return 
	 */
	public void AddLed()
        {
		System.out.println("Project | AddLed() | LED letrehozas");
                elements.put(ID, new Led());
                ++ID;
	}

	/**
	 * 
	 * @return 
	 */
	public void AddSwitch()
        {
		System.out.println("Project | AddSwitch() | Switch letrehozas");
                elements.put(ID, new Switch());
                ++ID;
	}



	/**
	 * 
	 * @return 
	 */
	public void AddFix0()
        {
		System.out.println("Project | AddFix0() | Fix0 forras letrehozas");
                elements.put(ID, new Fix0());
                ++ID;
	}

	/**
	 * 
	 * @return 
	 */
	public void AddFix1()
        {
		System.out.println("Project | AddFix1() | Fix1 forras letrehozas");
                elements.put(ID, new Fix1());
                ++ID;
	}

        /**
	 * 
	 * @return 
	 */
        public void AddGenerator(int[] rate)
        {
                System.out.println("Project | AddGenerator(rate) | Generator letrehozas");
                elements.put(ID, new Generator(rate));
                ++ID;
        }

        public void AddWire(int id1, int id2)
        {
                System.out.println("Project | AddWire("+id1+","+id2+") | Wire letrehozas");
                elements.put(ID, new Wire(id1,id2));
                ++ID;
        }
	/**
	 * 
	 * @param e
	 * @return 
	 */
	public void DeleteElement(AElement e)
        {
		throw new UnsupportedOperationException();
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
	 */
	public void Start()
        {
		throw new UnsupportedOperationException();
	}
}