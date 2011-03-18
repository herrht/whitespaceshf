package szlab4_whitespaces;

public class Program {

	public Project proj;

	/**
	 * 
	 * @return 
	 */
	public Program() {
                System.out.println("Program | Program() | Program konstruktor");
	}

	/**
	 * 
	 * @return 
	 */
	public void NewProject() {
                System.out.println("Program | NewProject() | Uj projekt letrehozas");
                proj = new Project();
	}

	/**
	 * 
	 * @return 
	 */
	public void SaveProject() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return 
	 */
	public void LoadProject() {
		throw new UnsupportedOperationException();
	}

}