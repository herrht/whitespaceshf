package szlab4_whitespaces;

public class Program {

	private Project proj;

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
		Project project1 = new Project();
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