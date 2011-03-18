package szlab4_whitespaces;

public abstract class AElement
{

	//private int value;
        protected int value;
        protected int ID;
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
        public abstract int GetID();

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