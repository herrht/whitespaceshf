package szlab4_whitespaces;

public abstract class Pin
{

	private int value;
	private AElement elem;

	/**
	 * 
	 * @return 
	 */
	public void SetValue()
        {
//		value = elem.GetValue();
            
	}

	/**
	 * 
	 * @return 
	 */
	public int GetValue()
        {
            System.out.println("OR | OR() | Pin GetValue");
            return value;
	}

}