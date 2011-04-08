package szlab4_whitespaces;

public class Test {

    public Project proj;        //a projekt, miben létrehozza majd az elemeket

    public Test(Project proj) {
        System.out.println("Test | Test() | Test konstruktor");        //kiírat
        this.proj = proj;
    }

    public void Test1() {
        System.out.println("Test | Test1() | 1. Teszteset");       //kiírat

        System.out.println("\n------------ Teszt1 ------------");

        System.out.println("\nMain | Project | proj | AddLed() | CALL");
        proj.AddLed();
        System.out.println("\nMain | Project | proj | AddAnd(PinNum) | CALL");
        proj.AddAnd(2);

        System.out.println("\nMain | Project | proj | AddFix0() | CALL");
        proj.AddFix0();
        System.out.println("\nMain | Project | proj | AddFix1() | CALL");
        proj.AddFix1();

        System.out.println("\n------------ Osszekottetesek: ------------");
        System.out.println("\nMain | Project | proj | AddWire(1,0,2) CALL");
        proj.AddWire(1, 0, 2, 0);
        System.out.println("\nMain | Project | proj | AddWire(1,1,2) CALL");
        proj.AddWire(1, 1, 3, 0);
        System.out.println("\nMain | Project | proj | AddWire(0,0,1) CALL");
        proj.AddWire(0, 0, 1, 0);

        System.out.println("\n------------ Futtatas: ------------");
        System.out.println("\nMain | Project | proj |Start() | CALL");
        proj.Start();
    }

    public void Test2() {
        System.out.println("\n------------ Teszt2 ------------");
        System.out.println("\nMain | Project | proj | AddLed() | CALL");
        proj.AddLed();
        System.out.println("\nMain | Project | proj | AddInverter | CALL");
        proj.AddInverter();
        System.out.println("\nMain | Project | proj | AddFix1() | CALL");
        proj.AddFix1();

        System.out.println("\n------------ Osszekottetesek: ------------");
        System.out.println("\nMain | Project | proj | AddWire(1,0,3) CALL");
        proj.AddWire(1, 0, 2, 0);
        System.out.println("\nMain | Project | proj | AddWire(0,0,1) CALL");
        proj.AddWire(0, 0, 1, 0);

        System.out.println("\n------------ Futtatas: ------------");
        System.out.println("\nMain | Project | proj |Start() | CALL");
        proj.Start();
    }

    public void Test3() {
        System.out.println("\n------------ Teszt3 ------------");
        System.out.println("\nMain | Project | proj | AddLed() | CALL");
        proj.AddLed();
        System.out.println("\nMain | Project | proj | AddOr(PinNum) | CALL");
        proj.AddOr(2);
        System.out.println("\nMain | Project | proj | AddFix0() | CALL");
        proj.AddFix0();
        System.out.println("\nMain | Project | proj | AddFix1() | CALL");
        proj.AddFix1();

        System.out.println("\n------------ Osszekottetesek: ------------");
        System.out.println("\nMain | Project | proj | AddWire(1,0,2) CALL");
        proj.AddWire(1, 0, 2, 0);
        System.out.println("\nMain | Project | proj | AddWire(1,1,2) CALL");
        proj.AddWire(1, 1, 3, 0);
        System.out.println("\nMain | Project | proj | AddWire(0,0,1) CALL");
        proj.AddWire(0, 0, 1, 0);

        System.out.println("\n------------ Futtatas: ------------");
        System.out.println("\nMain | Project | proj |Start() | CALL");
        proj.Start();
    }

    public void Test4() {
        System.out.println("\n------------ Teszt4 ------------");

        System.out.println("\nMain | Project | proj | AddLed | CALL");
        proj.AddLed();
        System.out.println("\nMain | Project | proj | AddOr(PinNum) | CALL");
        proj.AddOr(2);
        System.out.println("\nMain | Project | proj | AddFix0() | CALL");
        proj.AddFix0();
        System.out.println("\nMain | Project | proj | AddSwitch() | CALL");
        proj.AddSwitch();
        System.out.println("\nMain | Project | proj | AddAnd(PinNum) | CALL");
        proj.AddAnd(2);
        System.out.println("\nMain | Project | proj | AddGenerator(1,1,0,1,0,0) | CALL");
        int rate[] = {1, 1, 0, 1, 0, 0};
        proj.AddGenerator(rate);

        System.out.println("\n------------ Osszekottetesek: ------------");
        System.out.println("\nMain | Project | proj | AddWire(1,0,2) CALL");
        proj.AddWire(1, 0, 2, 0);
        System.out.println("\nMain | Project | proj | AddWire(1,1,2) CALL");
        proj.AddWire(1, 1, 3, 0);
        System.out.println("\nMain | Project | proj | AddWire(4,0,1) CALL");
        proj.AddWire(4, 0, 1, 0);
        System.out.println("\nMain | Project | proj | AddWire(4,1,5) CALL");
        proj.AddWire(4, 1, 5, 0);
        System.out.println("\nMain | Project | proj | AddWire(0,0,4) CALL");
        proj.AddWire(0, 0, 4, 0);

        System.out.println("\n------------ Futtatas: ------------");
        System.out.println("\nMain | Project | proj |Start() | CALL");
        proj.Start();
    }

