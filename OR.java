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

        System.out.println("A hálózathoz sikeresen hozzáadott egy Or-t, melynek id-je:"+ID);        //kiírat
    }

    public void SetValue() {
        int temp = 0;
        for (int i = 0; i < inputnum; i++) {
        temp += inputs.get(i).GetValue();    //temp értékét egyenlővé teszi azzal az értékkel ahány db bemenő láb egyes
        }
        if (temp >= 1)     //ha legalább egy láb egyes volt akkor value értéke egyes
            value = 1;
        else
            value = 0;          //különben 0

//        System.out.println(this + " | SetValue() | CALL");           //kiírat
    }

    public int GetID() {
        System.out.println(this + " | GetID() | CALL");      //kiírat
        return this.ID;     //visszaadja az elem sorszámát
    }

    public int GetValue() {
//        System.out.println(this + " | GetValue() | CALL\n");

        if (!(this.ready)) {
            return value;
        } else {
            this.ready = false;
            this.SetValue();        //meghívja a SetValue függvényét,a mivel beállítja az értékét
//            System.out.println(this + " | GetValue() | RETURN\n");
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
        return "Or";
    }

    public String toFile1(){
        return "AddOr ";
    }
    public String toFile2(){
        return ""+inputnum+"";
    }
}
