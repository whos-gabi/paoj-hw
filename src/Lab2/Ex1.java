package Lab2;
import java.util.Scanner;

public class Ex1 {
    // an example of overload functions
    public static void overload(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void overload(double a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
//        int arr2 [] = new int[8];
//        arr2[0] = 1;
//        arr2[4] = 2;
//        arr2[7] = 3;
//        System.out.println(Arrays.toString(arr2));
//
        System.out.print("Enter the size of the array: ");
        //read the size of the array from terminal


        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Size: " + size);




        //test overload
        overload(1, 2);
        overload(5.15, 2);



    }
}
