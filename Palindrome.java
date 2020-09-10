import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        /*da li je niz palindrom ili nije palindrom*/
      int arr[] = initializeArray();
      if (isPalindrome(arr)){
          System.out.println("Is Palindrome!");
      }else System.out.println("Not Palindrome!");
    }


   public static boolean isPalindrome(int arr[]){
        int c = arr.length;
        boolean isPalindrom = true;
        for (int i = 0; i< c/2; i++) {
            if (arr[i]!=arr[c-1-i]){
                isPalindrom = false;
            }
        }
        return isPalindrom;
    }
    public static int[] initializeArray(){
        Scanner sc = new Scanner(System.in);
         int n;
        while (true) {
            System.out.println("Unesite broj  ");
            n = sc.nextInt();
            if (n >= 0) {
                break;
            } else System.out.println("pogrsno!");
        }
        int[] arr = new int[n];
        System.out.println("Unesite elemente  ");
        for (int o = 0; o < arr.length; o++) {
            arr[o] = sc.nextInt();
        }
        return arr;
    }
}