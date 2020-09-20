/*To test program choose two same numbers less than 10
and one of 4 options, place them  in edit configuration as arguments.
 Ex:
 5 5 1
 5 5 2
 5 5 3
 5 5 4
 */

public class BasicArithmeticOperations {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.exit(1);
        }

        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int chooseOperation = Integer.parseInt(args[2]);
        if ((number1 > 10 || number2 > 10) && number1 != number2) {
            System.out.println("Input numbers shoul be less than 10 and both should be the same.");
        }
        int result;

        switch (chooseOperation) {
            case 1:
                result = number1 + number2;
                System.out.format("Addition of two numbers %d is %d. ", number1, result);
                break;
            case 2:
                result = number1 - number2;
                System.out.format("Subtraction of two numbers %d is %d. ", number1, result);
                break;
            case 3:
                result = number1 / number2;
                System.out.format("Division of two numbers %d is %d. ", number1, result);
                break;
            case 4:
                result = number1 * number2;
                System.out.format("Multiplication of two numbers %d is %d. ", number1, result);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + chooseOperation);
        }
        if (result > 1) {
            System.out.println("Result is greater than 1");
        }
        if (result < 1) {
            System.out.println("Result is less than 1");
        }
        if (result == 1) {
            System.out.println("Result is equal to 1");
        }

    }
}
