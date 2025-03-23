package Lab2;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 99, 8, 11, 3, 4, 2, 5};
        System.out.print("Array: ");
        for (int el : arr){
            System.out.print(el + " ");
        }
        System.out.print("\n");
        //sortare ordine crescatoare - bubble sort
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    //swap
//                    int aux = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = aux;
//                }
//            }
//        }

        System.out.print("Sorted Array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        Arrays.sort(arr);
        System.out.print("Sorted Array: "+ Arrays.toString(arr));
    }
}
