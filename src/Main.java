import java.util.Arrays;

public class Main {
    /**
     * Пузырьковая сортировка (Сортировка пузырбком, Bubble sort).
     * Особенности:
     * - "In-place" алгоритм - алгоритм, который использует малое кол-во памяти (не зависит от N).
     * - Stable (стабильный, устойчивый), то есть сохраняет относительный порядок элементов с одинаковыми значениями.
     * - Временная сложность квадратичная O(N^2).
     * - Быстро деградирует, то есть время работы растет нелинейно.
     */
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
        int[] array = {4, 2, 1, 9, 0, 7, 6, 5, 8, 3};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
