package szlab4_whitespaces;

public class Main
{

    public static void main(String[] args)
    {
        
        // ---- NewProject ----
        System.out.println("Main | Program | progi | Program() | CALL");
        Program progi = new Program();
        System.out.println("\nMain | Program | progi | NewProject() | CALL");
        progi.NewProject();

        /*
        // ---- AddNewElement ----
        // ---- AddNewLed
        System.out.println("\nMain | Project | proj | AddAnd(PinNum) | CALL");
        progi.proj.AddAnd(3);

        // ---- AddNewASource object
        System.out.println("\nMain | Project | proj | AddFix1() | CALL");
        progi.proj.AddFix1();

        // ---- AddGenerator
        System.out.println("\nMain | Project | proj | AddGenerator(rate) | CALL");
        int rate[] = {1,0,1,1};
        progi.proj.AddGenerator(rate);

        // ---- AddInverter
        System.out.println("\nMain | Project | proj | AddInverter() | CALL");
        progi.proj.AddInverter();

        // ---- AddLed
        System.out.println("\nMain | Project | proj | AddLed() | CALL");
        progi.proj.AddLed();

        // ---- AddSwitch
        System.out.println("\nMain | Project | proj | AddSwitch() | CALL");
        progi.proj.AddSwitch();

        // ---- AddWireGateSource
        System.out.println("\nMain | Project | proj | AddWireGateSource(id1,id1-pin,id2) | CALL");
        progi.proj.AddWire(0,0,1);    //0. kapu 0. pin és 1.forras kimenete

        // ---- AddWireGateGate
        System.out.println("\nMain | Project | proj | AddWireGateGate(id1,id1-pin,id2) | CALL");
        progi.proj.AddWire(0,1,3);    //0. kapu 0. pin és 3.kapu kimenete

        // ---- DeleteElement ----
        System.out.println("\nMain | Project | proj | DeleteElement(id) | CALL");
        progi.proj.DeleteElement(0);    //0. kapu törlése
        */
       
        // ---- Teszt1 ----
        System.out.println("\n------------ Teszt1 ------------");

        System.out.println("\nMain | Project | proj | AddLed() | CALL");
        progi.proj.AddLed();
        System.out.println("\nMain | Project | proj | AddAnd(PinNum) | CALL");
        progi.proj.AddAnd(4);
        progi.proj.AddOr(3);
        System.out.println("\nMain | Project | proj | AddFix0() | CALL");
        progi.proj.AddFix0();
        System.out.println("\nMain | Project | proj | AddFix1() | CALL");
        progi.proj.AddFix1();
        System.out.println("\nMain | Project | proj |Start() | CALL");
        progi.proj.Start();


    }   // End of MAIN
}
