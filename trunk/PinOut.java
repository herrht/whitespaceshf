package szlab4_whitespaces;

public class PinOut extends Pin {

    public PinOut(AElement e) {
        elem = e;       //eltároljuk, hogy a láb melyik elemhez tartozik
        System.out.println(this + " | PinOut konstruktor");     //kiírat
    }

    @Override
    public String toString() {
        return "PinOut" + " of " + elem;
    }

    public void Delete() {      //az láb törlő függvénye
        System.out.println("PinOut | Delete() | PinOut torles fuggvenye ");     //kiírat
        //Megpusztítjuk saját magunkat
    }

    public void SetValue() {
        System.out.println(this + " | PinOut SetValue()|CALL");     //kiírat
        value = elem.GetValue();    //egyenlővé teszi a láb értékét az elem értékével
        System.out.println(this + " | PinOut SetValue()|RETURN");       //kiírat
    }
}
