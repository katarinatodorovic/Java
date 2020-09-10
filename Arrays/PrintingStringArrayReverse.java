public class PrintingStringArrayReverse {
    public static void main(String[] args) {

        String[] reci = {"Oblo", "Kocko", "Seco"};
        reci[0] = "Vaha";

        for (int i = reci.length - 1; i > -1; i--) {
            System.out.print(reci[i]);
            if (i != 0) {
                System.out.print(", ");
            }
            if (i == 0) {
                System.out.print(". ");
            }

        }
    }
}
