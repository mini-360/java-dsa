package Loops;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num;
        System.out.print("Enter nth term : ");
        num = pk.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        System.out.println("Sum of the series is : " + sum);
    }
}
