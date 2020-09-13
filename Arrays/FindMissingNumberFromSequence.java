public class FindMissingNumberFromSequence {
    public static void main(String[] args) {

        /*Za zadat niz koji sadrži n različitih brojeva uzetih iz skupa
         0, 1, 2, ..., n pronaći jedan koji u tom nizu nedostaje.
        Primeri: Ulaz: [3,1,0], Izlaz: 2
        Ulaz: [4,2,3,5,7,0,1], Izlaz: 6*/

        int[] arr = {3, 2, 1, 4, 0, 5, 7, 9, 8};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int k = 0; k < arr.length; k++) {
            if (arr[k] != k) {
                System.out.println("The missing number is: " + k);
                break;
            }
        }
    }
}



