package Conditionals;

import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner pk=new Scanner(System.in);
        int num;
        System.out.print("Enter any number : ");
        num=pk.nextInt();
        String ans;
        ans=(num%2==0)? "Even" : "Odd";
        System.out.println(ans);
    }
}
