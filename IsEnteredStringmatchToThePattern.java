import java.util.Scanner;

public class IsEnteredStringmatchToThePattern {
    public static void main(String[] args) {

        /*A) Napisati program koji za uneti broj telefona (u vidu String-a)
        ispisuje informaciju o tome da li je broj napisan u odgovarajućem formatu.
         Pretpostaviti da se validan telefonski broj može pojaviti u jednom od
        sledećih formata: ( x x x ) _ x x x - x   x x  x  ili x x x - x x x - x x  x x gde 'x' predstavlja jednu cifru.
                          0 1 2 3 4 5 6 7 8 9 10 11 12 13     0 1 2 3 4 5 6 7 8 9 10 11
       B) Modifikovati program tako da on učitava brojeve telefona sve dok korisnik ne unese reč 'stop'.*/

        Scanner sc = new Scanner(System.in);
        String number;
        char c;
        boolean isNumber = false;
        System.out.printf("Enter a telephone number in format %n(xxx) xxx-xxxx or xxx-xxx-xxxx where 'x' is number:");
        number = sc.nextLine();

        while (true) {
            for (int i = 0; i < number.length(); i++) {
                c = number.charAt(i);
                if (number.charAt(0) == '(' && number.charAt(4) == ')' &&
                        Character.isDigit(number.charAt(1)) &&
                        Character.isDigit(number.charAt(2)) &&
                        Character.isDigit(number.charAt(3)) &&
                        Character.isDigit(number.charAt(6)) &&
                        Character.isDigit(number.charAt(7)) &&
                        Character.isDigit(number.charAt(8)) &&
                        Character.isDigit(number.charAt(10)) &&
                        Character.isDigit(number.charAt(11)) &&
                        Character.isDigit(number.charAt(12)) &&
                        Character.isDigit(number.charAt(13)) &&
                        number.charAt(5) == ' ' && number.charAt(9) == '-') {
                    isNumber = true;

                } else if (Character.isDigit(number.charAt(0)) &&
                        Character.isDigit(number.charAt(1)) &&
                        Character.isDigit(number.charAt(2)) &&
                        Character.isDigit(number.charAt(4)) &&
                        Character.isDigit(number.charAt(5)) &&
                        Character.isDigit(number.charAt(6)) &&
                        Character.isDigit(number.charAt(8)) &&
                        Character.isDigit(number.charAt(9)) &&
                        Character.isDigit(number.charAt(10)) &&
                        Character.isDigit(number.charAt(11)) &&
                        number.charAt(3) == '-' && number.charAt(7) == '-') {
                    isNumber = true;
                } else {
                    System.out.println("You didn't enter correct number format");
                    break;
                }
            }
            String s = isNumber ? "You entered correct number format " : "You didn't entered correct number format";
            System.out.println(s);
            System.out.println("To continue, enter another number. To stop process enter 'stop'.");
            number = sc.nextLine();
            if (number.toLowerCase().equals("stop")) {
                break;
            }
        }


        //number = sc.nextLine();
        //stopProcess = ns.nextLine().toLowerCase();
    }
}






