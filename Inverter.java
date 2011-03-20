package szlab4_whitespaces;

import java.util.*;

public class Inverter extends AGate {

    public Inverter(int ID) {


        value = 0;

        inputs = new HashMap<Integer, PinIn>();
        inputs.put(0, new PinIn(this, 0));

        output = new PinOut(this);
        this.ID = ID;
        System.out.println(this+" | Inverter() | Inverter konstruktor");
    }

    public int GetID() {
        System.out.printf("Inverter |GetID() | CALL\n");

        return this.ID;
    }

    /*public void SetValue() {
//		value = ~(inputs[0].GetValue());
        System.out.printf("Inverter | SetValue() | CALL\n");
    }*/

    public void Delete(){
        System.out.println("Inverter | Delete() | Inverter torles fuggvenye ");
        inputs.get(0).Delete() ;
        output.Delete();
        //Megpusztítjuk saját magunkat
    }

    ;

    @Override
    public String toString() {
        return "Inverter" + ID;
    }
}
