package Recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int p, q;
        System.out.print("Enter value of p and q : ");
        p = pk.nextInt();
        q = pk.nextInt();
        int ans1 = raisedPower1(p, q);
        System.out.println("p raised power q is : " + ans1);
        int ans2 = raisedPower2(p, q);
        System.out.println("p raised power q is : " + ans2);
    }

    // Bruteforce Approach
    static int raisedPower1(int p, int q) {
        if (q == 0) {
            return 1;
        }
        return p * raisedPower1(p, q - 1);
    }

    // Optimized Approach
    static int raisedPower2(int p, int q) {
        if (q == 0) return 1;
        int smallPow = raisedPower2(p, q / 2);
        if (q % 2 == 0) {
            return smallPow * smallPow;
        } else {
            return smallPow * smallPow * p;
        }
    }

}
