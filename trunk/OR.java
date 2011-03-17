package szlab4_whitespaces;

public class OR extends AGate {

	/**
	 * 
	 * @param inputnum
	 * @return 
	 */
	public OR(int inputnum) {
		value = 0;
	}

	/**
	 * 
	 * @return 
	 */
	public void SetValue() {
		int temp = 0;
                for (int i = 0 ; i < inputnum ; i++){               //temp értékét beállítja arra az értékre ahány input value értéke 1
                    if (inputs[i].GetValue() == 1)
                        temp++;
                }

		if (temp >= 1)                                  //ha temp legalább 1 -> legalább 1 bemenő jel == 1, akkor value = 1
                        value = 1;
                else
                        value = 0;                              //egyébként 0
	}

}