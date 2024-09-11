package Arrays;

public class App {
    public static void main(String[] args) {
        App obj = new App();
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 5;
        arr[2] = 6;

        obj.changeArray(arr);
        obj.printArray(arr);
    }

    void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
