package szlab4_whitespaces;

import java.util.*;

public class OR extends AGate {

    public OR(int inputnum, int ID) {
        this.ID = ID;       //az elem sorszámát a praméterrel teszi egyenlővée
        this.inputnum = inputnum;       //beállítja a bemenő lábak számát a paraméterrel
        this.value = 0;      //0ba állítja az elem értékét inicializáláskor

        inputs = new HashMap<Integer, PinIn>();
        for (int i = 0; i < inputnum; i++) {       //annyi bemenő lábat kreál, amennyi a paraméter értéke
            inputs.put(i, new PinIn(this, i));
        }

        outputs = new HashMap<Integer, PinOut>();
        outputs.put(0, new PinOut(this, 0));      //kreál egy kimenő lábat

        System.out.println(this + " | OR(" + inputnum + ") | Or konstruktor");        //kiírat
    }

    public int GetID() {
        System.out.println(this + " | GetID() | CALL");      //kiírat
        return this.ID;     //visszaadja az elem sorszámát
    }

    public int GetValue() {
        System.out.println(this + " | GetValue() | CALL\n");

        if (!(this.ready)) {
            return value;
        } else {
            this.ready = false;
            this.SetValue();        //meghívja a SetValue függvényét,a mivel beállítja az értékét
            System.out.println(this + " | GetValue() | RETURN\n");
            return value;           //visszaadja a jelenlegi értékét a hívónak
        }
    }

    public void Delete() {       //az elem törlő függvénye amely törli a be és kimenő lábakat
        System.out.println(this + " | Delete() | Or torles fuggvenye ");
        for (int i = 0; i < inputnum; i++) {
            inputs.get(i).Delete();
        }
        outputs.get(0).Delete();        //törli a kimenő lábat
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
        return "OR" + ID;
    }
}
