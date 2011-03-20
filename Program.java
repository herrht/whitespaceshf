package szlab4_whitespaces;

public class Program {

	public Project proj;        //a project

	/**
	 * 
	 * @return 
	 */
	public Program() {
                System.out.println("Program | Program() | Program konstruktor");        //kiírat
	}

	/**
	 * 
	 * @return 
	 */
	public void NewProject() {
                System.out.println("Program | NewProject() | Uj projekt letrehozas");       //kiírat
                proj = new Project();       //egy új projectet kreál
	}

	/**
	 * 
	 * @return 
	 */
	public void SaveProject()       //a project mentés függvénye
        {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public void LoadProject()       //a project töltés függvénye
        {
		throw new UnsupportedOperationException();
	}

}