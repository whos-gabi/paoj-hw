package Lab2;

import java.util.Arrays;

public class TemaL2P1 {
    /// 1. Implementati o aplicatie Java in care:
    /// a) cititi de la tastatura un numar intreg n cuprins intre [0, 5].
    /// Nota: interactiunea cu userul va continua atat timp cat acesta nu a furnizat o valoare valida.
    /// b) creati un tablou unidimensional de lungime n, ale carui elemente intregi le cititi de la tastatura.
    /// c) implementati o metoda care realizeaza inversarea ordinii initiale a elementelor tabloului si afisarea lui in consola.
    /// exemplu: Input: [2, 4, 1, 5, 3]
    ///          Output: [3, 5, 1, 4, 2]
    ///


    public static boolean validate(int n) {
        return n >= 0 && n <= 5;
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int aux = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = aux;
        }
        System.out.print(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        System.out.println("Hello, User!");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = -1;
        while (!validate(n)) {
            System.out.println("Enter a number between 0 and 5: ");
            n = scanner.nextInt();
        }


        int[] arr = new int[n];
        System.out.println("Enter (" + n + ") elements line by line: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("original array is: "+ Arrays.toString(arr));
        System.out.println("The reversed array is: ");
        reverseArray(arr);



    }
}
