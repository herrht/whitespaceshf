package szlab4_whitespaces;

import java.util.*;

public class Generator extends ASource {

    private int[] outputs;      //a generátorban lévő számsor ami váltakozik shiftelés esetén
    private int counter;        //a generátorban lévő számláló

    public Generator(int[] rate, int ID) {

        output = new HashMap<Integer, PinOut>();
        output.put(0, new PinOut(this));      //kreál egy kimenő lábat
        this.ID = ID;       //a sorszmáot egyenlővé teszi a paraméterrel
//		counter = 0;
//              outputs = rate;
//              value = outputs[0];
        System.out.println(this + " | Generator(rate)| Generator konstruktor");       //kiírat
    }

    public int GetID() {
        System.out.println(this + " |GetID() | CALL");       //kiírat
        return this.ID;     //visszaadja az elem sorszámát
    }

    /**
     *
     * @return
     */
    public void SetValue() {
//          value = outputs[counter];
        System.out.println(this + " | SetValue() | CALL");           //kiírat
    }

    /**
     *
     * @return
     */
    public void Shift() {       //az elem léptető függvénye, változtatja a kimenő értéket a benne tárolt számsor alapján
//		counter++;
//               SetValue();
        System.out.println(this + " | Shift() | CALL");      //kiírat
    }

    public void Delete() {       //az elem törlő függvénye, törli a kimenő lábát
        System.out.println(this + " | Delete() | Generator torles fuggvenye ");
        output.get(0).Delete();        //törli a kimenő lábat
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
        return "Generator" + ID;
    }
}
