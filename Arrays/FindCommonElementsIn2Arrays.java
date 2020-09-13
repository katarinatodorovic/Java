import java.util.Scanner;

public class FindCommonElementsIn2Arrays {
    public static void main(String[] args) {
/*Napisati program koji učita dva niza i kao rezultat kreira treći
 niz koji predstavlja presek učitanih nizova.
Ispisati rezultat u formatu ‘( element * element * element * ... element).’*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number of element in first array: ");
        int numOfElementInFirst = sc.nextInt();
        int[] firstArray = new int[numOfElementInFirst];

        System.out.println("Enter a number of element in second array: ");
        int numOfElementInSecond = sc.nextInt();
        int[] secondArray = new int[numOfElementInSecond];

        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array: ");
        for (int j = 0; j < secondArray.length; j++) {
            secondArray[j] = sc.nextInt();
        }
        int lenMax = Math.max(numOfElementInFirst, numOfElementInSecond);
        int lenCammon = Math.min(numOfElementInFirst, numOfElementInSecond);
        int[] commonElements = new int[lenCammon];

        for (int k = 0; k < lenMax; k++) {
            for (int m = 0; m < lenCammon; m++) {
                if (firstArray[k] == secondArray[m]) {
                    commonElements[m] = firstArray[k];
                }
            }
        }

        int numOfZerro = 0;
        for (int l = 0; l < commonElements.length; l++) {
            if (commonElements[l] == 0)
                numOfZerro++;
        }
        int[] nonZero = new int[commonElements.length - numOfZerro];
        int count = 0;
        for (int n = 0; n < commonElements.length; n++) {
            if (commonElements[n] != 0) {
                nonZero[count] = commonElements[n];
                count++;
            }
        }
        System.out.print("(");
        for (int q = 0; q < nonZero.length; q++) {
            System.out.print(nonZero[q]);
            if (q != nonZero.length - 1) {
                System.out.print("*");
            }
        }
        System.out.print(")");
    }
}








