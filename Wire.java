package szlab4_whitespaces;

public class Wire extends AElement
{

	private PinIn output;           //A kapott Elem kimenete lesz a Vezeték bemene
	private PinOut input;           //A kapott Elem bemenete lesz a Vezeték kimenete

	/**
	 * 
	 * @param input
	 * @param output
	 * @return 
	 */
	public Wire(PinIn input, PinOut output, int ID) {
//      public Wire(int id1, int id1_p, int id2, int id2_p, int ID)
        
            System.out.println("Wire | Wire(Lab1: "+input+", Lab2: "+output);
//          System.out.println("Wire | Wire(Elem: "+id1+", Pin: "+id1_p+"; "+ "Elem2: "+id2+", Pin2: "+id2_p+") | Wire konstruktor");
            
            this.input = output;    //A kapott Elem kimenete lesz a Vezeték bemene
            this.output = input;    //A kapott Elem bemenete lesz a Vezeték kimenete
            this.ID = ID;
        }
        
        public int GetID()
        {
            System.out.printf("Wire |GetID() | CALL\n");

            return this.ID;
        }
        
	/**
	 * 
	 * @return 
	 */
	public void SetValue()
        {
		//value = input.Getvalue();       //nemlátja a getvalue függvényt
            System.out.printf("Wire | SetValue() | CALL\n");
	}
         public void Delete(){
        };
}