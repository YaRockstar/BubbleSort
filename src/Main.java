import java.util.Arrays;

public class Main {
    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr) {
        int wall = arr.length - 1;
        while (wall > 0) {
            for (int i = 0; i < wall; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            wall--;
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 1, 9, 0, 1, 7, 6, 3, 5, 8, 3};
        System.out.println("Before: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("After: " + Arrays.toString(array));
    }
}