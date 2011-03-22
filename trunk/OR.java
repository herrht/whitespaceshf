package szlab4_whitespaces;

import java.util.*;

public class OR extends AGate {

    /**
     *
     * @param inputnum
     * @return
     */
    public OR(int inputnum, int ID) {
        value = 0;      //0ba állítja az elem értékét inicializáláskor
        this.inputnum = inputnum;       //beállítja a bemenő lábak számát a paraméterrel

        inputs = new HashMap<Integer, PinIn>();
        for (int i = 0; i < inputnum; i++) {       //annyi bemenő lábat kreál, amennyi a paraméter értéke
            inputs.put(i, new PinIn(this, i));
        }

        output = new PinOut(this);      //kreál egy kimenő lábat
        this.ID = ID;       //az elem sorszámát a praméterrel teszi egyenlővée
        System.out.println(this + " | OR(" + inputnum + ") | Or konstruktor");        //kiírat
    }

    public int GetID() {
        System.out.println(this + " | GetID() | CALL");      //kiírat
        return this.ID;     //visszaadja az elem sorszámát
    }

    /**
     *
     * @return
     */
    public void Delete() {       //az elem törlő függvénye amely törli a be és kimenő lábakat
        System.out.println(this + " | Delete() | Or torles fuggvenye ");
        for (int i = 0; i < inputnum; i++) {
            inputs.get(i).Delete();
        }
        output.Delete();
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
        return "OR" + ID;
    }
    
}
