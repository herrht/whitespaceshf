package szlab4_whitespaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.Timer;

public class Program implements ActionListener {

    public Project proj;                //a project
    public Test tester;                 //tesztesetek
    public Timer t;
    public ElementView view;

    public Program() {
        t = new Timer(1000, this);
//        System.out.println("Program | Program() | Program konstruktor");        //kiírat
    }

    public void NewProject() {
//        System.out.println("Program | NewProject() | Uj projekt letrehozas");       //kiírat
        proj = new Project();       //egy új projectet kreál
    }

    public void NewTest() {
//        System.out.println("Program | NewTest() | Uj teszter letrehozas");       //kiírat
        tester = new Test(proj);       //egy új tesztet kreál
    }


    public void actionPerformed(ActionEvent actionEvent) {
        proj.Start();
        view.repaint();
      }
     public void SetFreq(int newFreq)    // Frekvenciát állítjuk be
       {
        t.setDelay(newFreq);
       }
}
