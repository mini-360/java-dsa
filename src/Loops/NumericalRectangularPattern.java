package Loops;

import java.util.Scanner;

public class NumericalRectangularPattern {
    public static void main(String[] args) {
        int row;
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter row : ");
        row = pk.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = i; j <= row; j++) {
                System.out.print(j + " ");
            }
            for (int k = 1; k <= (i - 1); k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
