package szlab4_whitespaces;

public abstract class AElement
{

	//private int value;
        protected int value;
        protected int ID;
	protected PinOut output;
	/**
	 * 
	 * @return 
	 */
	public int GetValue()
        {
            this.SetValue();
            System.out.println(" GetValue()"+ID+" | RETURN");
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
	public abstract void Delete();

}