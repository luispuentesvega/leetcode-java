package algos;

import java.util.Arrays;

public class SelectionSortSample {

    public static void main(String[] args) {
        int[] array = new int[]{8, 1, 6};
        SelectionSortSample sorter = new SelectionSortSample();
        sorter.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    //    Swap elements at index i and j
    public static void swapElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Finds the index of the lowest value
     * starting from the index at start (inclusive)
     * and going to the end of the array.
     */
    public static int indexLowest(int[] array, int start) {
        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = indexLowest(array, i);
            swapElements(array, i, j);
        }
    }
}
