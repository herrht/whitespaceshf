package szlab4_whitespaces;

public class Switch extends ASource {

    public Switch(int ID) {

        value = 0;
        output = new PinOut(this);
        this.ID = ID;
        System.out.println(this+" | Switch() | Switch konstruktor");
    }

    public int GetID() {
        System.out.printf("Switch |GetID() | CALL\n");

        return this.ID;
    }

    /**
     *
     * @return
     */
    public void SetValue() {
//          value = (value == 1) ? 0 : 1;           //ha value 1, akkor 0-ra állítja egyébként 1-re
        System.out.printf("Switch | SetValue() | CALL\n");

    }

    public void Delete() {
    }

    ;

    @Override
    public String toString() {
        return "Switch" + ID;
    }
}
