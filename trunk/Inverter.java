package szlab4_whitespaces;

import java.util.*;

public class Inverter extends AGate
{

	public Inverter(int ID)
        {
            System.out.println("Inverter | Inverter() | Inverter konstruktor");

            value = 0;

            inputs = new HashMap<Integer,PinIn>();
            inputs.put(0, new PinIn());

            output = new PinOut();
            this.ID = ID;
	}
        public int GetID()
        {
            System.out.printf("Inverter |GetID() | CALL\n");

            return this.ID;
        }
	/**
	 * 
	 * @return 
	 */
	public void SetValue()
        {
//		value = ~(inputs[0].GetValue());
             System.out.printf("Inverter | SetValue() | CALL\n");
	}
         public void Delete(){
        };

}