package Lab2;

import java.util.Arrays;

public class TemaL2P2 {
    /// 2. Implementati o aplicatie Java in care:
    /// a) creati 2 tablouri unidimensionale de lungimi diferite, cu cate cel putin 5 elemente intregi.
    /// b) implementati o metoda de sortare in ordine crescatoare a elementelor fiecarui tablou creat anterior.
    /// Nota: se va folosi o implementare proprie, nu pe cea din clasa Arrays.
    /// c) creati si afisati la consola un al treilea tablou in care veti insera in ordine crescatoare toate elementele din primele 2 tablouri.
    /// Pentru eficienta si complexitate de timp liniara, utilizati o tehnica de implementare cu 2 pointeri (cate unul pt elementele fiecarui tablou initial).
    /// exemplu:
    ///    Array1 initial: [1, 7, 4, 3, 9, 1]
    ///    Array1 sortat crescator: [1, 1, 3, 4, 7, 9]
    ///    Array2 initial: [6, 4, 2, 8]
    ///    Array2 sortat crescator: [2, 4, 6, 8]
    ///    Output: [1, 1, 2, 3, 4, 4, 6, 7, 8, 9]

    public static int[] sortArray(int[] arr) {
        /// b)
        //sortare ordine crescatoare - bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
        return arr;
    }

    public static void concatenateAndSort(int[] arr1, int[] arr2) {
        /// c)
        //varianta mai simpla
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;
        for (int el : arr1) {
            arr3[k++] = el;
        }
        for (int el : arr2) {
            arr3[k++] = el;
        }
        System.out.println("Output: "+ Arrays.toString(sortArray(arr3)));
    }

    public static void main(String[] args) {
        ///  a)
        int[] arr1 = {1, 7, 4, 3, 9, 1};
        int[] arr2 = {6, 4, 2, 8};


        System.out.println("Array1 initial: "+ Arrays.toString(arr1));
        System.out.println("Array2 initial: "+ Arrays.toString(arr2));
        System.out.println("Array1 sortat crescator: "+Arrays.toString(sortArray(arr1)));
        System.out.println("Array2 sortat crescator: "+Arrays.toString(sortArray(arr2)));

        ///
        concatenateAndSort(arr1, arr2);
    }
}
