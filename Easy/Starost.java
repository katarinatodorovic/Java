import java.util.Scanner;

public class Starost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godine rodjenja: ");


        int godinaRodjenja = sc.nextInt();

        System.out.format("Imate %d godina", brojGodina(godinaRodjenja));
        punoletstvo(godinaRodjenja);

    }

    public static int brojGodina(int godinaRodj) {

        int starost = 2020 - godinaRodj;

        return starost;
    }

    public static void punoletstvo(int ukupnoGodina) {
        int godine = brojGodina(ukupnoGodina);
        if (godine < 18) {
            System.out.print(" i niste punoletni.");
        } else {
            System.out.print(" i jeste punoletni.");
        }
    }
}
