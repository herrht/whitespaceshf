package szlab4_whitespaces;

public abstract class AElement
{

	//private int value;
        protected int value;
	/**
	 * 
	 * @return 
	 */
	public int GetValue()
        {
//		SetValue();
            System.out.println(" GetValue() | RETURN");
            return value;
	}

	/**
	 * 
	 * @return 
	 */
	public abstract void SetValue();

	/**
	 * 
	 * @return 
	 */
	public void Delete()
        {
		throw new UnsupportedOperationException();
	}

}