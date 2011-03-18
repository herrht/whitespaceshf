package szlab4_whitespaces;

import java.util.*;

public class Led extends AGate {

	/**
	 * 
	 * @param inputnum
	 * @return 
	 */
	public Led() {
            System.out.println("Led | Led() | LED konstruktor");

            inputs = new HashMap<Integer,Object>();
            inputs.put(0, new PinIn());

            output = new PinOut();
	}

	/**
	 * 
	 * @return 
	 */
	public void SetValue() {
//		value = inputs[0].GetValue();
             System.out.printf(" | SetValue() | CALL\n");
	}

}