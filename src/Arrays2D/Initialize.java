package Arrays2D;

public class Initialize {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 6}, {7, 9, 11}, {8, 1, 1}};
        Initialize in = new Initialize();
        in.printArray(arr);
    }

    void printArray(int[][] arr) {
        for (int[] i : arr) {
            for (int val : i) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
