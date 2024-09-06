package Loops;

import java.util.Scanner;

public class HollowNumericPyramid {
    public static void main(String[] args) {
        int row;
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter row : ");
        row = pk.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= row - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == 1 || j == 1 || j == (2 * i - 1) || i == row) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
