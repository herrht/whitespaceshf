package szlab4_whitespaces;

import java.util.*;

public class Led extends AGate {

    /**
     *
     * @param inputnum
     * @return
     */
    public Led(int ID) {
        inputs = new HashMap<Integer, PinIn>(1);
        inputs.put(0, new PinIn(this, 0));      //kreál egy bemenő lábat

        output = null;      //nincs kimenő lába, emiatt null az értéke
        this.ID = ID;       //az elem sorszámát egyenlővé teszi a paraméterrel
        System.out.println(this+" | Led() | LED konstruktor");      //kiírat
    }

    public int GetID() {
        System.out.printf("Led |GetID() | CALL\n");     //kiírat

        return this.ID;     //visszaadja az elem sorszámát
    }

    /**
     *
     * @return
     */
    /*public void SetValue() {

        PinIn temp = inputs.get(0);
        temp.GetValue();
        System.out.printf(this+" | SetValue() | CALL\n");
    }*/

    public void Delete(){       //az elem törlő függvénye amely törli az elem bemenő lábát
        System.out.println("Led | Delete() | Led torles fuggvenye ");
        inputs.get(0).Delete() ;
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
        return "Led" + ID;
    }

    ;
}
