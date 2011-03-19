package szlab4_whitespaces;

import java.util.*;

public class AND extends AGate {

    /**
     *
     * @param inputnum
     * @return
     */
    public AND(int inputnum, int ID) {
        System.out.println("AND | AND(" + inputnum + ") | And konstruktor");

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
        System.out.printf("AND |GetID() | CALL\n");

        return this.ID;
    }
        public void Delete()
        {
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
        System.out.printf("AND" + ID + "| SetValue() | CALL\n");
    }
}
