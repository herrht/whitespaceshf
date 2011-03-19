package szlab4_whitespaces;

public class Generator extends ASource {

    private int[] outputs;
    private int counter;

    public Generator(int[] rate, int ID) {

        this.output = new PinOut(this);
        this.ID = ID;
//		counter = 0;
//              outputs = rate;
//              value = outputs[0];
        System.out.println(this+" | Generator(rate)| Generator konstruktor");
    }

    public int GetID() {
        System.out.printf("Generator |GetID() | CALL\n");

        return this.ID;
    }

    /**
     *
     * @return
     */
    public void SetValue() {
//          value = outputs[counter];
        System.out.printf("Generator | SetValue() | CALL\n");
    }

    /**
     *
     * @return
     */
    public void Shift() {
//		counter++;
//               SetValue();
        System.out.printf("Generator | Shift() | CALL\n");

    }

    public void Delete() {
    }

    ;

    @Override
    public String toString() {
        return "Generator" + ID;
    }
}
