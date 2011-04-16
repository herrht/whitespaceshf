package szlab4_whitespaces;

import java.util.*;

public class AND extends AGate {

    public AND(int inputnum, int ID) {
        this.ID = ID;                           //sorszámot egyenlővé teszi a paraméterrel
        this.inputnum = inputnum;           //egyenlővé teszi a lábak számát tároló integert a paraméterrel
        this.value = 0;                          //value értéke 0 lesz inicializáláskor

        inputs = new HashMap<Integer, PinIn>();
        for (int i = 0; i < inputnum; ++i) {       //annyi PinIn lábat csinál, ahány lábas AND kaput kreáltunk
            inputs.put(i, new PinIn(this, i));
        }

        outputs = new HashMap<Integer, PinOut>();
        outputs.put(0, new PinOut(this, 0));      //kreál egy kimenő lábat

        System.out.println("A hálózathoz sikeresen hozzáadott egy And-t, melynek id-je:"+ID);       //kiírat
    }

    public int GetID() {
        System.out.println(this + " | GetID() | CALL\n");       //kiírat
        return this.ID;         //visszaadja az elem sorszámát
    }

    public void SetValue() {
        int temp = 0;
        for (int i = 0; i < inputnum; i++) {
        temp += inputs.get(i).GetValue();    //temp értékét egyenlővé teszi azzal az értékkel ahány db bemenő láb egyes
        }
        if (temp==inputnum)     //ha minden bemenő láb egyes volt akkor value értéke egyes
            value = 1;
        else
            value = 0;          //különben 0

        System.out.println(this + " | SetValue() | CALL");           //kiírat
    }

    public void Delete() {           //törli a kapi ki- és bementi lábait
        System.out.println(this + " | Delete() | And torles fuggvenye ");
        for (int i = 0; i < inputnum; i++) {
            inputs.get(i).Delete();
        }
        outputs.get(0).Delete();        //törli a kimenő lábat
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
        return "AND" + ID;
    }
}
