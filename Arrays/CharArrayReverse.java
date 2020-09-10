import java.util.Scanner;

public class CharArrayReverse {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char array: ");
        String s = sc.nextLine();

        if (s.length()==0 ) {
            System.exit(1);
              }

        char[] original =s.toCharArray();
        char[] reverse = new char[original.length];
        int c = original.length;
        for (int i = original.length-1;i>=0; i--) {
            reverse[c-1-i] = original[i];
        }

        System.out.println(reverse);

    }
}
