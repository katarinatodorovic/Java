package iznoskreditazaotplatu;

import java.util.Scanner;

public class LoanPaymentAmount {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite iznos uzetog kredita: ");
        double iznosUzetogKredita = s.nextDouble();
        System.out.print("Unesite kamatnu stopu: ");
        double kamatnaStopa = s.nextDouble();
        System.out.print("Unesite broj mesecnih rata: ");
        int brmesecnihRata = s.nextInt();

        double kamatanaiznos = kamatnaStopa / 12;
        double kamataNaCelokupanIznos = Math.pow(1 + kamatanaiznos, brmesecnihRata);
        double iznosRatenaNivouMeseca = (iznosUzetogKredita * kamataNaCelokupanIznos * kamatanaiznos) / (kamataNaCelokupanIznos - 1);

        System.out.println("Mesecna rata za otplatu uzetog kredita je : " + iznosRatenaNivouMeseca);
        

    }
}
