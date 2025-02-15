package ProblemsOnSorting;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 10, 5, 0, 4};
        System.out.println("Array before sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        MoveZeroes mz = new MoveZeroes();
        mz.sortZero(arr);
        System.out.println("Array after sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void sortZero(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
