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

        // ---- AddNewElement ----
        System.out.println("\nMain | Project | proj | AddAnd() | CALL");
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
        System.out.println("\nMain | Project | proj | AddWireGateSource() | CALL");
        progi.proj.AddWireGateSource(0,0,1,0);    //0. kapu 0. pin és 1.forras 0.pin

        // ---- AddWireGateGate
        System.out.println("\nMain | Project | proj | AddWireGateGate() | CALL");
        progi.proj.AddWireGateGate(0,1,3,0);    //0. kapu 0. pin és 3.kapu 0.pin

        // ---- DeleteElement ----
    


    }   // End of MAIN
}
