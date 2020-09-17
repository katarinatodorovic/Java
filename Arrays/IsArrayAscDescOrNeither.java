import java.util.Scanner;

public class IsArrayAscDescOrNeither {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int numOfElements;
        System.out.println("Enter an integer greater than 0 for the number of element in the array.");
        while (true) {
            System.out.println("Enter a number: ");
            numOfElements = sc.nextInt();
            if (numOfElements > 0) {
                break;
            }
            System.out.println("Enter number again.");
        }

        isAscendingDescendRepeatingElem(numOfElements);

    }


    public static int[] createArray(int numOfElements) {

        int[] arr = new int[numOfElements];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
//Ako u nizu postoje elementi koji se ponavljaju ali niz ipak raste/opada  45 45 45 45 46 46 47 48
//Sortira uneti niz u opadajuci i rastuci o onda sa njima vrsi poredjenja i na osnovu toga se utvrdjuje
//da li je uneti niz rastuci ili opadajuci
/*With repeating elements*/
    public static void isAscendingDescendRepeatingElem(int numOfElements) {

        int[] arrToCheck = createArray(numOfElements);
        int[] Asc = copyArr(arrToCheck);
        Asc = sortAsc(Asc);
        int[] Desc = copyArr(arrToCheck);
        Desc = sortDesc(Desc);

        boolean isAscen = true;
        for (int i = 0; i < arrToCheck.length; i++) {
            if (arrToCheck[i] != Asc[i]) {
                isAscen = false;
                break;
            }

        }
        boolean isDesce = true;
        for (int j = 0; j < arrToCheck.length; j++) {
            if (arrToCheck[j] != Desc[j]) {
                isDesce = false;
                break;
            }
        }
        String desc = isDesce ? "Array is descending." : "Array is ascending.";
        if ((isAscen && !isDesce) || (isDesce && !isAscen)) {
            System.out.println(desc);
        }
        if (isAscen && isDesce) {
            System.out.println("Array has all the same elements.");
        }
        if (!isAscen && !isDesce) {
            System.out.println("Array is neither ascending nor descending!");
        }
    }

    public static int[] copyArr(int[] forCopy) {
        int[] copy = new int[forCopy.length];
        for (int i = 0; i < forCopy.length; i++) {
            copy[i] = forCopy[i];
        }
        return copy;
    }

    public static int[] sortAsc(int[] arrAsc) {
        int temp;
        for (int i = 0; i < arrAsc.length; i++) {
            for (int j = 0; j < arrAsc.length; j++) {
                if (arrAsc[i] < arrAsc[j]) {
                    temp = arrAsc[i];
                    arrAsc[i] = arrAsc[j];
                    arrAsc[j] = temp;
                }
            }
        }
        return arrAsc;
    }


    public static int[] sortDesc(int[] arrDesc) {
        int temp;
        for (int i = 0; i < arrDesc.length; i++) {
            for (int j = 0; j < arrDesc.length; j++) {
                if (arrDesc[i] > arrDesc[j]) {
                    temp = arrDesc[i];
                    arrDesc[i] = arrDesc[j];
                    arrDesc[j] = temp;
                }
            }
        }
        return arrDesc;
	
    }
	/*No reppetition of elements in array*/
	
    //ovoj segment proverava ako raste/opada ali da se elementi ne ponavljaju 1 2 3 4 5
  /*  public static void isAscendingDescendingNeither(int numOfElements) {

        int[] arr = createArray(numOfElements);
        boolean isAsc = true;
        //Asc? bez elemenata koji se ponavljaju
        for (int i = 0, j = 1; i < arr.length - 1 && j < arr.length; i++, j++) {
            if (arr[i] > arr[j]) {
                isAsc = false;
                break;
            }
        }
        //Desc? bez elemenata koji se ponavljaju
        boolean isDesc = true;
        for (int i = 0, j = 1; i < arr.length - 1 && j < arr.length; i++, j++) {
            if (arr[i] < arr[j]) {
                isDesc = false;
                break;
            }
        }
        //all equal
        boolean isEqual = true;
        for (int i = 0, j = 1; i < arr.length - 1 && j < arr.length; i++, j++) {
            if (arr[i] != arr[j]) {
                isEqual = false;
                break;
            }
        }
        String desc = isDesc ? "Array is descending." : "Array is ascending.";
        if (isAsc || isDesc) {
            System.out.println(desc);
        }
        if (isEqual) {
            System.out.println("Array has all the same elements.");
        } else System.out.println("Array is neither ascending nor descending!");
    }*/
}


