package szlab4_whitespaces;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Project
{

	private Map<Integer,AElement> elements;
        //elements.put(ID, new OR(inputnum));           // csak, hogy egybol lassuk
	private int ID;

	public Project()
        {
		System.out.println("Project | Project() | Project konstruktor");
                ID = 0;
                elements = new HashMap<Integer,AElement>();
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

        public void AddWireGateSource(int GateID, int GatePin, int SourceID, int SourcePin)
        {
                PinIn pin_in;
                PinOut pin_out;
                AGate TmpGate;
                ASource TmpSource;
                System.out.println("WireKonstruktor Kapu eleme: "+elements.get(GateID)+", Forrás eleme: "+elements.get(SourceID) );
                TmpGate = (AGate)elements.get(GateID);
                TmpSource = (ASource)elements.get(SourceID);
                elements.put(ID, new Wire(TmpGate.inputs.get(GatePin), TmpSource.output, ID));
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
j	 */
	public void Start()
        {
		throw new UnsupportedOperationException();
	}
}