package szlab4_whitespaces;

import java.awt.*;
import java.awt.event.*;

public class ProgramController implements ActionListener {

    private ElementView view;
    private Program progi;
    private String flag;
    private Coordinate c;
    private AElement el;

    public ProgramController(ElementView v) {

        c = new Coordinate(0, 0);
        progi = new Program();
        progi.NewProject();
        view = v;
        flag = "IDLE";
        view.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (flag.equals("AND")) {
                    int i = progi.proj.AddAnd(2);
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.repaint();

                    flag = "IDLE";
                }
                if (flag.equals("OR")) {
                    int i = progi.proj.AddOr(2);
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.repaint();

                    flag = "IDLE";
                }
                if (flag.equals("INV")) {
                    int i = progi.proj.AddInverter();
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.repaint();

                    flag = "IDLE";
                }
                if (flag.equals("F0")) {
                    int i = progi.proj.AddFix0();
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.repaint();

                    flag = "IDLE";
                }
                if (flag.equals("F1")) {
                    int i = progi.proj.AddFix1();
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.update();

                    flag = "IDLE";
                }
                if (flag.equals("GEN")) {
                    int[] rate = {0, 1}; // majd meg kell írni a beolvasását valahogy
                    int i = progi.proj.AddGenerator(rate);
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.update();

                    flag = "IDLE";
                }
                if (flag.equals("COMP")) {
                    int i = progi.proj.AddComposite();
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.update();

                    flag = "IDLE";
                }
                if (flag.equals("LED")) {
                    int i = progi.proj.AddLed();
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.update();

                    flag = "IDLE";
                }
                if (flag.equals("OSC")) {
                    int i = progi.proj.AddOscilliscope();
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.update();

                    flag = "IDLE";
                }
                if (flag.equals("WIRE1")) {
                    //valahogy be kell, majd olvasni a Canvasról, hogy melyik kapura kattintok (ez lesz a forrás)
                    //el kell tárolni az első kattintás kapuját, és bekérni a láb számát
                    flag = "WIRE2";

                }
                if (flag.equals("WIRE2")) {
                    //második kattintás kapuját el kell tárolni (ez lesz a cél)
                    //be kell kérni a láb számát
                    // a két kapuval meg a 2 lábbal meg kell hívni az AddWire-t és eltárolni, a view hasmapjában is
                    flag = "IDLE";

                }
                if (flag.equals("DEL")) {
                    // be kell olvasni, hogy hova kattintottunk és kijelölni azt az elemet, majd meghívni rá a Delete() fv-t
                    // majd ezt is kitaláljuk.
                    flag = "IDLE";
                }
                if (flag.equals("SW")) {
                    int i = progi.proj.AddSwitch();
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.update();
                    flag = "IDLE";
                }
                if (flag.equals("IDLE")) {
                    //majd..
                }
                if (flag.equals("GRAB")) {
                    //majd..
                }





            }
        });

    }

    public void actionPerformed(ActionEvent e) {
        Button tmp = (Button) e.getSource();
        if (tmp.getLabel().equals("And")) {
            flag = "AND";
        } else if (tmp.getLabel().equals("Or")) {
            flag = "OR";
        } else if (tmp.getLabel().equals("Inverter")) {
            flag = "INV";
        } else if (tmp.getLabel().equals("Fix0")) {
            flag = "F0";
        } else if (tmp.getLabel().equals("Fix1")) {
            flag = "F1";
        } else if (tmp.getLabel().equals("Generator")) {
            flag = "GEN";
        } else if (tmp.getLabel().equals("NewProject")) {
            view.elements.clear();
            progi.NewProject();
            view.update();
        } else if (tmp.getLabel().equals("Save")) {
            //Még implementálni kell
        } else if (tmp.getLabel().equals("Load")) {
            //Még implementálni kell
        } else if (tmp.getLabel().equals("Composite")) {
            flag = "COMP";
        } else if (tmp.getLabel().equals("Led")) {
            flag = "LED";
        } else if (tmp.getLabel().equals("Start")) {
            view.repaint();
        } else if (tmp.getLabel().equals("Stop")) {
            //Még implementálni kell
        } else if (tmp.getLabel().equals("Setfreq")) {
            //Még implementálni kell
        } else if (tmp.getLabel().equals("Oscilloscope")) {
            flag = "OSC";
        } else if (tmp.getLabel().equals("Wire")) {
            flag = "WIRE1";
        } else if (tmp.getLabel().equals("Delete")) {
            flag = "DEL";
        } else if (tmp.getLabel().equals("Switch")) {
            flag = "SW";
        }



    }
}
