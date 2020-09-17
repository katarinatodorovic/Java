import java.util.Scanner;

public class MobilniMain {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print(" Koliko modela mobilnih telefona zelite da uporedite? ");
        int brojClanovaNiza = scanner.nextInt();
        if (brojClanovaNiza < 1) {
            System.out.println("Unesite broj veci od nule!");
            //System.exit(1);
            return;
        }

        MobilniTelefon[] niz = new MobilniTelefon[brojClanovaNiza];

        for (int i = 0; i < brojClanovaNiza; i++) {
            /*morala sam novi objekat skenera pravilo mi je
            problem 2 input tipa string mi je na jednoj liniji stampalo*/
            Scanner n = new Scanner(System.in);

            System.out.print("Unesite ime proizvodjaca: ");
            String proizvodjac = n.nextLine();


            System.out.print("Unesite naziv modela: ");
            String model = n.nextLine();

            System.out.print("Uneste godinu proizvodnje: ");
            int godinaProizvodnje = n.nextInt();

            if (godinaProizvodnje < 1990 || godinaProizvodnje > 2020) {
                System.out.print("Niste uneli adekvatnu godinu proizvodnje! ");
                return;
            }

            System.out.print("Unesite kolicinu RAM memorije: ");
            int kolicinaRAMa = n.nextInt();

            if (kolicinaRAMa < 1024) {
                System.out.print("Ne razmatramo telefone malog kapaciteta RAMa! ");
                return;
            }
            System.out.print("Unesite kolicin memorije skladista: ");
            int kolicinaSkladista = n.nextInt();
            if (kolicinaSkladista < 2048) {
                System.out.print("Telefoni sa malim kapacitetom skladista se ne razmatraju!");
                return;
            }
            System.out.print("Unesite sirinu ekrana u incima: ");
            double sirina = n.nextDouble();
            if (sirina < 2.0) {
                System.out.print("Ne razmatramo takve uredjaje!");
                return;
            }
            System.out.print("Unesite visinu ekrana u incima: ");
            double visina = n.nextDouble();
            if (sirina < 2.0) {
                System.out.print("Ne razmatramo takve uredjaje!");
                return;
            }

            niz[i] = new MobilniTelefon(
                    proizvodjac,
                    model,
                    godinaProizvodnje,
                    kolicinaRAMa,
                    kolicinaSkladista,
                    new EkranTelefona(sirina, visina));

        }
        sortiraj(niz);

        MobilniTelefon najbolji = niz[0];

        System.out.println("Telefon koji ima najbolju ocenu je: ");
        System.out.println(najbolji);

    }

    public static void sortiraj(MobilniTelefon[] niz) {
        for (int i = 0; i < niz.length - 1; i++) {
            for (int j = 0; j < niz.length - 1; j++) {
                if (niz[j].ocenaPodobnosti() < niz[j + 1].ocenaPodobnosti()) {
                    MobilniTelefon.zameniMesto(niz[i], niz[i + 1]);
                }
            }
        }
    }
}

