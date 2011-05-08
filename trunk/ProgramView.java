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

//A program kinézetéért felelős osztály. Ez egy JPanel.
public class ProgramView extends JPanel {

    private ElementView view; //Az elemeket megjelenítő objektumra mutató pointer
    private JPanel Buttonpane; // A gombokat megjelenítő panel
    private JButton and;       // A megfelelő funkciókat megvalósító gombok
    private JButton or;
    private JButton np;
    private JButton save;
    private JButton load;
    private JButton fix0;
    private JButton fix1;
    private JButton generator;
    private JButton composite;
    private JButton led;
    private JButton start;
    private JButton stop;
    private JButton setfreq;
    private JButton inv;
    private JButton oscill;
    private JButton wire;
    private JButton delete;
    private JButton help;
    private JButton sw;
    
    private ProgramController pc; //A ProgramControllerre mutató pointer, ez fogja a gombokat kezelni.

    public ProgramView() {

        and = new JButton("And"); //And gomb létrehozása
        and.setToolTipText("Add a new AND gate to the project."); //A gomb tooltipje
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

        view = new ElementView(); //Új ElementView példányosítása.
        pc = new ProgramController(view); //Új ProgramController példányosítása

        and.addActionListener(pc); //A pc beállítása a gombok ActionListenerjének
        and.setIgnoreRepaint(true); // A gomb villogásának kikapcsolása
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



        Buttonpane = new JPanel(); //A gombokat tároló panel létrehozása
        Buttonpane.setLayout(new GridLayout(2, 8)); //A panel layoutjának beállítása (2x8-as táblázatban lesznek a gombok elrendezve
        Buttonpane.add(np); //A gombok hozzáadása a panelhez
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

        setLayout(new BorderLayout()); //A ProgramView layoutjának beállítása.
        add("North", Buttonpane); //Felülre kerülnek a gombok
        Buttonpane.setSize(1000, 20);
        add("Center", view); //Alulra kerül a ProgramView
    }

    //createFrame fv amely létrehozza az ablakot
    public void createFrame() {
        JFrame frame = new JFrame("Electrical Network Development Suite 1.0"); //Az ablak címe
        frame.addWindowListener(
                new WindowAdapter() {

            @Override
                    public void windowClosing(WindowEvent e) { //A bezárás gomb aktiválása
                        System.exit(0);

                    }
                });
        frame.add(this); //Az ablakhoz hozzáadjuk a ProgramView-t
        frame.setSize(1000, 620);
        frame.setResizable(false); //Az ablak átméretezésének letiltása
        frame.setVisible(true); //Az ablak láthatóságának beállítása
    }
}
