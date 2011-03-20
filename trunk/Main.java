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
        progi.proj.AddWire(0,1,3);    //0. kapu 1. pin és 3.kapu kimenete

        // ---- DeleteElement ----
        System.out.println("\nMain | Project | proj | DeleteElement(id) | CALL");
        progi.proj.DeleteElement(0);    //0. kapu törlése
        */
       
        // ---- Teszt1 ----

        /*
        System.out.println("\n------------ Teszt1 ------------");

        System.out.println("\nMain | Project | proj | AddLed() | CALL");
        progi.proj.AddLed();
        System.out.println("\nMain | Project | proj | AddAnd(PinNum) | CALL");
        progi.proj.AddAnd(2);
        System.out.println("\nMain | Project | proj | AddFix0() | CALL");
        progi.proj.AddFix0();
        System.out.println("\nMain | Project | proj | AddFix1() | CALL");
        progi.proj.AddFix1();
        System.out.println("\nÖszeköttetések:\n");
        System.out.println("Main | Project | proj | AddWire(1,0,2) CALL");
        progi.proj.AddWire(1, 0, 2);
        System.out.println("Main | Project | proj | AddWire(1,1,2) CALL");
        progi.proj.AddWire(1, 1, 3);
        System.out.println("Main | Project | proj | AddWire(0,0,1) CALL");
        progi.proj.AddWire(0, 0, 1);
        System.out.println("\nMain | Project | proj |Start() | CALL");
        progi.proj.Start();
        */

         // ---- Teszt2 ----
        /*
        System.out.println("\n------------ Teszt2 ------------");
        System.out.println("\nMain | Project | proj | AddLed() | CALL");
        progi.proj.AddLed();
        System.out.println("\nMain | Project | proj | AddInverter | CALL");
        progi.proj.AddInverter();
        System.out.println("\nMain | Project | proj | AddFix1() | CALL");
        progi.proj.AddFix1();
        System.out.println("\nÖszeköttetések:\n");
        System.out.println("Main | Project | proj | AddWire(1,0,3) CALL");
        progi.proj.AddWire(1, 0, 2);
        System.out.println("Main | Project | proj | AddWire(0,0,1) CALL");
        progi.proj.AddWire(0, 0, 1);
        System.out.println("\nMain | Project | proj |Start() | CALL");
        progi.proj.Start();        
        */
        
         // ---- Teszt3 ----
        /*
        System.out.println("\n------------ Teszt3 ------------");
        System.out.println("\nMain | Project | proj | AddLed() | CALL");
        progi.proj.AddLed();
        System.out.println("\nMain | Project | proj | AddOr(PinNum) | CALL");
        progi.proj.AddOr(2);
        System.out.println("\nMain | Project | proj | AddFix0() | CALL");
        progi.proj.AddFix0();
        System.out.println("\nMain | Project | proj | AddFix1() | CALL");
        progi.proj.AddFix1();
        System.out.println("\nÖszeköttetések:\n");
        System.out.println("Main | Project | proj | AddWire(1,0,2) CALL");
        progi.proj.AddWire(1, 0, 2);
        System.out.println("Main | Project | proj | AddWire(1,1,2) CALL");
        progi.proj.AddWire(1, 1, 3);
        System.out.println("Main | Project | proj | AddWire(0,0,1) CALL");
        progi.proj.AddWire(0, 0, 1);
        System.out.println("\nMain | Project | proj |Start() | CALL");
        progi.proj.Start();

         */
       

        // ---- Teszt4 ----

        /*
        System.out.println("\n------------ Teszt3 ------------");

        System.out.println("\nMain | Project | proj | AddLed | CALL");
        progi.proj.AddLed();
        System.out.println("\nMain | Project | proj | AddOr(PinNum) | CALL");
        progi.proj.AddOr(2);
        System.out.println("\nMain | Project | proj | AddFix0() | CALL");
        progi.proj.AddFix0();
        System.out.println("\nMain | Project | proj | AddSwitch() | CALL");
        progi.proj.AddSwitch();
        System.out.println("\nMain | Project | proj | AddAnd(PinNum) | CALL");
        progi.proj.AddAnd(2);
        System.out.println("\nMain | Project | proj | AddGenerator(1,1,0,1,0,0) | CALL");
        int rate[] = {1,1,0,1,0,0};
        progi.proj.AddGenerator(rate);
        System.out.println("\nÖszeköttetések:\n");
        System.out.println("Main | Project | proj | AddWire(1,0,2) CALL");
        progi.proj.AddWire(1, 0, 2);
        System.out.println("Main | Project | proj | AddWire(1,1,2) CALL");
        progi.proj.AddWire(1, 1, 3);
        System.out.println("Main | Project | proj | AddWire(4,0,1) CALL");
        progi.proj.AddWire(4, 0, 1);
        System.out.println("Main | Project | proj | AddWire(4,1,5) CALL");
        progi.proj.AddWire(4, 1, 5);
        System.out.println("Main | Project | proj | AddWire(0,0,4) CALL");
        progi.proj.AddWire(0, 0, 4);    
        System.out.println("\nMain | Project | proj |Start() | CALL");
        progi.proj.Start();
        */

        // ---- Teszt5 ----

        
        System.out.println("\n------------ Teszt5 ------------");

        System.out.println("\nMain | Project | proj | AddLed() | CALL");
        progi.proj.AddLed();
        System.out.println("\nMain | Project | proj | AddAnd(PinNum) | CALL");
        progi.proj.AddAnd(2);
        System.out.println("\nMain | Project | proj | AddSwitch() | CALL");
        progi.proj.AddSwitch();
        System.out.println("\nMain | Project | proj | AddFix1() | CALL");
        progi.proj.AddFix1();
        
        System.out.println("\nMain | Project | proj | AddLed() | CALL");
        progi.proj.AddLed();
        System.out.println("\nMain | Project | proj | AddOr(PinNum) | CALL");
        progi.proj.AddOr(2);
        System.out.println("\nMain | Project | proj | AddGenerator(0,1) | CALL");
        int rate[] = {0,1};
        progi.proj.AddGenerator(rate);


        System.out.println("\nÖszeköttetések:\n");
        System.out.println("Main | Project | proj | AddWire(1,0,2) CALL");
        progi.proj.AddWire(1, 0, 2);
        System.out.println("Main | Project | proj | AddWire(1,1,2) CALL");
        progi.proj.AddWire(1, 1, 3);
        System.out.println("Main | Project | proj | AddWire(0,0,1) CALL");
        progi.proj.AddWire(0, 0, 1);
        System.out.println("\nMain | Project | proj |Start() | CALL\n");
        System.out.println("Main | Project | proj | AddWire(1,0,2) CALL");
        progi.proj.AddWire(4, 0, 5);
        System.out.println("Main | Project | proj | AddWire(1,0,2) CALL");
        progi.proj.AddWire(5, 0, 1);
        System.out.println("Main | Project | proj | AddWire(1,0,2) CALL");
        progi.proj.AddWire(5, 1, 6);
        System.out.println("\nMain | Project | proj |Start() | CALL");
        progi.proj.Start();

        

        // ---- Teszt6 ----
        /*
        System.out.println("\n------------ Teszt6 ------------");
        System.out.println("\nMain | Project | proj | AddLed() | CALL");
        progi.proj.AddLed();
        System.out.println("\nMain | Project | proj | AddGenerator(1,1,0,1,0,0) | CALL");
        int rate[] = {1,1,0,1,0,0};
        progi.proj.AddGenerator(rate);
        System.out.println("\nÖszeköttetések:\n");
        System.out.println("Main | Project | proj | AddWire(0,0,1) CALL");
        progi.proj.AddWire(0, 0, 1);
        System.out.println("\nMain | Project | proj |Start() | CALL");
        progi.proj.Start();
        */
    }   // End of MAIN
}
