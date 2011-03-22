package szlab4_whitespaces;

import java.util.*;

public class Inverter extends AGate {

    public Inverter(int ID) {
        value = 0;      //inicializáláskor 0-ba állítja az elem értékét

        inputs = new HashMap<Integer, PinIn>();
        inputs.put(0, new PinIn(this, 0));      //kreál egy bemenő lábat

        output = new PinOut(this);      //kreál egy kimenő lábat
        this.ID = ID;       //az elem sorszámát egyenlővé teszi a paraméterrel
        System.out.println(this + " | Inverter() | Inverter konstruktor");        //kiírat
    }

    public int GetID() {
        System.out.println(this + " |GetID() | CALL");        //kiírat

        return this.ID;     //visszaadja az elem sorszámát
    }

    public void Delete() {       //az elem törlő függvénye, törli a be - és kimenő lábait
        System.out.println(this + " | Delete() | Inverter torles fuggvenye ");
        inputs.get(0).Delete();
        output.Delete();
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
        return "Inverter" + ID;
    }
}
