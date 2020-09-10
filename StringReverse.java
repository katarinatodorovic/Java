import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String name = sc.nextLine().replaceAll("\\s","");


        if (name.length()==0 ) {
            System.exit(1);
       }

       String s ="";

        char[] nameArray = name.toCharArray();
        int c = nameArray.length;
        for (int i = nameArray.length-1;i>=0; i--) {
            s +=nameArray[i];
        }
        System.out.println(s);

    }
}
