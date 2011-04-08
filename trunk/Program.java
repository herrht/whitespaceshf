package szlab4_whitespaces;

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

    public void SaveProject() //a project mentés függvénye
    {
        throw new UnsupportedOperationException();
    }

    public void LoadProject() //a project töltés függvénye
    {
        throw new UnsupportedOperationException();
    }
}
