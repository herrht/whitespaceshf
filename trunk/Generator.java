package szlab4_whitespaces;

import java.util.*;

public class Generator extends ASource {

    private int[] nums;      //a generátorban lévő számsor ami váltakozik shiftelés esetén
    private int counter;        //a generátorban lévő számláló
    private int rotation;

    public Generator(int[] rate, int ID) {
        this.ID = ID;       //a sorszmáot egyenlővé teszi a paraméterrel
        counter = 0;
        nums = rate;
        value = nums[0];
        rotation=1;

        outputs = new HashMap<Integer, PinOut>();
        outputs.put(0, new PinOut(this, 0));      //kreál egy kimenő lábat

        System.out.println("A hálózathoz sikeresen hozzáadott egy Generator-t, melynek id-je:" + ID);       //kiírat
    }

    public int GetID() {
//        System.out.println(this + " |GetID() | CALL");       //kiírat
        return this.ID;     //visszaadja az elem sorszámát
    }

    public void SetValue() {
        if (rotation == 4) rotation = 1;
        else rotation++;
        this.Shift();
        value = nums[counter];

//        System.out.println(this + " | SetValue() | CALL");           //kiírat
    }

    public void Shift() {       //az elem léptető függvénye, változtatja a kimenő értéket a benne tárolt számsor alapján
        if (counter < nums.length - 1) //amíg nem érünk a tömb végére léptetjük a countert
        {
            counter++;
        } else //ha végére értünk, akkor előről kezdjük a lépegetést
        {
            counter = 0;
        }

//        System.out.println(this + " | Shift() | CALL");      //kiírat
    }

    public void Delete() {       //az elem törlő függvénye, törli a kimenő lábát
        System.out.println(this + " | Delete() | Generator torles fuggvenye ");
        outputs.get(0).Delete();        //törli a kimenő lábat
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
//        System.out.println("Generator"+rotation);
        return "Generator"+rotation;
    }

    @Override
    public String toFile1() {
        return "AddGenerator ";
    }

    @Override
    public String toFile2() {
        String s = "";
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
        }
        return s;
    }

    public String rate() {
        String r = "";
        for (int i = 0; i < nums.length - 1; i++) {
            r += nums[i];
        }
        return r;
    }

    public String rate2() {
        String r = "" + nums[counter];
        return r;
    }
}
