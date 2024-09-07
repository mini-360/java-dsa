package NumberSystem;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int i = 0, binaryNum, decNum = 0;
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter any binary number : ");
        binaryNum = pk.nextInt();
        while (binaryNum > 0) {
            int newNum = binaryNum % 10;
            int powNum = (int) Math.pow(2, i);
            binaryNum /= 10;
            decNum += newNum * powNum;
            i++;
        }
        System.out.println("Decimal Number is : "+decNum);
    }
}
