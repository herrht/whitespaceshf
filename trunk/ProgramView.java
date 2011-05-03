/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package szlab4_whitespaces;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Burgosz
 */
public class ProgramView extends JPanel {

    public ElementView view;
    public JPanel Buttonpane;
    public JButton and;
    public JButton or;
    public JButton np;
    public JButton save;
    public JButton load;
    public JButton fix0;
    public JButton fix1;
    public JButton generator;
    public JButton composite;
    public JButton led;
    public JButton start;
    public JButton stop;
    public JButton setfreq;
    public JButton inv;
    public JButton oscill;
    public JButton wire;
    public JButton delete;
    public JButton help;
    public JButton sw;
    
    public ProgramController pc;

    public ProgramView() {

        and = new JButton("And");
        and.setToolTipText("Add a new AND gate to the project.");
        or = new JButton("Or");
        and.setToolTipText("Add a new OR gate to the project.");
        np = new JButton("NewProject");
        np.setToolTipText("Create a new project.");
        save = new JButton("Save");
        save.setToolTipText("Save the current project.");
        load = new JButton("Load");
        load.setToolTipText("Load an existing project.");
        fix0 = new JButton("Fix0");
        fix0.setToolTipText("Add a new FIX0 to the project.");
        fix1 = new JButton("Fix1");
        fix1.setToolTipText("Add a new FIX1 to the project.");
        generator = new JButton("Generator");
        generator.setToolTipText("Add a new Generator to the project.");
        composite = new JButton("Composite");
        led = new JButton("Led");
        led.setToolTipText("Add a new Led to the project.");
        start = new JButton("Start");
        start.setToolTipText("Start the simulation.");
        stop = new JButton("Stop");
        stop.setToolTipText("Stop the simulation.");
        setfreq = new JButton("Setfreq");
        setfreq.setToolTipText("Setup the frequency of the simulation.");
        inv = new JButton("Inverter");
        inv.setToolTipText("Add a new Inverter to the project.");
        oscill = new JButton("Oscilloscope");
        oscill.setToolTipText("Add a new Oscilloscope to the project");
        wire = new JButton("Wire");
        wire.setToolTipText("Connect the elements with a wire.");
        delete = new JButton("Delete");
        delete.setToolTipText("Delete an existing element.");
        sw = new JButton("Switch");
        sw.setToolTipText("Add a Switch to the project.");

        view = new ElementView();
        pc = new ProgramController(view);

        and.addActionListener(pc);
        and.setIgnoreRepaint(true);
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



        Buttonpane = new JPanel();
        Buttonpane.setLayout(new GridLayout(2, 8));
        Buttonpane.add(np);
        Buttonpane.add(save);
        Buttonpane.add(load);
        Buttonpane.add(composite);
        Buttonpane.add(fix0);
        Buttonpane.add(and);
        Buttonpane.add(sw);
        Buttonpane.add(oscill);
        Buttonpane.add(led);

        Buttonpane.add(start);
        Buttonpane.add(stop);
        Buttonpane.add(setfreq);
        Buttonpane.add(delete);
        Buttonpane.add(fix1);
        Buttonpane.add(or);
        Buttonpane.add(inv);
        Buttonpane.add(generator);
        Buttonpane.add(wire);

        setLayout(new BorderLayout());
        add("North", Buttonpane);
        Buttonpane.setSize(1000, 20);
        add("Center", view);
    }

    public void createFrame() {
        JFrame frame = new JFrame("Electrical Network Development Suite 1.0");
        frame.addWindowListener(
                new WindowAdapter() {

            @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);

                    }
                });
        frame.add(this);
        frame.setSize(1000, 620);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
