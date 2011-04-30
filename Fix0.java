package szlab4_whitespaces;

import java.util.*;

public class Fix0 extends ASource {

    public Fix0(int ID) {
        this.ID = ID;           //sorszámot egyenlővé teszi a paraméterrel
        this.value = 0;              //inicializáláskor 0-ba állítja az elem értékét

        outputs = new HashMap<Integer, PinOut>();
        outputs.put(0, new PinOut(this, 0));      //kreál egy kimenő lábat

        System.out.println("A hálózathoz sikeresen hozzáadott egy Fix0-t, melynek id-je:"+ID);     //kiíratja
    }

    public int GetID() {
        System.out.printf(this + " | GetID() | CALL\n");        //kiíratja
        return this.ID;             //visszaadja a sorszámot
    }

    public void SetValue() {
		value = 0;
        System.out.printf(this + " | SetValue() | CALL| RETURN\n");      //kiírat
    }

    public void Delete() {
        System.out.println(this + " | Delete() | Fix0 torles fuggvenye ");     //kiírat
        outputs.get(0).Delete();        //törli a kimenő lábat
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
        return "Fix0";
    }

     @Override
    public String toFile1() {
       return "AddFix0 ";
    }

    @Override
    public String toFile2() {
        return "";
    }
}
