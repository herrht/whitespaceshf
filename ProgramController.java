package szlab4_whitespaces;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class ProgramController extends JPanel implements ActionListener {

    private ElementView view;
    private Program progi;
    private String flag;
    private Coordinate c;
    private AElement el;
    private JFileChooser fc;
    private Dialog dial;
    private int size;

    public ProgramController (ElementView v) {


        fc = new JFileChooser();
        c = new Coordinate(0, 0);
        progi = new Program();
        progi.NewProject();
        view = v;
        flag = "IDLE";
        view.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (flag.equals("AND")) {
                   
                    
                    String s = JOptionPane.showInputDialog(null, "Mekkora legyen a kapu?");
                    if (s != null){
                    size = Integer.valueOf(s);
                    int i = progi.proj.AddAnd(size);
                    c = new Coordinate(e.getX(), e.getY());
                    AElement el = (AElement) progi.proj.elements.get(i);
                    view.elements.put(c, el);
                    view.repaint();}

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
        JButton tmp = (JButton) e.getSource();

        if (tmp.getText().equals("And")) {
            flag = "AND";
        } else if (tmp.getText().equals("Or")) {
            flag = "OR";
        } else if (tmp.getText().equals("Inverter")) {
            flag = "INV";
        } else if (tmp.getText().equals("Fix0")) {
            flag = "F0";
        } else if (tmp.getText().equals("Fix1")) {
            flag = "F1";
        } else if (tmp.getText().equals("Generator")) {
            flag = "GEN";
        } else if (tmp.getText().equals("NewProject")) {
            view.elements.clear();
            progi.NewProject();
            view.update();
        } else if (tmp.getText().equals("Save")) {
            //Még implementálni kell
        } else if (tmp.getText().equals("Load")) {
            int returnVal = fc.showOpenDialog(ProgramController.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                Load(file);
            }

        } else if (tmp.getText().equals("Composite")) {
            flag = "COMP";
        } else if (tmp.getText().equals("Led")) {
            flag = "LED";
        } else if (tmp.getText().equals("Start")) {
            view.repaint();
        } else if (tmp.getText().equals("Stop")) {
            //Még implementálni kell
        } else if (tmp.getText().equals("Setfreq")) {
            //Még implementálni kell
        } else if (tmp.getText().equals("Oscilloscope")) {
            flag = "OSC";
        } else if (tmp.getText().equals("Wire")) {
            flag = "WIRE1";
        } else if (tmp.getText().equals("Delete")) {
            flag = "DEL";
        } else if (tmp.getText().equals("Switch")) {
            flag = "SW";
        }

    }
    public void Load(File f){

     }
 
    
}
