import java.util.Scanner;

public class MinAndMaxInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of element in the array: ");
        int n = sc.nextInt();
        if (n<0){
            System.exit(1);
        }
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter an element in the array: ");
            arr[i]=sc.nextInt();
        }
        int min =arr[0];
        int max =arr[0];
        for (int j =0;j<arr.length;j++){
            if (min>arr[j]){
                min = arr[j];
            }
            if (max<arr[j]){
                max = arr[j];
           }
        }
        System.out.println("Minimum number in array is: "+min);
        System.out.println("Maximum number in array is: "+max);
    }
}
