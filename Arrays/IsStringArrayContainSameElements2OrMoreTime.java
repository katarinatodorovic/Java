public class IsStringArrayContainSameElements2OrMoreTime {
    public static void main(String[] args) {

        /*Za zadati niz String-ova ispisati da li niz
         sadrži iste Stringove dva ili više puta.*/

        String[] arr = {"Lorem", "ipsum", "dolor", "sit", "amet", "consectetur",
                "adipiscing", "dolor", "sit", "fugiat", "nulla", "pariatur", "ipsum"};
        int count = 0;
        // int element = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
        }
        if (count == 1) {
            System.out.printf("There are %d same string in array. ", 2);
        } else if (count > 1) {
            System.out.printf("There are %d same string in array. ", count);
        } else System.out.println("There is'n no same string in array. ");
    }
}

