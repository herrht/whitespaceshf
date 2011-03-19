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
            inputs.put(i, new PinIn(this, i));
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

    public void Delete(){
        System.out.println("OR | Delete() | Or torles fuggvenye ");
        for (int i = 0; i < inputnum; i++) {
            inputs.get(i).Delete() ;
        }
        output.Delete();
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString(){
        return "OR"+ID;
    }

    ;
}
