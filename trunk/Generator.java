package szlab4_whitespaces;

public class Generator extends ASource {

	private int[] outputs;
	private int counter;

	public Generator(int[] rate) {
            System.out.println("Generator | Generator(rate)| Generator konstruktor");
            this.output = new PinOut();
//		counter = 0;
//              outputs = rate;
//              value = outputs[0];
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