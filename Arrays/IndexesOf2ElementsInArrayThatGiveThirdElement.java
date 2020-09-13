public class IndexesOf2ElementsInArrayThatGiveThirdElement {
    public static void main(String[] args) {

        /*Zadati su jedan niz celih brojeva, i jedan broj koji prestavlja ‘metu’.
        Napisati program koji vraća indekse dva
        broja koja kada se saberu daju rezultat jednak unetoj ‘meti’.
        Pretpostaviti da će svaki ulazni podaci imati tačno jedno rešenje.
        Ne koristiti jedan element više puta.*/


        int target = 7;
        int[] arr = {10, 1, 32, 5, 8, 55, 98, 2, 14, 985, 4};
        int sum;
        int first = 0;
        int second = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    first = i;
                    second = j;

                }
            }
        }
        System.out.println("The indexes of two numbers are: " + first + " and " + second);
    }
}
