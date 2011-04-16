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
    int param[];
    Project proj;

    Command(Project proj, String name, int param[])
    {   
        this.proj = proj;
        param = new int[4];
        this.name = name;
        this.param = param;
    }
    
    void run()
    {
        if(name.equals("AddAnd"))
        {
            int tmp = param[0];
            proj.AddAnd(tmp);
        }
        if(name.equals("AddOr"))
        {
            int tmp = param[0];
            proj.AddOr(tmp);
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
    }
}


