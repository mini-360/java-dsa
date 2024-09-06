package Loops;

import java.util.Scanner;

public class HollowRectangularPattern {
    public static void main(String[] args) {
        int row, col;
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter row : ");
        row = pk.nextInt();
        System.out.print("Enter col : ");
        col = pk.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0 || i == (row - 1) || j == (col - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
