package szlab4_whitespaces;

import java.util.*;

public class Fix1 extends ASource {

    public Fix1(int ID) {
        this.ID = ID;       //a sorszmot egyenlővé teszi a paraméterrel
        this.value = 1;      //1-re állítja az elem értékét inicializáláskor

        outputs = new HashMap<Integer, PinOut>();
        outputs.put(0, new PinOut(this, 0));      //kreál egy kimenő lábat

        System.out.println("A hálózathoz sikeresen hozzáadott egy Fix1-t, melynek id-je:"+ID);     //kiírat
    }

    public int GetID() {
        System.out.println(this + " | GetID() | CALL");        //kiírat
        return this.ID;             //visszaadja az elem sorszámát
    }

    public void SetValue() {
		value = 1;
        System.out.println(this + " | SetValue() | CALL| RETURN");       //kiírat
    }

    public void Delete() {
        System.out.println(this + " | Delete() | Fix1 torles fuggvenye ");     //kiírat
        outputs.get(0).Delete();        //törli a kimenő lábat
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
        return "Fix1";
    }

     @Override
    public String toFile1() {
       return "AddFix1 ";
    }

    @Override
    public String toFile2() {
        return "";
    }
}
