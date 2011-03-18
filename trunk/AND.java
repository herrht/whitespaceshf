package szlab4_whitespaces;

import java.util.*;

public class AND extends AGate
{

	/**
	 * 
	 * @param inputnum
	 * @return 
	 */
	public AND(int inputnum, int ID)
        {
            System.out.println("AND | AND("+inputnum+") | And konstruktor");

            value = 0;
            this.inputnum = inputnum;

            inputs = new HashMap<Integer,Object>();
            for (int i = 0; i < inputnum; i++)
            {
                inputs.put(i, new PinIn());
            }

            output = new PinOut();
            this.ID = ID;
	}



	/**
	 * 
	 * @return 
	 */
	public void SetValue()
        {
//                int temp = 0;
//                for (int i = 0 ; i < inputnum ; i++){               //temp értékét beállítja arra az értékre ahány input value értéke 1
//                    if (inputs[i].GetValue() == 1)
//                        temp++;
//                }
//
//		if (temp == inputnum)                           //ha temp == amennyi bemenő jel van -> mindegyik 1-es, akkor value = 1
//                        value = 1;
//                else
//                        value = 0;                              //egyébként 0
             System.out.printf("AND | SetValue() | CALL\n");
	}

}