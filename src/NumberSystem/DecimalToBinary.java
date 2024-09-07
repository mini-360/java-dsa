package NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decNum;
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter any decimal number : ");
        decNum = pk.nextInt();
        int count = 0;
        int dummyDecNumber = decNum;
        while (dummyDecNumber > 0) {
            dummyDecNumber /= 2;
            count++;
        }
        int binaryNum[] = new int[count];
        int j = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            binaryNum[j++] = rem;
            decNum /= 2;
        }
        for (int i = binaryNum.length-1; i >= 0; i--) {
            System.out.print(binaryNum[i]);
        }

    }
}
