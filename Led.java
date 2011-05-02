package szlab4_whitespaces;

import java.util.*;

public class Led extends AGate {

    public Led(int ID) {
        this.ID = ID;       //az elem sorszámát egyenlővé teszi a paraméterrel
        inputnum = 1;
        inputs = new HashMap<Integer, PinIn>(1);
        inputs.put(0, new PinIn(this, 0));      //kreál egy bemenő lábat
        value = 0;              //alapértelmezett value a lednél 0
        outputs = null;      //nincs kimenő lába, emiatt null az értéke

        System.out.println("A hálózathoz sikeresen hozzáadott egy Led-t, melynek id-je:"+ID);      //kiírat
    }

    public int GetID() {
        System.out.println(this + " |GetID() | CALL");      //kiírat
        return this.ID;                                     //visszaadja az elem sorszámát
    }

    public void Delete() {                                  //az elem törlő függvénye amely törli az elem bemenő lábát
        System.out.println(this + " | Delete() | Led torles fuggvenye ");
        inputs.get(0).Delete();
        //Megpusztítjuk saját magunkat
    }

     public void SetValue() {
        value = inputs.get(0).GetValue();    //meghívja a bemenő lábára a GetValue függvényt és egyenlővé teszi a valuet
        System.out.println("A "+this+" értéke:"+value);


//        System.out.println(this + " | SetValue() | CALL");           //kiírat
    }

    @Override
    public String toString() {
        if (value == 1) return "Led1";
        return "Led0";
    }

    @Override
    public String toFile1() {
       return "AddLed ";
    }

    @Override
    public String toFile2() {
        return "";
    }
}
