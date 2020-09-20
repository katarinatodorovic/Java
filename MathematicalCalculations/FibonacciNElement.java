import java.util.Scanner;

public class Fibonaci {
    public static void  main(String[]args){

        int seed=0;
        int initial = 1;
        int sum= seed+initial;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of element of fibonachie array:");
        int count = scanner.nextInt();

        for (int i =0; i<count; i++){
            initial =sum-initial;
            sum +=initial;
            System.out.println(initial);

        }
    }
}
