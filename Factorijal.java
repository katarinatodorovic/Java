public class Factorijal {
    private static final int MAX_NUM = 10;

    private static int factorial(int n) {
        /*da bi funkcija pocea da radi treba joj int koji joj
         * se prosledjuje iz mejna posto je dole i bilo 0 ovde
         * se to i ubacuje u n a i je 1 i je <= 0 sto je netacno i
         * odmah se prelazi na rezultat a rezultat se
         * prosledjuje  iz funkcije u mejn kao i*/
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;//ovo je samo kada je nula faktorijal jer je faktorijal od nula 1
    }

    public static void main(String[] args) {
        /*pocinje od 0 i skonta da nema sta da izvrsi u funkciji onda ide do tamo
         * gde je funkcija napisana*/
        for (int i = 0; i < MAX_NUM; i++) {
            System.out.println(i + "!" + factorial(i));
        }
    }


}
