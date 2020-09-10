import java.util.Scanner;

public class ProcenatPorodicaSaViseOd2Dece {
     /*Zadatak 1:
-Napisati program koji učitava jedan broj koji predstavlja koliko
 ljudi će nakon toga uneti podatke o broju dece koju imaju.
-Nakon što se broj ljudi učita, učitavaju se podaci o broju dece.
-Nakon toga, ispisati koji procenat ljudi ima više od dvoje dece.

Na primer, ukoliko se unese broj 4, a zatim brojevi 1, 3, 2 i 4
program treba da ispiše poruku da 50% ljudi ima preko dvoje dece.

*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj roditelja: ");
        int brRoditelja = sc.nextInt();
        int brojac = 0;

		if(brRoditelja<0){
			System.exit(1);
		}	
		
        for (int i = 0; i < brRoditelja; i++) {
            System.out.println("Unesite broj dece: ");
            int brojDece = sc.nextInt();
            if (brojDece > 2) {
                brojac++;
            }
            if (brojDece < 0) {
                System.out.println("Broj dece mora biti veci od 0");
                i--;
            }
        }

        double procenatDeceViseOd2 = (100 * 1.0 / brRoditelja) * brojac;
        System.out.printf("Procenat porodica sa vise od dvoje dece je: %.2f", procenatDeceViseOd2);
    }
}
