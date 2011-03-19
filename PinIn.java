package szlab4_whitespaces;

public class PinIn extends Pin
{
        private int ID;

	public PinIn(AElement e, int id ) {
            ID = id;
            elem = e;
            System.out.println(this+" | PinIn konstruktor");
	}

        @Override
        public String toString(){
            return "PinIn"+ID+" of "+elem;
        }

        public void Delete(){
            System.out.println("PinIn | Delete() | PinIn torles fuggvenye ");
            //Megpusztítjuk saját magunkat
        }

}