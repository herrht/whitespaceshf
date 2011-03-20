package szlab4_whitespaces;

public class Generator extends ASource {

    private int[] outputs;      //a generátorban lévő számsor ami váltakozik shiftelés esetén
    private int counter;        //a generátorban lévő számláló

    public Generator(int[] rate, int ID) {

        this.output = new PinOut(this);     //kreál egy kimenő lábat
        this.ID = ID;       //a sorszmáot egyenlővé teszi a paraméterrel
//		counter = 0;
//              outputs = rate;
//              value = outputs[0];
        System.out.println(this+" | Generator(rate)| Generator konstruktor");       //kiírat
    }

    public int GetID() {
        System.out.printf("Generator |GetID() | CALL\n");       //kiírat

        return this.ID;     //visszaadja az elem sorszámát
    }

    /**
     *
     * @return
     */
    public void SetValue() {
//          value = outputs[counter];
        System.out.printf("Generator | SetValue() | CALL\n");           //kiírat
    }

    /**
     *
     * @return
     */
    public void Shift() {       //az elem léptető függvénye, változtatja a kimenő értéket a benne tárolt számsor alapján
//		counter++;
//               SetValue();
        System.out.printf("Generator | Shift() | CALL\n");      //kiírat

    }

    public void Delete(){       //az elem törlő függvénye, törli a kimenő lábát
        System.out.println("Generator | Delete() | Generator torles fuggvenye ");
        output.Delete();
        //Megpusztítjuk saját magunkat
    }

    ;

    @Override
    public String toString() {
        return "Generator" + ID;
    }
}
