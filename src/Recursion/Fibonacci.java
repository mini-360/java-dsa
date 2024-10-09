package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int num;
        System.out.print("Enter value of num : ");
        num = pk.nextInt();
        Fibonacci f = new Fibonacci();
        for (int i = 0; i <= num; i++) {
            System.out.print(f.fibonacci(i) + " ");
        }
//        int ans = f.fibonacci(num);
//        System.out.println(num + "th fibonacci term is : " + ans);
    }

    int fibonacci(int num) {
        if (num == 0 || num == 1) return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
