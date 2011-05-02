package szlab4_whitespaces;

public class Wire extends AElement {

    private PinIn output;           //A kapott Elem kimenete lesz a Vezeték bemene
    private PinOut input;           //A kapott Elem bemenete lesz a Vezeték kimenete

    public Wire(PinIn input, PinOut output, int ID) {
        this.ID = ID;       //a sorszámát egyenlővé tesszük a paraméterrel
        this.input = output;    //A kapott Elem kimenete lesz a Vezeték bemene
        this.output = input;    //A kapott Elem bemenete lesz a Vezeték kimenete
        System.out.println("Sikeresen hozzáadott egy vezetéket a "+input+" és a "+output+" közé.");          //kiírat
    }

    public int GetID() {
        System.out.println(this + " | GetID() | CALL");        //kiírat
        return this.ID;     //visszaadja az elem sorszámát
    }

    public void SetValue() {
//        System.out.println(this + " | SetValue() | CALL");       //kiírat
        value = input.GetValue();       //az elem értékét egyenlővé teszi a bemenő lábbal
        //System.out.println(this + " | SetValue() | RETURN");     //kiírat
    }

    public void Delete() {       //a wire törlő függvénye, ami törli a wiret, de a lábakat nem, mivel azokat még az elemek használják
        System.out.println("Wire | Delete() | Wire torles fuggvenye ");     //kiírat
//        input.Delete();
//        output.Delete();
        // Láb törlés nem kell, hiszen az adott elem még használja
        //Megpusztítjuk saját magunkat
    }

    @Override
    public String toString() {
        return "AddWire " + output + input;
    }

    @Override
    public String toFile1() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toFile2() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
