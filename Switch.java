package szlab4_whitespaces;

public class Switch extends ASource {

    public Switch(int ID) {

        value = 0;      //a switch értékét beállítjuk az incializáláskor 0-ba
        output = new PinOut(this);      //kreálunk egy kimenő lábat
        this.ID = ID;       //a sorszámát egyenlővé tesszük a paraméterrel
        System.out.println(this + " | Switch() | Switch konstruktor");        //kiírat
    }

    public int GetID() {
        System.out.println(this + " | GetID() | CALL");      //kiírat
        return this.ID;     //visszaadja az elem sorszámát
    }

    /**
     *
     * @return
     */
    public void SwitchOutput() {
//          value = (value == 1) ? 0 : 1;           //ha value 1, akkor 0-ra állítja egyébként 1-re
        System.out.println(this + " | SetValue() | CALL");     //kiírat
    }

    public void Delete() {       //az elem törlő függvénye
        System.out.println(this + " | Delete() | Switch torles fuggvenye ");     //kiírat
        output.Delete();        //törli a kimenő lábat
        //Megpusztítjuk saját magunkat
    }

    /*
    @Override
    public int GetValue() {
        System.out.println(this + " | GetValue() | CALL | RETURN");        //kiírat
        return value;       //visszaadja az elem értékét
    }
*/
    @Override
    public String toString() {
        return "Switch" + ID;
    }

    @Override
    public void SetValue() {
        System.out.printf(this + " | SetValue() | CALL| RETURN\n");      //kiírat
    }
}
