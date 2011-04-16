package szlab4_whitespaces;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;

public class Main
{

    public static void main(String[] args) throws IOException
    {   //A program fő része, itt hozzuk létre  projectet, és választunk tesztesetet

        // ---- NewProject ----
        //System.out.println("\nMain | Program | progi | Program() | CALL");
        Program progi = new Program();

        //System.out.println("\nMain | Program | progi | NewProject() | CALL");
        progi.NewProject();

        //System.out.println("\nMain | Program | progi | NewTest() | CALL");
        progi.NewTest();

        //System.out.println("\nMain | Program | tester | Test() | CALL");
        progi.tester.Test9();
        

        try
        {
            BufferedReader in = new BufferedReader(new FileReader("in.txt"));   //beolvasandó fájl megadása
            String beolv = "";      //parancs amibe be fogunk olvasni
            char ch;                // karakterenként fogunk olvasni
            int i = 0;              // param tömb indexelésére
            int param[]= new int[4];// Command konstruktorának adjuk meg, hogy milyen paraméterekket kapott a beolvasott parancs

            boolean flag = false; //volt-e már szoköz a bemeneten a parancs után

            ch = (char)in.read();   // egy karakter beolvasása
            while(true)             // EOF-ig olvas ami majd exception lesz és leáll az olvasás -> catch
            {
                while(ch != 13)     // ha entert kaptunk, akkor utána uj parancsot kezdunk
                {
                    if(ch == ' ')   // ha szoközt kaptunk
                    {
                        
                        param[i] = (int)in.read();  // beolvassuk a parancs i. paraméterét a paramba
                        ++i;                        // param következő indexe
                        flag = true;                // volt már szokőz az olvasás során => a parancsot(beolv) már nem kell módosítani
                    }
                    else if(flag == true)           //nem szoköz, nem enter és ha még nem volt szóköz
                    {
                        beolv = beolv + ch;         // beolvasott parancshoz hozzáfűzi az uj karaktert
                    }
                    ch = (char)in.read();           // következő karakter olvasása
                }
                if(ch == 13)                        // ha enert olvastun be..
                {
                    Command cmd = new Command(progi.proj, beolv, param);    // meghívjuk a parancsot a megkapott paraméterekkel
                    beolv = "";                     // uj parancsot kezdünk az uj sorban
                    i = 0;                          // param tomb indexelését előről kezdjuk
                }
            }
        }
        catch(EOFException e)                       // EOFException elkapása
        {
            System.out.println("A fájl beolvasása végetért!");
        }

    }   // End of MAIN
}
