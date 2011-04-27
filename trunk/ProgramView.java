/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package szlab4_whitespaces;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;

/**
 *
 * @author Burgosz
 */
public class ProgramView extends Panel {

    public ElementView view;
    public Panel buttonpane;
    public Button and;
    public Button or;
    public Button np;
    public Button save;
    public Button load;
    public Button fix0;
    public Button fix1;
    public Button generator;
    public Button composite;
    public Button led;
    public Button start;
    public Button stop;
    public Button setfreq;
    public Button inv;
    public Button oscill;
    public Button wire;
    public Button delete;
    public Button help;
    public Button sw;

    public ProgramController pc;

    public ProgramView() {

        and = new Button("And");
        or = new Button("Or");
        np = new Button("NewProject");
        save = new Button("Save");
        load = new Button("Load");
        fix0 = new Button("Fix0");
        fix1 = new Button("Fix1");
        generator = new Button("Generator");
        composite = new Button("Composite");
        led = new Button("Led");
        start = new Button("Start");
        stop = new Button("Stop");
        setfreq = new Button("Setfreq");
        inv = new Button("Inverter");
        oscill = new Button("Oscilloscope");
        wire = new Button("Wire");
        delete = new Button("Delete");
        sw = new Button("Switch");

        view = new ElementView();
        pc = new ProgramController(view);

        and.addActionListener(pc);
        or.addActionListener(pc);
        np.addActionListener(pc);
        save.addActionListener(pc);
        load.addActionListener(pc);
        fix0.addActionListener(pc);
        fix1.addActionListener(pc);
        generator.addActionListener(pc);
        composite.addActionListener(pc);
        led.addActionListener(pc);
        start.addActionListener(pc);
        stop.addActionListener(pc);
        setfreq.addActionListener(pc);
        inv.addActionListener(pc);
        oscill.addActionListener(pc);
        wire.addActionListener(pc);
        delete.addActionListener(pc);
        sw.addActionListener(pc);

        buttonpane = new Panel();
        buttonpane.setLayout(new GridLayout(2, 8));
        buttonpane.add(np);
        buttonpane.add(save);
        buttonpane.add(load);
        buttonpane.add(fix0);
        buttonpane.add(and);
        buttonpane.add(generator);
        buttonpane.add(composite);
        buttonpane.add(led);
        buttonpane.add(start);
        buttonpane.add(stop);
        buttonpane.add(setfreq);
        buttonpane.add(fix1);
        buttonpane.add(inv);
        buttonpane.add(or);
        buttonpane.add(oscill);
        buttonpane.add(wire);
        buttonpane.add(delete);
        buttonpane.add(sw);

        setLayout(new BorderLayout());
        add("North", buttonpane);
        buttonpane.setSize(800, 20);
        add("Center", view);
    }

    public void createFrame() {
        Frame frame = new Frame("Electrical Network Development Suite 1.0");
        frame.addWindowListener(
                new WindowAdapter() {

            @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);

                    }
                });
        frame.add(this);
        frame.setSize(800, 620);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
