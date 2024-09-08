package Methods;

import java.util.Scanner;

class Algebra {
    Algebra(){
        System.out.println("Constructor of Algebra class called ");
    }
    int add(int a, int b) {
        int ans = a + b;
        return ans;
    }
}

public class Sum {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner pk = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter num1 : ");
        num1 = pk.nextInt();
        System.out.print("Enter num2 : ");
        num2 = pk.nextInt();
        int ans = obj.add(num1, num2);
        System.out.println("Sum is : " + ans);
    }
}
