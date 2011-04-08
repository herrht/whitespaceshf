package szlab4_whitespaces;

import java.util.*;

public class Fix0 extends ASource {

    public Fix0(int ID) {
        value = 0;      //inicializáláskor 0-ba állítja az elem értékét
        output = new HashMap<Integer, PinOut>();
        output.put(0, new PinOut(this));      //kreál egy kimenő lábat
        this.ID = ID;       //sorszámot egyenlővé teszi a paraméterrel
        System.out.println(this + " | Fix0()| Fix0 konstruktor");     //kiíratja
    }

    public int GetID() {
        System.out.printf(this + " | GetID() | CALL\n");        //kiíratja
        return this.ID;         //visszaadja a sorszámot
    }

    public void SetValue() {        //a fix0 setvalue függvénye, hasnza nincsen
//		value = 0;
        System.out.printf(this + " | SetValue() | CALL| RETURN\n");      //kiírat
    }

    public void Delete() {
        System.out.println(this + " | Delete() | Fix0 torles fuggvenye ");     //kiírat
        output.get(0).Delete();        //törli a kimenő lábat
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
        return "Fix0_" + ID;
    }
}
