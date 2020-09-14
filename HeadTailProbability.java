import java.util.Scanner;

public class HeadTailProbability {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Koliko puta zelite da bacite novcic? ");
        int brojBacanja = s.nextInt();

        int pismo = 0;
        int glava = 0;
        for (int i = brojBacanja; i > 0; i--) {
            double novcic = Math.random();
            if (novcic < 0.5) {
                pismo++;
            }
            if (novcic > 0.5) {
                glava++;
            }

        }

        double verovatnocaPismo = ((pismo * 1.0) / brojBacanja) * 100;
        double verovatnocaGlava = 100 - verovatnocaPismo;


        System.out.println("Verovatnoca da se dobije pismo je: "
                + verovatnocaPismo + "%, tj.  " + pismo
                + " od " + brojBacanja + " bacanja.");
        System.out.println("Verovatnoca da se dobije glava je: "
                + verovatnocaGlava + "%, tj.  " + glava
                + " od " + brojBacanja + " bacanja.");
    }
}
