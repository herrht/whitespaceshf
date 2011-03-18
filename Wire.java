package szlab4_whitespaces;

public class Wire extends AElement
{

	private PinIn output;           //Wire outputja az előző objektum inputja
	private PinOut input;           //Wire inputja az előző objektum outputja

	/**
	 * 
	 * @param input
	 * @param output
	 * @return 
	 */
//	public Wire(PinIn input, PinOut output) {
        public Wire(int id1, int id2)
        {
            System.out.println("Wire | Wire("+id1+","+id2+") | And konstruktor");
//            input = progi.proj.elements.getIDizé(id1).inputs.getLab()
//            output = new PinIn(); -> nem új, hanem meglévőre hivatkozzunk
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

}