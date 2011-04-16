/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package szlab4_whitespaces;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.lang.String;
/**
 *
 * @author darkmoonka
 */
public class Command
{
    String name;
    String par;
    Project proj;

    Command(Project proj, String name, String par)
    {   
        this.proj = proj;
        this.name = name;
        this.par = par; //a konstruktorban megadott paramétert bemásoljuk a parancs paraméterlistájába.
               

    }
    
    void run()
    {
        int param[] = new int[par.length()];
        int tmp;
        for (int i = 0; i < par.length(); i++)
        {   
            tmp = Integer.valueOf(par.substring(i, i+1));
            
            param[i] = tmp;            
        }
       
        if(name.equals("AddAnd")) // a switchnél nem lehet Stringet használni, mert régi a java
        {
            proj.AddAnd(param[0]);
        }
        if(name.equals("AddOr"))
        {
            proj.AddOr(param[0]);
        }
        if(name.equals("AddInverter"))
        {
            proj.AddInverter();
        }
        if(name.equals("AddFix1"))
        {
            proj.AddFix1();
        }
        if(name.equals("AddFix0"))
        {
            proj.AddFix0();
        }
        if(name.equals("AddLed"))
        {
            proj.AddLed();
        }
        if(name.equals("AddGenerator"))
        {
            proj.AddGenerator(param);
        }
        if(name.equals("AddSwitch"))
        {
            proj.AddSwitch();
        }
        if(name.equals("AddOscilloscope"))
        {
            proj.AddOscilliscope();
        }
        if(name.equals("AddCompozite"))
        {
            proj.AddComposite();
        }
        if(name.equals("AddWire"))
        {
            proj.AddWire(param[0], param[1],param[2],param[3]);
        }
        
         if(name.equals("Start"))
        {
            proj.Start();
        }

    }
}


