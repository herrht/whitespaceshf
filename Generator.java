package szlab4_whitespaces;

public class Generator extends ASource {

	private int[] outputs;
	private int counter;

	/**
	 * 
	 * @param output
	 * @return 
	 */
	public Generator(int[] output) {
//		counter = 0;
//                outputs = output;
//                value = outputs[0];
	}

	/**
	 * 
	 * @return 
	 */
	public void SetValue() {
//		value = outputs[counter];
             System.out.printf(" | SetValue() | CALL\n");
	}

	/**
	 * 
	 * @return 
	 */
	public void Shift() {
//		counter++;
//               SetValue();
             System.out.printf(" | Shift() | CALL\n");

	}

}