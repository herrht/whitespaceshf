package szlab4_whitespaces;

import java.util.*;

public abstract class AGate extends AElement {

//      protected PinIn[] inputs;                   //ezt "tömbösítettem" mondván h nem csak 1 input van :)
    protected Map<Integer, PinIn> inputs;
    //elements.put(ID, new OR(inputnum));
    protected int inputnum;                         //az az integer van itt eltárolva, ahány bemenő lába van a kapunak.

    /**
     *
     * @return
     */
    public void SetValue() {
        System.out.printf(this + "| SetValue() | CALL\n");
        int s = inputs.size();                      //s-nek a
        for (int i = 0; i < s; i++) {               //annyiszor fut le a ciklus ahány bemenete van.
            inputs.get(i).GetValue();               //meghívja a kapu bemeneteinek GetValue függvényét.
        }
        System.out.printf(this + "| SetValue() | RETURN\n");
    }

    ;
}
