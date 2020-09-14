import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner broj = new Scanner(System.in);
        System.out.println("Unesite Prvu katetu a: ");
        int kateta1 = broj.nextInt();
        System.out.println("Unesite Drugu katetu b: ");
        int kateta2 = broj.nextInt();

        double izrazIspodKorena = Math.pow(kateta1, 2) + Math.pow(kateta2, 2);
        double hipotenuza = Math.sqrt(izrazIspodKorena);

        System.out.println("Hipotenuza je c: " + hipotenuza);

    }

}
