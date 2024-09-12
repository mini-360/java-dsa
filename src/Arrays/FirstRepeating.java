package Arrays;

import java.util.Scanner;

public class FirstRepeating {
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
        pk.close();
        FirstRepeating obj = new FirstRepeating();
        int ans = obj.firstRepeating(arr);
        System.out.println("First repeating value is : " + ans);
    }

    int firstRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return arr[i];
            }
        }
        return -1;
    }
}
