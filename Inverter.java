package szlab4_whitespaces;

import java.util.*;

public class Inverter extends AGate {

    public Inverter(int ID) {
        this.ID = ID;       //az elem sorszámát egyenlővé teszi a paraméterrel
        this.value = 0;              //inicializáláskor 0-ba állítja az elem értékét

        inputs = new HashMap<Integer, PinIn>();
        inputs.put(0, new PinIn(this, 0));      //kreál egy bemenő lábat

        outputs = new HashMap<Integer, PinOut>();
        outputs.put(0, new PinOut(this, 0));      //kreál egy kimenő lábat

        System.out.println("A hálózathoz sikeresen hozzáadott egy Inverter-t, melynek id-je:"+ID);        //kiírat
    }

    public int GetID() {
        System.out.println(this + " |GetID() | CALL");        //kiírat
        return this.ID;     //visszaadja az elem sorszámát
    }

    public void SetValue() {
        if (value==0)       //invertálja az értékét
            value = 1;
        else
            value = 0;
        System.out.println(this + " | SetValue() | CALL");           //kiírat
    }

    public void Delete() {       //az elem törlő függvénye, törli a be - és kimenő lábait
        System.out.println(this + " | Delete() | Inverter torles fuggvenye ");
        inputs.get(0).Delete();
        outputs.get(0).Delete();        //törli a kimenő lábat
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
        return "Inverter" + ID;
    }
}
