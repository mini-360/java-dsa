package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        TakingInput obj = new TakingInput();
//        System.out.print("Enter size of the array : ");
//        int size = pk.nextInt();
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;

//        System.out.println("Enter array elements : ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = pk.nextInt();
//        }
        System.out.println("Original Array arr : ");
        obj.printArray(arr);


        // trying to copy arr to arr2
//        int[] arr2 = arr.clone();

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array arr2 : ");
        obj.printArray(arr2);

//        // changing some values of arr2
//        arr2[0] = 0;
//        arr2[1] = 0;
//
//        System.out.println("Original array after changing arr2 : ");
//        obj.printArray(arr);
//
//        System.out.println("Copied arr2 after changing arr2 : ");
//        obj.printArray(arr2);
    }

    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
