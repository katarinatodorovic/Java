import java.util.Arrays;

public class All0InArrayToTheEnd {
    public static void main(String[] args) {
        /*A) Zadat je niz brojeva. Napisati program koji pomera sve
        nule na kraj niza, zadržavajući redosled nenultih elemenata.
      B) Zadatak odraditi tako da se ne alocira dodatni prostor za novi niz,
      već modifikovati postojeći. Primer: Ulazni niz -> 1 0 2 25 0 6, Izlaz -> 1 2 25 6 0 0*/

        int[] array = {2, 5, 8, 9, 24, 1, 225, 0, 6, 4, 99, 0};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[count++] = array[i];
            }
        }
        while (count < array.length) {
            array[count++] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
