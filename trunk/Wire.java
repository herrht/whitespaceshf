package szlab4_whitespaces;

public class Wire extends AElement {

	private PinIn output;           //Wire outputja az előző objektum inputja
	private PinOut input;           //Wire inputja az előző objektum outputja

	/**
	 * 
	 * @param input
	 * @param output
	 * @return 
	 */
	public Wire(PinIn input, PinOut output) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public void SetValue() {
		value = input.Getvalue();       //nemlátja a getvalue függvényt
	}

}