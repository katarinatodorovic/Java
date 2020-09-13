package nizovi.klase;

public class ArraySumOfElementsDoubleElements {
/*
    Kreirati klasu NizoviOperacije. Ovoj klasi se prilikom kreiranja prosledjuje celobrojni niz nad kojim se vrse operacije
    Operacije koje klase je potrebno da vrsi jesu:
            - Ispisivanje niza
        - Suma elemenata niza -> vraca sumu niza
        - Dupliranje elemenata niza <- svaki element se mnozi sa 2 -> ako imamo niz 2 3 5 6 -> nove vrednosti niza su:
            4 6 10 12

            */

    private int[] array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public NizoviOperacije(int[] array) {
        this.array = array;
    }

    public void ispisiNiz() {
        if (array == null) {
            System.out.println("Array is empty");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }   

    }

    public int arraySum() {

        if (array == null) {
            System.out.println("Array is empty");
        }
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }

    public void doubleElements() {
        if (array == null) {
            System.out.println("Array is empty");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
            System.out.println(array[i]);
        }
    }
}
