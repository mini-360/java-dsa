package Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 2, 8, 1};
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max value int the array is  : " + max);
    }
}
