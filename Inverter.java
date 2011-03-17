package szlab4_whitespaces;

public class Inverter extends AGate {

	/**
	 * 
	 * @param inputnum
	 * @return 
	 */
	public Inverter(int inputnum) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public void SetValue() {
		value = ~(inputs[0].GetValue());
	}

}