package szlab4_whitespaces;

public abstract class Pin
{

	protected int value;
	protected AElement elem;
        protected Wire w;

	public abstract void SetValue();
       
	

	public int GetValue()
        {
            System.out.println(this+" | Pin GetValue()");
            this.SetValue();
            return value;
	}
   public void SetWire(Wire w){
            this.w =w;
   }

}