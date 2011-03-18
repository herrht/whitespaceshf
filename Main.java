package szlab4_whitespaces;

public class Main {

    public static void main(String[] args) {
        // ---- NewProject ----
        System.out.println("Main | Program | progi | Program() | CALL");
        Program progi = new Program();
        System.out.println("\nMain | Program | progi | NewProject() | CALL");
        progi.NewProject();

        // ---- AddNewElement ----
        System.out.println("\nMain | Project | proj | AddOr() | CALL");
        progi.proj.AddAnd(3);

        // ---- AddNewASource object
        System.out.println("\nMain | Project | proj | AddFix1() | CALL");
        progi.proj.AddFix1();

        // ---- DeleteElement ----

        

    }   // End of MAIN
}
