package szlab4_whitespaces;

public class AND extends AGate {

	/**
	 * 
	 * @param inputnum
	 * @return 
	 */
	public AND(int inputnum) {
		value = 0;
	}

	/**
	 * 
	 * @return 
	 */
	public void SetValue() {
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
             System.out.printf(" | SetValue() | CALL\n");
	}

}