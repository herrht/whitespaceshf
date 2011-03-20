package szlab4_whitespaces;

import java.util.*;

public class AND extends AGate {

    /**
     *
     * @param inputnum
     * @return
     */
    public AND(int inputnum, int ID) {
        value = 0;
        this.inputnum = inputnum;

        inputs = new HashMap<Integer, PinIn>();
        for (int i = 0; i < inputnum; ++i) {
            inputs.put(i, new PinIn(this, i));
        }

        output = new PinOut(this);
        this.ID = ID;
        System.out.println(this+"| AND(" + inputnum + ") | And konstruktor");
    }

    public int GetID() {
        System.out.println("AND | GetID() | CALL\n");
        return this.ID;
    }

    public void Delete(){
        System.out.println("AND | Delete() | And torles fuggvenye ");
        for (int i = 0; i < inputnum; i++) {
            inputs.get(i).Delete() ;
        }
        output.Delete();
        //Megpusztítjuk saját magunkat
    }

    public void SetValue() {

        int s = inputs.size();
        for (int i = 0; i < s; i++) {
            PinIn temp = inputs.get(s);
            temp.GetValue();
        }
        System.out.printf("AND" + ID + "| SetValue() | CALL\n");
    }

    @Override
    public String toString(){
        return "AND"+ID;
    }
 }

