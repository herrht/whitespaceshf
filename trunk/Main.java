/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package szlab4_whitespaces;

/**
 *
 * @author darkmoonka
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ---- NewProject ----
        System.out.println("Main | Program | progi | Program() | CALL");
        Program progi = new Program();
        System.out.println("\nMain | Program | progi | NewProject() | CALL");
        progi.NewProject();

        // ---- AddNewElement ----
        System.out.println("\nMain | Project | proj | AddOr() | CALL");
        progi.proj.AddOr(3);

        // ---- DeleteElement ----
        

    }   // End of MAIN
}
