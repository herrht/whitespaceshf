package szlab4_whitespaces;

public class Switch extends ASource {

	public Switch() {
            System.out.println("Switch | Switch() | Switch konstruktor");
            value = 0;
            output = new PinOut();
	}

	/**
	 * 
	 * @return 
	 */
	public void SetValue() {
//		value = (value == 1) ? 0 : 1;           //ha value 1, akkor 0-ra állítja egyébként 1-re
            System.out.printf(" | SetValue() | CALL\n");

	}

}