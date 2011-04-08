package szlab4_whitespaces;

public class Main {

    public static void main(String[] args) {   //A skeleton fő része, amiben le vannak írva a tesztesetek, és az egyes részek kikommentelésével
        //tesztelhetők a program különböző részei.

        // ---- NewProject ----
        System.out.println("\nMain | Program | progi | Program() | CALL");
        Program progi = new Program();

        System.out.println("\nMain | Program | progi | NewProject() | CALL");
        progi.NewProject();

        System.out.println("\nMain | Program | progi | Test() | CALL");
        progi.NewTest();

        System.out.println("\nMain | Program | tester | Test1() | CALL");
        progi.tester.Test1();

    }   // End of MAIN
}
