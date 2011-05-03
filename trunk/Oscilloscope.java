package szlab4_whitespaces;

import java.util.*;

public class Oscilloscope extends AGate {


    protected ArrayList<Integer> nums;



    public Oscilloscope(int ID) {
        this.ID = ID;       //az elem sorszámát egyenlővé teszi a paraméterrel
        inputnum = 1;
        nums = new ArrayList<Integer>();
        inputs = new HashMap<Integer, PinIn>(1);
        inputs.put(0, new PinIn(this, 0));      //kreál egy bemenő lábat
        value = 0;
        outputs = null;      //nincs kimenő lába, emiatt null az értéke
        System.out.println(this + " | Oscilloscope() | Oszcilloszkop konstruktor");      //kiírat
    }

    public void SetValue(){
        nums.add(inputs.get(0).GetValue());    //hozzáadja a tároló elemeihez a láb értékét
        value = inputs.get(0).GetValue();       //beállítja a valuet (nem tudom kelle majd, de miért ne?)
    }

    public int GetID() {
        System.out.println(this + " | GetID() | CALL");     //kiírat
        return this.ID;     //visszaadja az elem sorszámát
    }

    public void Delete() {       //az elem törlő függvénye amely törli az elem bemenő lábát
        System.out.println(this + " | Delete() | Oscilloscope torles fuggvenye ");
        inputs.get(0).Delete();
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
        return "Oscilloscope";
    }

    @Override
    public String toFile1() {
        return "AddOscilloscope ";
    }

    @Override
    public String toFile2() {
        return "";
    }
    public int[] getNums(){
        int [] n;
        
        if (nums.size()<5) n = new int[nums.size()];
        else n = new int[5];
        
        for (int i =0 ; i<n.length; i++)
        {
            n[i] = nums.get(nums.size()-1-i);
        }
        return n;
    }
}
