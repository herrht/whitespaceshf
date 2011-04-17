package szlab4_whitespaces;

import java.util.*;

public class Generator extends ASource {

    private int[] nums;      //a generátorban lévő számsor ami váltakozik shiftelés esetén
    private int counter;        //a generátorban lévő számláló

    public Generator(int[] rate, int ID) {
        this.ID = ID;       //a sorszmáot egyenlővé teszi a paraméterrel
	counter = 0;
        nums = rate;
        value = nums[0];
        
        outputs = new HashMap<Integer, PinOut>();
        outputs.put(0, new PinOut(this, 0));      //kreál egy kimenő lábat

        System.out.println("A hálózathoz sikeresen hozzáadott egy Generator-t, melynek id-je:"+ID);       //kiírat
    }

    public int GetID() {
        System.out.println(this + " |GetID() | CALL");       //kiírat
        return this.ID;     //visszaadja az elem sorszámát
    }

    public void SetValue() {

          this.Shift();
          value = nums[counter];
          
//        System.out.println(this + " | SetValue() | CALL");           //kiírat
    }

    public void Shift() {       //az elem léptető függvénye, változtatja a kimenő értéket a benne tárolt számsor alapján
	if(counter < nums.length-1)	//amíg nem érünk a tömb végére léptetjük a countert
                counter++;
        else                            //ha végére értünk, akkor előről kezdjük a lépegetést
                counter=0;

//        System.out.println(this + " | Shift() | CALL");      //kiírat
    }

    public void Delete() {       //az elem törlő függvénye, törli a kimenő lábát
        System.out.println(this + " | Delete() | Generator torles fuggvenye ");
        outputs.get(0).Delete();        //törli a kimenő lábat
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
        return "Generator" + ID;
    }
}
