package szlab4_whitespaces;

public class Fix0 extends ASource {

    public Fix0(int ID) {
        value = 0;
        output = new PinOut(this);
        this.ID = ID;
        System.out.println(this+" | Fix0()| Fix0 konstruktor");
    }

    public int GetID() {
        System.out.printf("Fix0 |GetID() | CALL\n");

        return this.ID;
    }

    public void SetValue() {        //jópofa h van ilyenje :D
//		value = 0;
        System.out.printf("Fix0 | SetValue() | CALL\n");
    }

    public void Delete() {
    }

    ;

    @Override
    public String toString() {
        return "Fix0_" + ID;
    }
}
