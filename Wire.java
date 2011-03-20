package szlab4_whitespaces;

public class Wire extends AElement {

    private PinIn output;           //A kapott Elem kimenete lesz a Vezeték bemene
    private PinOut input;           //A kapott Elem bemenete lesz a Vezeték kimenete

    /**
     *
     * @param input
     * @param output
     * @return
     */
    public Wire(PinIn input, PinOut output, int ID) {
//      public Wire(int id1, int id1_p, int id2, int id2_p, int ID)

        
//          System.out.println("Wire | Wire(Elem: "+id1+", Pin: "+id1_p+"; "+ "Elem2: "+id2+", Pin2: "+id2_p+") | Wire konstruktor");

        this.input = output;    //A kapott Elem kimenete lesz a Vezeték bemene
        this.output = input;    //A kapott Elem bemenete lesz a Vezeték kimenete
        this.ID = ID;       //a sorszámát egyenlővé tesszük a paraméterrel
        System.out.println(this+ " | Wire(Lab1: " + input + ", Lab2: " + output+")");          //kiírat
    }

    public int GetID() {
        System.out.printf("Wire |GetID() | CALL\n");        //kiírat

        return this.ID;     //visszaadja az elem sorszámát
    }

    /**
     *
     * @return
     */
    public void SetValue() {
        System.out.printf(this+" | SetValue() | CALL\n");       //kiírat
        value = input.GetValue();       //az elem értékét egyenlővé teszi a bemenő lábbal
        System.out.printf(this+" | SetValue() | RETURN\n");     //kiírat
    }

    public void Delete(){       //a wire törlő függvénye, ami törli a wiret, de a lábakat nem, mivel azokat még az elemek használják
        System.out.println("Wire | Delete() | Wire torles fuggvenye ");     //kiírat
//        input.Delete();
//        output.Delete();
        // Láb törlés nem kell, hiszen az adott elem még használja
        //Megpusztítjuk saját magunkat
    }

    ;

    @Override
    public String toString() {
        return "Wire"+ID+" between " + input +" and "+output;
    }
}
