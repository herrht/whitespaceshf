package szlab4_whitespaces;

public class PinOut extends Pin
{

	public PinOut(AElement e)
        {
             elem = e;
             System.out.println(this+" | PinOut konstruktor");
	}

        @Override
        public String toString(){
            return "PinOut"+" of "+elem;
        }

       public void Delete(){
            System.out.println("PinOut | Delete() | PinOut torles fuggvenye ");
            //Megpusztítjuk saját magunkat
        }
}