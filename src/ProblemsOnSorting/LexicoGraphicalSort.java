package ProblemsOnSorting;

public class LexicoGraphicalSort {
    public static void main(String[] args) {
        String[] arr = {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"};

        System.out.println("Array before sorting : ");
        for (String i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        LexicoGraphicalSort lgs = new LexicoGraphicalSort();
        lgs.sortFruits(arr);
        System.out.println("Array after sorting : ");
        for (String i : arr) {
            System.out.print(i + " ");
        }
    }

    public void sortFruits(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(arr, minIndex, i);
            }
        }
    }

    public void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
