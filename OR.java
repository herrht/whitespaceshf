package szlab4_whitespaces;

import java.util.*;

public class OR extends AGate {

    /**
     *
     * @param inputnum
     * @return
     */
    public OR(int inputnum, int ID) {
        System.out.println("OR | OR(" + inputnum + ") | Or konstruktor");

        value = 0;
        this.inputnum = inputnum;

        inputs = new HashMap<Integer, PinIn>();
        for (int i = 0; i < inputnum; i++) {
            inputs.put(i, new PinIn());
        }

        output = new PinOut();
        this.ID = ID;
    }

    public int GetID() {
        System.out.printf("OR |GetID() | CALL\n");

        return this.ID;
    }

    /**
     *
     * @return
     */
    public void SetValue() {

        int s = inputs.size();
        for (int i = 0; i < s; i++) {
            PinIn temp = inputs.get(s);
            temp.GetValue();
        }
        System.out.printf("OR" + ID + "| SetValue() | CALL\n");
    }

    public void Delete() {
    }

    ;
}
