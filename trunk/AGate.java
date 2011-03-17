package szlab4_whitespaces;

public abstract class AGate extends AElement {

//	private PinIn[] inputs;
//	private int inputnum;
//	private PinOut output;
       	protected PinIn[] inputs;                   //ezt "tömbösítettem" mondván h nem csak 1 input van :)
	protected int inputnum;
	protected PinOut output;

	/**
	 * 
	 * @return 
	 */
	public abstract void SetValue();

}