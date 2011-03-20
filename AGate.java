package szlab4_whitespaces;

import java.util.*;

public abstract class AGate extends AElement {

//      protected PinIn[] inputs;                   //ezt "tömbösítettem" mondván h nem csak 1 input van :)
    protected Map<Integer, PinIn> inputs;
    //elements.put(ID, new OR(inputnum));
    protected int inputnum;

    /**
     *
     * @return
     */
    public void SetValue() {
        System.out.printf(this + "| SetValue() | CALL\n");
        int s = inputs.size();
        for (int i = 0; i < s; i++) {
            inputs.get(i).GetValue();
        }
        System.out.printf(this + "| SetValue() | RETURN\n");
    }

    ;
}
