package szlab4_whitespaces;

public class PinIn extends Pin
{
        private int ID;
	/**
	 * 
	 * @return 
	 */
	public PinIn(int id, AElement e) {
//		throw new UnsupportedOperationException();
            ID = id;
            elem = e;
            System.out.println(this+" | PinIn konstruktor");
	}
    @Override
        public String toString(){
            return "PinIn"+ID+" of "+elem;
        }
    

}