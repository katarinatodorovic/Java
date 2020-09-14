import java.util.Arrays;
import java.util.Scanner;

public class ThirdArrayAddingFirst2EqualLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner ns = new Scanner(System.in);
        System.out.println("Unesi duzinu niza 1:");
        int duzinaNiza1 = sc.nextInt();
        int[] niz1 = new int[duzinaNiza1];
        System.out.println("Unesi duzinu niza 2:");
        int duzinaNiza2 = ns.nextInt();
        int[] niz2 = new int[duzinaNiza2];
        int[] niz3 = new int[duzinaNiza1];


        for (int i = 0, j = 0, k = 0;
             i < niz1.length && j < niz2.length && k < niz3.length;
             i++, j++, k++) {

            System.out.println("unesi clan niza 1:");
            niz1[i] = sc.nextInt();
            System.out.println("unesi clan niza 2:");
            niz2[j] = ns.nextInt();
            niz3[k] = niz1[i] + niz2[j];
        }

        System.out.println(Arrays.toString(niz1));
        System.out.println(Arrays.toString(niz2));
        System.out.println(Arrays.toString(niz3));
    }
}
