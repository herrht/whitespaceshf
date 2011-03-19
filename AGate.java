package szlab4_whitespaces;

import java.util.*;

public abstract class AGate extends AElement
{

//      protected PinIn[] inputs;                   //ezt "tömbösítettem" mondván h nem csak 1 input van :)
        protected Map<Integer,PinIn> inputs;
        //elements.put(ID, new OR(inputnum));
	protected int inputnum;
	protected PinOut output;

	/**
	 * 
	 * @return 
	 */
	public abstract void SetValue();


}