package szlab4_whitespaces;

import java.util.*;

public class OR extends AGate {

    /**
     *
     * @param inputnum
     * @return
     */
    public OR(int inputnum, int ID) {
        

        value = 0;
        this.inputnum = inputnum;

        inputs = new HashMap<Integer, PinIn>();
        for (int i = 0; i < inputnum; i++) {
            inputs.put(i, new PinIn(i, this));
        }

        output = new PinOut(this);
        this.ID = ID;
        System.out.println(this+" | OR(" + inputnum + ") | Or konstruktor");
    }

    public int GetID() {
        System.out.printf(this+" | GetID() | CALL\n");

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
      @Override
    public String toString(){
        return "OR"+ID;
    }

    ;
}
