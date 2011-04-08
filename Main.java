package szlab4_whitespaces;

public class Main {

    public static void main(String[] args) {   //A program fő része, itt hozzuk létre  projectet, és választunk tesztesetet

        // ---- NewProject ----
        System.out.println("\nMain | Program | progi | Program() | CALL");
        Program progi = new Program();

        System.out.println("\nMain | Program | progi | NewProject() | CALL");
        progi.NewProject();

        System.out.println("\nMain | Program | progi | NewTest() | CALL");
        progi.NewTest();

        System.out.println("\nMain | Program | tester | Test1() | CALL");
        progi.tester.Test1();

    }   // End of MAIN
}
