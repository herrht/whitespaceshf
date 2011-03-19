package szlab4_whitespaces;

import java.util.*;

public class Led extends AGate {

    /**
     *
     * @param inputnum
     * @return
     */
    public Led(int ID) {
        System.out.println("Led | Led() | LED konstruktor");

        inputs = new HashMap<Integer, PinIn>(1);
        inputs.put(0, new PinIn());

        output = new PinOut();
        this.ID = ID;
    }

    public int GetID() {
        System.out.printf("Led |GetID() | CALL\n");

        return this.ID;
    }

    /**
     *
     * @return
     */
    public void SetValue() {

        PinIn temp = inputs.get(0);
        temp.GetValue();
        System.out.printf("Led"+ID+"| SetValue() | CALL\n");
    }

    public void Delete() {
    }

    ;
}
