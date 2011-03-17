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
		counter = 0;
                outputs = output;
                value = outputs[0];
	}

	/**
	 * 
	 * @return 
	 */
	public void SetValue() {
		value = outputs[counter];
	}

	/**
	 * 
	 * @return 
	 */
	public void Shift() {
		counter++;
                SetValue();

	}

}