/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package szlab4_whitespaces;




/**
 *
 * @author darkmoonka
 */
public class Command {

    String name;
    String par[];
    Project proj;
    ElementView view;

    Command(Project proj, String name, String par[], ElementView view) {
        this.proj = proj;
        this.name = name;
        this.par = par; //a konstruktorban megadott paramétert bemásoljuk a parancs paraméterlistájába.
        this.view = view;


    }

    void run() {
        int param[] = new int[par.length];
        int tmp, id;

        if (name.equals("AddGenerator"))
        {
           String s = par[2];
           param = new int[s.length()];
           for (int i=0; i< s.length(); i++){
               tmp = Integer.valueOf(s.substring(i, i+1));
               param[i] = tmp;
           }
           id = proj.AddGenerator(param);
           Coordinate c = new Coordinate(Integer.valueOf(par[0]), Integer.valueOf(par[1]));
           view.elements.put(c, proj.elements.get(id));
           view.c.add(c);
           view.repaint();
           
        } else {
            for (int i = 0; i < par.length; i++) {
                tmp = Integer.valueOf(par[i]);
                param[i] = tmp;
            }

            if (name.equals("AddAnd")) // a switchnél nem lehet Stringet használni, mert régi a java
            {
                Coordinate c = new Coordinate(param[0], param[1]);
                id = proj.AddAnd(param[2]);
                view.elements.put(c, proj.elements.get(id));
                view.c.add(c);
                view.repaint();

            }
            if (name.equals("AddOr")) {
                Coordinate c = new Coordinate(param[0], param[1]);
                id = proj.AddOr(param[2]);
                view.elements.put(c, proj.elements.get(id));
                view.c.add(c);
                view.repaint();
            }
            if (name.equals("AddInverter")) {
                Coordinate c = new Coordinate(param[0], param[1]);
                id = proj.AddInverter();
                view.elements.put(c, proj.elements.get(id));
                view.c.add(c);
                view.repaint();
            }
            if (name.equals("AddFix1")) {
                Coordinate c = new Coordinate(param[0], param[1]);
                id = proj.AddFix1();
                view.elements.put(c, proj.elements.get(id));
                view.c.add(c);
                view.repaint();
            }
            if (name.equals("AddFix0")) {
                Coordinate c = new Coordinate(param[0], param[1]);
                id = proj.AddFix0();
                view.elements.put(c, proj.elements.get(id));
                view.c.add(c);
                view.repaint();
            }
            if (name.equals("AddLed")) {
                Coordinate c = new Coordinate(param[0], param[1]);
                id = proj.AddLed();
                view.elements.put(c, proj.elements.get(id));
                view.c.add(c);
                view.repaint();
            }
            if (name.equals("AddSwitch")) {
                Coordinate c = new Coordinate(param[0], param[1]);
                id = proj.AddSwitch();
                view.elements.put(c, proj.elements.get(id));
                view.c.add(c);
                view.repaint();
            }
            if (name.equals("AddOscilloscope")) {
                Coordinate c = new Coordinate(param[0], param[1]);
                id = proj.AddOscilloscope();
                view.elements.put(c, proj.elements.get(id));
                view.c.add(c);
                view.repaint();
            }
            if (name.equals("AddCompozite")) {
                Coordinate c = new Coordinate(param[0], param[1]);
                id = proj.AddOscilloscope();
                view.elements.put(c, proj.elements.get(id));
                view.c.add(c);
                view.repaint();
            }
            if (name.equals("AddWire")) {
                proj.AddWire(param[0], param[1], param[2], param[3]);
            }

            if (name.equals("Start")) {
                proj.Start();
            }

        }
    }
}
