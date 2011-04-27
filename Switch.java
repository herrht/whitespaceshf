package szlab4_whitespaces;

import java.util.*;

public class Switch extends ASource {

    public Switch(int ID) {
        this.ID = ID;       //a sorszámát egyenlővé tesszük a paraméterrel
        this.value = 0;      //a switch értékét beállítjuk az incializáláskor 0-ba

        outputs = new HashMap<Integer, PinOut>();
        outputs.put(0, new PinOut(this, 0));      //kreál egy kimenő lábat

        System.out.println("A hálózathoz sikeresen hozzáadott egy Switch-t, melynek id-je:"+ID);        //kiírat
    }

    public int GetID() {
        System.out.println(this + " | GetID() | CALL");      //kiírat
        return this.ID;     //visszaadja az elem sorszámát
    }

    public void SwitchOutput() {
          value = (value == 1) ? 0 : 1;           //ha value 1, akkor 0-ra állítja egyébként 1-re
        System.out.println(this + " | SwitchOutput() | CALL");     //kiírat
    }

    public void SetValue(){

        System.out.println(this + " | SetValue() | CALL");
    }

    public void Delete() {       //az elem törlő függvénye
        System.out.println(this + " | Delete() | Switch torles fuggvenye ");     //kiírat
        outputs.get(0).Delete();        //törli a kimenő lábat
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
       if (value == 1) return "Switch1";
       return "Switch0";
    }



}
