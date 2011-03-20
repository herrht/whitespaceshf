package szlab4_whitespaces;

public class PinIn extends Pin
{
        private int ID;

	public PinIn(AElement e, int id ) {
            ID = id;        //beállítja az elem sorszámát a paraméterre
            elem = e;       //beállítja, hogy melyik elemhez tartozik a láb
            System.out.println(this+" | PinIn konstruktor");        //kiírat
	}

        public void SetValue(){
            System.out.println(this+" | PinIn SetValue()|CALL" );       //kiírat
            value = w.GetValue();       //beállítja a láb értékét a wire értékvel
            System.out.println(this+" | PinIn SetValue()|RETURN" );     //kiírat
        }

        @Override
        public String toString(){
            return "PinIn"+ID+" of "+elem;
        }

        public void Delete(){       //a láb törlő függvénye
            System.out.println("PinIn | Delete() | PinIn torles fuggvenye ");       //kiírat
            //Megpusztítjuk saját magunkat
        }

}