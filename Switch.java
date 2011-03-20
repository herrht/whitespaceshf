package szlab4_whitespaces;

public class Switch extends ASource {

    public Switch(int ID) {

        value = 0;      //a switch értékét beállítjuk az incializáláskor 0-ba
        output = new PinOut(this);      //kreálunk egy kimenő lábat
        this.ID = ID;       //a sorszámát egyenlővé tesszük a paraméterrel
        System.out.println(this+" | Switch() | Switch konstruktor");        //kiírat
    }

    public int GetID() {
        System.out.printf("Switch |GetID() | CALL\n");      //kiírat

        return this.ID;     //visszaadja az elem sorszámát
    }

    /**
     *
     * @return
     */
    public void SetValue() {
//          value = (value == 1) ? 0 : 1;           //ha value 1, akkor 0-ra állítja egyébként 1-re
        System.out.printf(this+" | SetValue()|CALL\n");     //kiírat


    }

    public void Delete(){       //az elem törlő függvénye
        System.out.println("Switch | Delete() | Switch torles fuggvenye ");     //kiírat
        output.Delete();        //törli a kimenő lábat
        //Megpusztítjuk saját magunkat
    }

    @Override
    public int GetValue(){
        System.out.printf(this+" | GetValue() |CALL |RETURN\n");        //kiírat
        return value;       //visszaadja az elem értékét
    }


    @Override
    public String toString() {
        return "Switch" + ID;
    }
}
