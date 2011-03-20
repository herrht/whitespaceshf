package szlab4_whitespaces;

import java.util.*;

public class Led extends AGate {

    /**
     *
     * @param inputnum
     * @return
     */
    public Led(int ID) {
        inputs = new HashMap<Integer, PinIn>(1);
        inputs.put(0, new PinIn(this, 0));

        output = null;
        this.ID = ID;
        System.out.println(this+" | Led() | LED konstruktor");
    }

    public int GetID() {
        System.out.printf("Led |GetID() | CALL\n");

        return this.ID;
    }

    /**
     *
     * @return
     */
    /*public void SetValue() {

        PinIn temp = inputs.get(0);
        temp.GetValue();
        System.out.printf(this+" | SetValue() | CALL\n");
    }*/

    public void Delete(){
        System.out.println("Led | Delete() | Led torles fuggvenye ");
        inputs.get(0).Delete() ;
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
        return "Led" + ID;
    }

    ;
}
