package szlab4_whitespaces;

public class Fix1 extends ASource {

    public Fix1(int ID) {
        value = 1;      //1-re állítja az elem értékét inicializáláskor
        output = new PinOut(this);      //kreál egy kimenő lábat
        this.ID = ID;       //a sorszmot egyenlővé teszi a paraméterrel
        System.out.println(this+" | Fix1()| Fix1 konstruktor");     //kiírat
    }

    public int GetID() {
        System.out.printf("Fix1 |GetID() | CALL\n");        //kiírat

        return this.ID;     //visszaadja az elem sorszámát
    }

    public void SetValue() {        //semmi értelme
//		value = 1;
        System.out.printf(this+" | SetValue() | CALL| RETURN\n");       //kiírat
    }

    public void Delete(){
        System.out.println("Fix1 | Delete() | Fix1 torles fuggvenye ");     //kiírat
        output.Delete();        //törli a kimenő lábat
        //Megpusztítjuk saját magunkat
    }

    ;

    @Override
    public String toString() {
        return "Fix1_" + ID;
    }
}
