package szlab4_whitespaces;

import java.util.*;

public abstract class Pin {

    protected int ID;
    protected int value;            //a láb értéke
    protected AElement elem;        //itt tároljuk el,hogy a láb melyik elemhez tartozik

    public abstract void SetValue();

    public int GetValue() {
        System.out.println(this + " | Pin GetValue() |CALL");     //kiírat
        this.SetValue();        //meghívja a saját SetValue függvényét
        System.out.println(this + " | Pin GetValue() |RETURN");       //kiírat
        return value;       //visszaadja a láb értékét
    }

//    abstract public void SetWire(Wire w);
}
