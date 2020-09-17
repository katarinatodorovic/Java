import java.util.Scanner;

public class ATMWhileLoop {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
       /* int izbor = -1;
        while (izbor != 0) {  //da li je tacno da nula nije jednaka nuli -nije tacno kraj petlje
            System.out.print("Unesite nulu kako biste prekinuli program: ");
            izbor = s.nextInt();  //ono sto si uzeo od korisnika ulaza postaje varijabla izbor
            s.nextLine();         //uzimas sve ono sto je napisano na liniji
        }*/


        /*iznos koji unesemo podeli tako da isplati sa najvecim mogucim novcanicama kojima je moguce isplatiti taj iznos*/
        System.out.print("Unesite iznos novca koji zelite da podignete: ");
        int iznos = s.nextInt();
        s.nextLine();
        int zaIsplatu5000 = 0;
        int zaIsplatu2000 = 0;
        int zaIsplatu1000 = 0;
        int zaIsplatu500 = 0;
        int zaIsplatu200 = 0;
        int zaIsplatu100 = 0;
        int zaIsplatu50 = 0;
        int zaIsplatu20 = 0;
        int zaIsplatu10 = 0;
        int zaIsplatu5 = 0;
        int zaIsplatu2 = 0;
        int zaIsplatu1 = 0;

        while (iznos >= 5000) {
            zaIsplatu5000++;
            iznos -= 5000;
        }
        while (iznos >= 2000) {
            zaIsplatu2000++;
            iznos -= 2000;
        }
        while (iznos >= 1000) {
            zaIsplatu1000++;
            iznos -= 1000;
        }
        while (iznos >= 500) {
            zaIsplatu500++;
            iznos -= 500;
        }
        while (iznos >= 200) {
            zaIsplatu200++;
            iznos -= 200;
        }
        while (iznos >= 100) {
            zaIsplatu100++;
            iznos -= 100;
        }
        while (iznos >= 50) {
            zaIsplatu50++;
            iznos -= 50;
        }
        while (iznos >= 20) {
            zaIsplatu20++;
            iznos -= 20;
        }
        while (iznos >= 10) {
            zaIsplatu10++;
            iznos -= 10;
        }
        while (iznos >= 5) {
            zaIsplatu5++;
            iznos -= 5;
        }
        while (iznos >= 2) {
            zaIsplatu2++;
            iznos -= 2;
        }
        while (iznos >= 1) {
            zaIsplatu1++;
            iznos -= 1;
        }
        if (zaIsplatu5000 > 0 || zaIsplatu2000 > 0 || zaIsplatu1000 > 0 || zaIsplatu500 > 0 || zaIsplatu200 > 0
                || zaIsplatu100 > 0 || zaIsplatu50 > 0 || zaIsplatu20 > 0 || zaIsplatu10 > 0
                || zaIsplatu5 > 0 || zaIsplatu2 > 0 || zaIsplatu1 > 0) {
            System.out.println("Isplatiti: " + zaIsplatu5000 + " novcanica od 5000");
            System.out.println("Isplatiti: " + zaIsplatu2000 + " novcanica od 2000");
            System.out.println("Isplatiti: " + zaIsplatu1000 + " novcanica od 1000");
            System.out.println("Isplatiti: " + zaIsplatu500 + " novcanica od 500");
            System.out.println("Isplatiti: " + zaIsplatu200 + " novcanica od 200");
            System.out.println("Isplatiti: " + zaIsplatu100 + " novcanica od 100");
            System.out.println("Isplatiti: " + zaIsplatu50 + " novcanica od 50");
            System.out.println("Isplatiti: " + zaIsplatu20 + " novcanica od 20");
            System.out.println("Isplatiti: " + zaIsplatu10 + " novcanica od 10");
            System.out.println("Isplatiti: " + zaIsplatu5 + " kovanica od 5");
            System.out.println("Isplatiti: " + zaIsplatu2 + " kovanica od 2");
            System.out.println("Isplatiti: " + zaIsplatu1 + " kovanica od 1");

        }

        System.out.println("Kraj programa! Hvala!");
    }
}
