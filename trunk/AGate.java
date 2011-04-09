package szlab4_whitespaces;

import java.util.*;

public abstract class AGate extends AElement {

    protected Map<Integer, PinIn> inputs;           //PinIn bemeneteket tarolo map
    protected int inputnum;                         //elem bemeneteinek szama

    public void SetValue() {
        System.out.printf(this + " | SetValue() | CALL\n");
        int s = inputs.size();                      //s = bemenetek szama  --> inputnum?
        for (int i = 0; i < s; i++) {               //annyiszor fut le a ciklus ahány bemenete van.
            inputs.get(i).GetValue();               //meghívja a kapu bemeneteinek GetValue függvényét.
        }
        System.out.printf(this + " | SetValue() | RETURN\n");
    }
}
