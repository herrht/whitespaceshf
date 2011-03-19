package szlab4_whitespaces;

public class PinOut extends Pin
{

	/**
	 * 
	 * @return 
	 */
	public PinOut(AElement e)
        {
//		throw new UnsupportedOperationException();
             elem = e;
             System.out.println(this+" | PinOut konstruktor");
	}
       @Override
        public String toString(){
            return "PinOut"+" of "+elem;
        }

}