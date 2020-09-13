package proba;

public class DvaDNiz {
    public static void main(String[] args) {
        int[][] dvadArej = {
                {8, 99, 1235, 8, 6, 22, 5},
                {55, 12, 59, 78, 56, 48},
                {2, 5, 63, 15, 6}
        };

        // prva for...each loop pristupa svakom nizu ponaosob
        // inside the 2d array
        for (int[] innerArray : dvadArej) {
            // druga for...each loop pristupa svakom elementu ponaosob
            for (int data : innerArray) {
                System.out.print(data + " ");
            }
            System.out.println();//pravi razmak izmedju redova
        }
        System.out.println("Drugi niz, cetvrti element je: " + dvadArej[1][3]);//izvlacenje odredjenog elementa niza
        System.out.println();//pravi razmak izmedju redova

        String[][] nizoviDjaka = {
                {"Joca", "Goca", "Cica", "Mica", "Boba"},
                {"Ljubusa", "Budisa", "Slavisa", "Radisa", "Ljubinka", "Milisav"},
                {"Radosav", "Danica", "Slobodanka", "Kostadinka"}
        };
        for (String[] djaciURedovima : nizoviDjaka) {
            for (String imenaDjaka : djaciURedovima) {
                System.out.print(imenaDjaka + "\t ");
            }
            System.out.println();
        }

        int[][][] triDArej = new int[3][2][4];//3 seta sa 2 reda i 4 elementa
        int num = 1;
        for (int[][] i : triDArej) {//broj segmenata-vrsta
            for (int[] j : i) {//broj redova po vrsti
                for (int k : j) {
                    k = num;
                    num++;
                    System.out.print(" " + k);//stampa pojedinacne elemente ukupno 3*2*4
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
