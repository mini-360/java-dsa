package Arrays;

import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int size;
        System.out.print("Enter size of the array : ");
        size = pk.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = pk.nextInt();
        }
        UniqueNumber obj = new UniqueNumber();
        int ans = obj.uniqueNumber(arr);
        System.out.println("Unique number is : " + ans);
    }

    int uniqueNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i : arr) {
            if (i > 0) {
                return i;
            }
        }
        return -1;
    }
}
