package szlab4_whitespaces;

public class Fix1 extends ASource {

    public Fix1(int ID) {
        value = 1;
        output = new PinOut(this);
        this.ID = ID;
        System.out.println(this+" | Fix1()| Fix1 konstruktor");
    }

    public int GetID() {
        System.out.printf("Fix1 |GetID() | CALL\n");

        return this.ID;
    }

    public void SetValue() {        //jópofa h van ilyenje :D
//		value = 1;
        System.out.printf(this+" | SetValue() | CALL| RETURN\n");
    }

    public void Delete(){
        System.out.println("Fix1 | Delete() | Fix1 torles fuggvenye ");
        output.Delete();
        //Megpusztítjuk saját magunkat
    }

    ;

    @Override
    public String toString() {
        return "Fix1_" + ID;
    }
}