    public void Test5() {
        System.out.println("\n------------ Teszt5 ------------");

        System.out.println("\nMain | Project | proj | AddLed() | CALL");
        proj.AddLed();
        System.out.println("\nMain | Project | proj | AddAnd(PinNum) | CALL");
        proj.AddAnd(2);
        System.out.println("\nMain | Project | proj | AddSwitch() | CALL");
        proj.AddSwitch();
        System.out.println("\nMain | Project | proj | AddFix1() | CALL");
        proj.AddFix1();
        System.out.println("\nMain | Project | proj | AddLed() | CALL");
        proj.AddLed();
        System.out.println("\nMain | Project | proj | AddOr(PinNum) | CALL");
        proj.AddOr(2);
        System.out.println("\nMain | Project | proj | AddGenerator(0,1) | CALL");
        int rate[] = {0, 1};
        proj.AddGenerator(rate);

        System.out.println("\n------------ Osszekottetesek: ------------");
        System.out.println("\nMain | Project | proj | AddWire(1,0,2) CALL");
        proj.AddWire(1, 0, 2, 0);
        System.out.println("\nMain | Project | proj | AddWire(1,1,2) CALL");
        proj.AddWire(1, 1, 3, 0);
        System.out.println("\nMain | Project | proj | AddWire(0,0,1) CALL");
        proj.AddWire(0, 0, 1, 0);
        System.out.println("\nMain | Project | proj | AddWire(1,0,2) CALL");
        proj.AddWire(4, 0, 5, 0);
        System.out.println("\nMain | Project | proj | AddWire(1,0,2) CALL");
        proj.AddWire(5, 0, 1, 0);
        System.out.println("\nMain | Project | proj | AddWire(1,0,2) CALL");
        proj.AddWire(5, 1, 6, 0);

        System.out.println("\n------------ Futtatas: ------------");
        System.out.println("\nMain | Project | proj |Start() | CALL");
        proj.Start();
    }

    public void Test6() {
        System.out.println("\n------------ Teszt6 ------------");
        System.out.println("\nMain | Project | proj | AddLed() | CALL");
        proj.AddLed();
        System.out.println("\nMain | Project | proj | AddGenerator(1,1,0,1,0,0) | CALL");
        int rate[] = {1, 1, 0, 1, 0, 0};
        proj.AddGenerator(rate);

        System.out.println("\n------------ Osszekottetesek: ------------");
        System.out.println("\nMain | Project | proj | AddWire(0,0,1) CALL");
        proj.AddWire(0, 0, 1, 0);

        System.out.println("\n------------ Futtatas: ------------");
        System.out.println("\nMain | Project | proj |Start() | CALL");
        proj.Start();
    }

    public void TestSingle() {
        // ---- AddNewComposite
        System.out.println("\nMain | Project | proj | AddComposite() | CALL");
        proj.AddComposite();

        // ---- AddNewOscilloscope
        System.out.println("\nMain | Project | proj | AddOscilloscope() | CALL");
        proj.AddOscilliscope();

        // ---- AddNewLed
        System.out.println("\nMain | Project | proj | AddAnd(PinNum) | CALL");
        proj.AddAnd(3);

        // ---- AddNewASource object
        System.out.println("\nMain | Project | proj | AddFix1() | CALL");
        proj.AddFix1();

        // ---- AddGenerator
        System.out.println("\nMain | Project | proj | AddGenerator(rate) | CALL");
        int rate[] = {1, 0, 1, 1};
        proj.AddGenerator(rate);

        // ---- AddInverter
        System.out.println("\nMain | Project | proj | AddInverter() | CALL");
        proj.AddInverter();

        // ---- AddLed
        System.out.println("\nMain | Project | proj | AddLed() | CALL");
        proj.AddLed();

        // ---- AddSwitch
        System.out.println("\nMain | Project | proj | AddSwitch() | CALL");
        proj.AddSwitch();

        // ---- AddWireGateSource
        System.out.println("\nMain | Project | proj | AddWireGateSource(id1,id1-pin,id2) | CALL");
        proj.AddWire(0, 0, 1, 0);       //0. kapu 0. pin és 1.forras kimenete

        // ---- AddWireGateGate
        System.out.println("\nMain | Project | proj | AddWireGateGate(id1,id1-pin,id2) | CALL");
        proj.AddWire(0, 1, 3, 0);       //0. kapu 1. pin és 3.kapu kimenete

        // ---- DeleteElement ----
        System.out.println("\nMain | Project | proj | DeleteElement(id) | CALL");
        proj.DeleteElement(0);          //0. kapu törlése

        // ---- ListElements ----
        System.out.println();
        proj.ListElements();
    }

}
