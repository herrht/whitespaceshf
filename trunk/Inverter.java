package szlab4_whitespaces;

import java.util.*;

public class Inverter extends AGate
{

	public Inverter()
        {
            System.out.println("Inverter | Inverter() | Inverter konstruktor");

            value = 0;

            inputs = new HashMap<Integer,Object>();
            inputs.put(0, new PinIn());

            output = new PinOut();
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

}