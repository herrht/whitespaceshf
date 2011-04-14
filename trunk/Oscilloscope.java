package szlab4_whitespaces;

import java.util.*;

public class Oscilloscope extends AGate {


    protected Set stash;



    public Oscilloscope(int ID) {
        this.ID = ID;       //az elem sorszámát egyenlővé teszi a paraméterrel
        inputs = new HashMap<Integer, PinIn>(1);
        inputs.put(0, new PinIn(this, 0));      //kreál egy bemenő lábat
        value = 0;
        outputs = null;      //nincs kimenő lába, emiatt null az értéke
        System.out.println(this + " | Oscilloscope() | Oszcilloszkop konstruktor");      //kiírat
    }

    public void SetValue(){
    stash.add(inputs.get(0).GetValue());    //hozzáadja a tároló elemeihez a láb értékét
    value = inputs.get(0).GetValue();       //beállítja a valuet (nem tudom kelle majd, de miért ne?)
    }

    public int GetID() {
        System.out.println(this + " | GetID() | CALL");     //kiírat
        return this.ID;     //visszaadja az elem sorszámát
    }

    public void Delete() {       //az elem törlő függvénye amely törli az elem bemenő lábát
        System.out.println(this + " | Delete() | Oscilloscope torles fuggvenye ");
        inputs.get(0).Delete();
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
        return "Oscilloscope" + ID;
    }
}
