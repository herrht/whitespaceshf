package szlab4_whitespaces;

public class PinIn extends Pin
{
        private int ID;

	public PinIn(AElement e, int id ) {
            ID = id;
            elem = e;
            System.out.println(this+" | PinIn konstruktor");
	}

        public void SetValue(){
            System.out.println(this+" | PinIn SetValue()|CALL" );
            value = w.GetValue();
            System.out.println(this+" | PinIn SetValue()|RETURN" );
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