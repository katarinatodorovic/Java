import java.util.Arrays;


public class CardsMain {
    public static void main(String[]args){
       Cards cards = new Cards();
        int[]arr = cards.playerCardsInput();
        System.out.println(Arrays.toString(arr));
        int[]arr2 = cards.playerCardsInput();
        System.out.println(Arrays.toString(arr2));
       cards.whoIsTheWinner(cards.sumPoints(arr),cards.sumPoints(arr2));

    }
}
