package szlab4_whitespaces;

public abstract class AElement {

	//private int value;
        protected int value;
	/**
	 * 
	 * @return 
	 */
	public int GetValue() {
//		SetValue();
//                return value;
            System.out.printf(" | GetValue() | RETURN\n");
            throw new UnsupportedOperationException();
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
	public void Delete() {
		throw new UnsupportedOperationException();
	}

}