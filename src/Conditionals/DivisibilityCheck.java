package Conditionals;

import java.util.Scanner;
public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner pk=new Scanner(System.in);
        int num;
        System.out.print("Enter any number : ");
        num=pk.nextInt();
        if (num%2==0 && num%3==0){
            System.out.println("Found ans : "+num);
        }
    }
}
