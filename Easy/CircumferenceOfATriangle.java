package avgustsesti;

import java.util.Scanner;

public class CircumferenceOfATriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite prvu stranicu trougla:");
        float a = scanner.nextFloat();
        System.out.println("Unesite drugu stranicu trougla:");
        float b = scanner.nextFloat();
        System.out.println("Unesite trecu stranicu trougla:");
        float c = scanner.nextFloat();

        float obim = a + b + c;
        System.out.format("Obim trougla je %.2f", obim);


    }
}
