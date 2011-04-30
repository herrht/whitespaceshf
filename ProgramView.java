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
        or = new JButton("Or");
        np = new JButton("NewProject");
        save = new JButton("Save");
        load = new JButton("Load");
        fix0 = new JButton("Fix0");
        fix1 = new JButton("Fix1");
        generator = new JButton("Generator");
        composite = new JButton("Composite");
        led = new JButton("Led");
        start = new JButton("Start");
        stop = new JButton("Stop");
        setfreq = new JButton("Setfreq");
        inv = new JButton("Inverter");
        oscill = new JButton("Oscilloscope");
        wire = new JButton("Wire");
        delete = new JButton("Delete");
        sw = new JButton("Switch");

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
