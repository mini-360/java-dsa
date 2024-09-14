package Arrays;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        SwapNumber obj = new SwapNumber();
//        obj.swap(a,b);
        obj.swapSumDiff(a, b);
    }

    // Swapping using a third temporary variable
    void swap(int a, int b) {
        System.out.println("Original values before swap");
        System.out.println("a : " + a + " b : " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swap ");
        System.out.println("a : " + a + " b : " + b);
    }

    // Swapping using sum and difference
    void swapSumDiff(int a, int b) {
        System.out.println("Original values before swap");
        System.out.println("a : " + a + " b : " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Values after swap ");
        System.out.println("a : " + a + " b : " + b);
    }
}
