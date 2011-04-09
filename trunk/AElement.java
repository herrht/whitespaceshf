package szlab4_whitespaces;

import java.util.*;

public abstract class AElement {

    protected int ID;                           //az elem sorszáma
    protected boolean ready = true;             //elso futasnal minden elem lekerdezheto
    protected int value = 0;                    //az elem aktuális értéke, alapbol 0
    protected Map<Integer, PinOut> outputs;     //PinOut kimeneteket tarolo map
    protected int outputnum = 1;                //kimenetek szama, alapbol 1

    public int GetValue() {
        System.out.println(this + " | GetValue() | CALL\n");

        if (!(this.ready)) {
            return value;
        } else {
            this.ready = false;
            this.SetValue();        //meghívja a SetValue függvényét,a mivel beállítja az értékét
            System.out.println(this + " | GetValue() | RETURN\n");
            return value;           //visszaadja a jelenlegi értékét a hívónak
        }
    }

    public void SetReady() {
        this.ready = true;
    }

    public abstract int GetID();

    public abstract void SetValue();

    public abstract void Delete();
}
