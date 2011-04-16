package szlab4_whitespaces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

    public Project proj;                //a project
    public Test tester;                 //tesztesetek

    public Program() {
        System.out.println("Program | Program() | Program konstruktor");        //kiírat
    }

    public void NewProject() {
        System.out.println("Program | NewProject() | Uj projekt letrehozas");       //kiírat
        proj = new Project();       //egy új projectet kreál
    }

    public void NewTest() {
        System.out.println("Program | NewTest() | Uj teszter letrehozas");       //kiírat
        tester = new Test(proj);       //egy új tesztet kreál
    }

    public void SaveProject() throws IOException //a project mentés függvénye
    {
        /*
        FileWriter fstream = new FileWriter("out.txt");
        BufferedWriter out = new BufferedWriter(fstream);
        //out.write(proj.elements.get(0).toString() + "\n");

        out.close();
         */ //fajl beolvasas em kell valszeg, ide biztos nem

    }

    public void LoadProject() throws IOException //a project töltés függvénye
    {
        

        

    }
}
