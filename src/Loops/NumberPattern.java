package Loops;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        int row, col;
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter row : ");
        row = pk.nextInt();
        System.out.print("Enter col : ");
        col = pk.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("2 ");
                }
            }
            System.out.println();
        }
    }
}
