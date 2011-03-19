package szlab4_whitespaces;

import java.util.*;

public class Led extends AGate {

	/**
	 * 
	 * @param inputnum
	 * @return 
	 */
	public Led(int ID) {
            System.out.println("Led | Led() | LED konstruktor");

            inputs = new HashMap<Integer,PinIn>();
            inputs.put(0, new PinIn());

            output = new PinOut();
            this.ID = ID;
	}
        public int GetID()
        {
            System.out.printf("Led |GetID() | CALL\n");

            return this.ID;
        }
	/**
	 * 
	 * @return 
	 */
	public void SetValue() {
//		value = inputs[0].GetValue();
             System.out.printf("Led | SetValue() | CALL\n");
	}
         public void Delete(){
        };

}