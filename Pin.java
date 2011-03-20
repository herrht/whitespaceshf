package szlab4_whitespaces;

public abstract class Pin
{

	protected int value;        //a láb értéke
	protected AElement elem;        //itt tároljuk el,hogy a láb melyik elemhez tartozik
        protected Wire w;       //itt tároljuk el, hogy a láb melyik wire-hez tartozik

	public abstract void SetValue();
       
	

	public int GetValue()
        {
            System.out.println(this+" | Pin GetValue() |CALL");     //kiírat
            this.SetValue();        //meghívja a saját SetValue függvényét
            System.out.println(this+" | Pin GetValue() |RETURN");       //kiírat
            return value;       //visszaadja a láb értékét
	}
   public void SetWire(Wire w){
            this.w =w;      //beállítja a wire-t
   }

}