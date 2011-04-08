package szlab4_whitespaces;

import java.util.*;

public abstract class AElement {

    protected int value;        //az elem aktuális jelének értéke. 0 vagy 1
    protected int ID;           //az elem sorszáma
    //protected PinOut output;    //az elem kimenő lába
    protected Map<Integer, PinOut> output;
    protected int outputnum = 1;

    /**
     *
     * @return
     */
    public int GetValue() {
        System.out.println(this + " | GetValue() | CALL\n");
        this.SetValue();        //meghívja a SetValue függvényét,a mivel beállítja az értékét
        System.out.println(this + " | GetValue() | RETURN\n");
        return value;           //visszaadja a jelenlegi értékét a hívónak
    }

    public abstract int GetID();

    /**
     *
     * @return
     */
    public abstract void SetValue();

    /**
     *
     * @return
     */
    public abstract void Delete();
}
