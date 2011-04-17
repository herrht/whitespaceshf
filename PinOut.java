package szlab4_whitespaces;

import java.util.*;

public class PinOut extends Pin {

      protected Map<Integer, Wire> w;
//    protected Wire w;               //itt tároljuk el, hogy a láb melyik wire-hez tartozik

    public PinOut(AElement e, int id) {
        ID = id;        //beállítja az elem sorszámát a paraméterre
        elem = e;       //eltároljuk, hogy a láb melyik elemhez tartozik
        w = new HashMap<Integer, Wire>(); 
        //System.out.println(this + " | PinOut konstruktor");     //kiírat
    }

    public void Delete() {      //az láb törlő függvénye
        System.out.println("PinOut | Delete() | PinOut torles fuggvenye ");     //kiírat
        //Megpusztítjuk saját magunkat
    }

    public void SetValue() {
//        System.out.println(this + " | PinOut SetValue()|CALL");     //kiírat
        value = elem.GetValue();    //egyenlővé teszi a láb értékét az elem értékével
        //System.out.println(this + " | PinOut SetValue()|RETURN");       //kiírat
    }

    public void SetWire(int sorszam, Wire tmpw) {
        this.w.put(sorszam, tmpw);
//        this.w = tmpw;
    }

    public void ListElements()                  //Kilistazhatjuk a kimenetre kotott vezetekeket
    {
        System.out.println("Felvett elemek listaja: ");      //kiírat
        Set<Map.Entry<Integer, Wire>> set = this.w.entrySet();

        for (Map.Entry<Integer, Wire> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }

    @Override
    public String toString() {
        return ""+elem;
    }
}
