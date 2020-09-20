import java.util.Scanner;

public class OrthodoxEaster{
    public static void main(String[] args) {
		
        Scanner t = new Scanner(System.in);

        System.out.println("Unesite godinu izmedju 1900 i 2099 za koju zelite da proverite kada pada Uskrs: ");
        int godina = t.nextInt();

        if (godina < 1900 || godina > 2099) {
            System.out.println("Godina nije u predvidjenom opsegu! Pokusajte ponovo");
        }

        int a = godina % 4;
        int b = godina % 7;
        int c = godina % 19;
        int d = (19 * c + 15) % 30;
        int e = (2 * a + 4 * b - d + 34) % 7;
        int mesecBr = (d + e + 114) / 31;
        int dan = ((d + e + 114) % 31) + 1;
        int danPoNovom = dan + 13;
        String mesec = "";
        switch (mesecBr) {
            case 3:
                mesec = "marta";
                break;
            case 4:
                mesec = "aprila";
                break;
            default:

        }

        if (godina >= 1900 && godina <= 1919) {

            System.out.println("Uskrs je bio " + dan + ", " + mesec + " po starom kalendaru");

        }
        if (godina > 1919) {

            if (mesecBr == 3 && danPoNovom > 31) {
                mesec = "aprila";
                danPoNovom = danPoNovom - 31;

            }

            if (mesecBr == 4 && danPoNovom > 30) {
                mesec = "maja";
                danPoNovom = danPoNovom - 30;
            }
            System.out.println("Uskrs je padao " + danPoNovom + " " + mesec + " po novom kalendaru");
        }
    }
}

