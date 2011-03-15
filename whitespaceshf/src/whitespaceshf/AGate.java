package szlab4_whitespaces;

public abstract class AGate extends AElement {

	private PinIn inputs;
	private int inputnum;
	private PinOut output;

	/**
	 * 
	 * @return 
	 */
	public abstract void SetValue();

}