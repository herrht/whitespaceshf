package szlab4_whitespaces;

public class PinIn extends Pin {

    protected Wire w;               //itt tároljuk el, hogy a láb melyik wire-hez tartozik

    public PinIn(AElement e, int id) {
        this.ID = id;        //beállítja az elem sorszámát a paraméterre
        this.elem = e;       //beállítja, hogy melyik elemhez tartozik a láb
        
        //System.out.println(this + " | PinIn konstruktor");        //kiírat
    }

    public void Delete() {       //a láb törlő függvénye
        w = null;       //kiírat
        //Megpusztítjuk saját magunkat
    }

    public void SetValue() {
//        System.out.println(this + " | PinIn SetValue()|CALL");       //kiírat
        value = w.GetValue();       //beállítja a láb értékét a wire értékvel
        //System.out.println(this + " | PinIn SetValue()|RETURN");     //kiírat
    }

    public void SetWire(Wire w)
    {
        this.w = w;      //beállítja a wire-t
    }

    @Override
    public String toString() {
        return ""+elem.GetID()+" "+ID+" ";
    }
}
