package Loops;

import java.util.Scanner;

public class NumericPyramid {
    public static void main(String[] args) {
        int row;
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter row : ");
        row = pk.nextInt();
        for (int i = 1; i <= row; i++) {
            int count = 1;
            for (int k = 1; k <= row - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j < (2 * i) / 2) {
                    System.out.print(count++ + " ");
                } else {
                    System.out.print(count-- + " ");
                }
            }
            System.out.println();
        }
    }
}
