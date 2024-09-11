package Arrays;

// Calculate the sum of all the elements in the given array

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 1};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum is : " + sum);
    }
}
