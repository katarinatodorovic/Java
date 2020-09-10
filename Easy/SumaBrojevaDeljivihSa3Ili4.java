/*
      // Za vezbu:
        // Napisati program koji racuna sumu brojeva od 0 do N, NE ukljucjuci N,
        koji su deljivi sa 3 ILI su deljivi sa 4
        // N=16 -> [0] 1 2 [3] [4] 5 [6] 7 [8] [9] 10 11 [12] 13 14 [15]*/


import java.util.Scanner;

public class SumaBrojevaDeljivihSa3Ili4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi br : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                sum += i;
            }
        }
        System.out.println("Suma je " + sum);
    }
}
