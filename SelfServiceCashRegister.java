import java.util.Scanner;

public class SelfServiceCashRegister {

    public static void main(String[] args) {

        SelfServiceCashRegister buyer = new SelfServiceCashRegister();

        buyer.instructions();
        int options = sc.nextInt();


        while (true) {

            if (options == 0) {
                System.out.println("You ended your purchase.");
                break;
            }
            switch (options) {
                case 1:
                    buyer.option1();
                    break;
                case 2:
                    buyer.option2();
                    break;
                default:
                    System.out.println(
                            "Chosen option doesn't exist. " +
                                    "Please, try again with another one.");
                    break;
            }

            buyer.instructions();
            options = sc.nextInt();
        }
    }

    private static Scanner sc = new Scanner(System.in);
    private double shoppingCart = 0;

    private void option1() {

        System.out.println("Please, enter the price of chosen item: ");
        double priceOfItem = sc.nextDouble();

        if (priceOfItem > 0 && priceOfItem < 100000) {
            shoppingCart += priceOfItem;
            System.out.println("Total price is: " + shoppingCart);
        } else {
            System.out.println(
                    "You entered wrong price. " +
                            "The price should be greater than 0 and less than 100.000$.");
        }
    }

    private void option2() {

        System.out.println("Please enter in the correct (total) amount for payment: ");
        double totalAmount = sc.nextDouble();

        if ((shoppingCart == 0 && (totalAmount > 0) || totalAmount < 0)) {
            System.out.println("Your shopping cart is empty!");
        }

        if (totalAmount >= shoppingCart && shoppingCart > 0) {
            System.out.printf(
                    "You successfully bought your items%n" +
                            "Total amount was: %.2f %nYour change is: %.2f %n",
                    shoppingCart, (totalAmount - shoppingCart));

            shoppingCart = 0;

        }
        if (totalAmount < shoppingCart && shoppingCart > 0) {

            System.out.printf(
                    "Please, enter in the correct total amount for payment.%n" +
                            "You need to enter amount greater than: %.2f %n", shoppingCart);
        }
    }

    private void instructions() {
        System.out.printf(
                "Here are instruction for user menu, enter:%n" +
                        "0  to END transaction or to CANCEL%n" +
                        "1  to ADD chosen item/s to shopping cart%n" +
                        "2  to BUY chosen item/s%n");
    }
}

