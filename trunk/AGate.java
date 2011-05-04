package szlab4_whitespaces;

import java.util.*;

public abstract class AGate extends AElement {

    protected Map<Integer, PinIn> inputs;           //PinIn bemeneteket tarolo map
    protected int inputnum;                         //elem bemeneteinek szama

     public abstract void SetValue();

     public int getInputnum(){
         return inputnum;
     }

     public boolean pinIsUsed(int i){
         return inputs.get(i).used();
     }
     public void resetPins(){
         for (int i = 0; i <inputnum; i++){
             inputs.get(i).resetValue();
         }
     }
    
}
