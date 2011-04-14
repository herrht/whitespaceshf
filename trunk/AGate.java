package szlab4_whitespaces;

import java.util.*;

public abstract class AGate extends AElement {

    protected Map<Integer, PinIn> inputs;           //PinIn bemeneteket tarolo map
    protected int inputnum;                         //elem bemeneteinek szama

     public abstract void SetValue();


     
}
