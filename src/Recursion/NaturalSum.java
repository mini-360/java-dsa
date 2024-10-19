package Recursion;

import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num;
        System.out.print("Enter value of num : ");
        num = pk.nextInt();
        int ans = alternateSum(num);
        System.out.println("The sum of the series is : " + ans);

    }

    static int alternateSum(int num) {
        if (num == 0) return num;
        int sum = 0;
        if (num % 2 == 0) {
//            sum = -num + alternateSum(num - 1);
            sum = alternateSum(num - 1) - num;
        } else {
//            sum = num + alternateSum(num - 1);
            sum = alternateSum(num - 1) + num;
        }
        return sum;
    }


}
