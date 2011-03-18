package szlab4_whitespaces;

public class Generator extends ASource
{

	private int[] outputs;
	private int counter;

	public Generator(int[] rate, int ID)
        {
            System.out.println("Generator | Generator(rate)| Generator konstruktor");
            this.output = new PinOut();
            this.ID = ID;
//		counter = 0;
//              outputs = rate;
//              value = outputs[0];
	}

	/**
	 * 
	 * @return 
	 */
	public void SetValue()
        {
//          value = outputs[counter];
            System.out.printf("Generator | SetValue() | CALL\n");
	}

	/**
	 * 
	 * @return 
	 */
	public void Shift()
        {
//		counter++;
//               SetValue();
             System.out.printf("Generator | Shift() | CALL\n");

	}

}