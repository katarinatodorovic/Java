import java.util.Scanner;
/* /*Zadatak 2:
- U trci učestvuje 4 trkača. Posmatrajmo trenutak u kome najsporiji
zaostaje 6 krugova do kraja trke, 5ugova i najbrži samo 4 kruga.
-Svaki put kad obrnu krug, program treba da ispiše koliko je
krugova ostalo kom atletičaru do cilja. Program dobija informaciju o
tome koji je igrač istrčao krug tako što se unosi njegov redni broj.
-Program se završava kada svi trkači završe trku.

Bonus: Ispisati rang listu trkača.

Primer:
Kada se program pokrene i korisnik unese broj 1 treba
 ispisati informaciju o tome da je prvom atleticaru ostalo
 5 krugova do kraja, drugom i trecem 5 a cetvrtom 4 kruga.

Nakon toga, ako korisnik unese broj 4 treba ispisati da
je prvom, drugom, trecem ostalo 5 krugova, a cetvrtom 3 kruga….

*/
public class WhoWinTheRaceRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Do kraja trke, prvom igracu je ostalo 6 krugova, " +
                        "drugom 5, trecem 5 i cetvrtom igracu 4 kruga.");

        int prviIgrac = 6;
        int drugiIgrac = 5;
        int treciIgrac = 5;
        int cetvrtiIgrac = 4;
        int poRedu = 0;
        int prvi = 0;
        int drugi = 0;
        int treci = 0;
        int cetvrti = 0;


        for (int i = 0; i < 20; i++) {
            if (prviIgrac < 0 || drugiIgrac< 0 || treciIgrac<0|| cetvrtiIgrac<0){
                break;
            }
            System.out.println("Unesite broj igraca koga zelite da pokrenete: ");
            int igrac = sc.nextInt();
            switch (igrac) {
                case 1:
                    prviIgrac--;
                    if (prviIgrac == 0) {
                        poRedu++;
                        prvi = poRedu;
                    }
                    break;
                case 2:
                    drugiIgrac--;
                    if (drugiIgrac == 0) {
                        poRedu++;
                        drugi = poRedu;
                    }
                    break;
                case 3:
                    treciIgrac--;
                    if (treciIgrac == 0) {
                        poRedu++;
                        treci = poRedu;
                    }
                    break;
                case 4:
                    cetvrtiIgrac--;
                    if (cetvrtiIgrac == 0) {
                        poRedu++;
                        cetvrti = poRedu;
                    }
                    break;
                default:
                    System.out.println("Uneti igrac ne postoji.");
                    break;
            }


            System.out.println("Prvom igracu je ostalo jos " + prviIgrac);
            System.out.println("Drugom igracu je ostalo jos " + drugiIgrac);
            System.out.println("Trecem igracu je ostalo jos " + treciIgrac);
            System.out.println("Cetvrtom igracu je ostalo jos " + cetvrtiIgrac);

        }

        System.out.println("Igrac jedan je stigao " + prvi);
        System.out.println("Igrac dva je stigao " + drugi);
        System.out.println("Igrac tri je stigao " + treci);
        System.out.println("Igrac cetri je stigao " + cetvrti);

    }
}
