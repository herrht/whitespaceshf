package szlab4_whitespaces;

public abstract class Pin
{

	private int value;
	protected AElement elem;

	public void SetValue()
        {
//		value = elem.GetValue();
            
	}

	public int GetValue()
        {
            System.out.println("Pin | " + elem + " | Pin GetValue");
            return value;
	}

}