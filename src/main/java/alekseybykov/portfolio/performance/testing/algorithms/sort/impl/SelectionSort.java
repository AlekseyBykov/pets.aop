package alekseybykov.portfolio.performance.testing.algorithms.sort.impl;

import alekseybykov.portfolio.performance.testing.algorithms.sort.Sort;
import alekseybykov.portfolio.performance.testing.pointcut.WatchedInMillis;

public class SelectionSort implements Sort {

    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    // O(n^2) = n + n - 1 + n -2 + ... + 1 + 0 = n(n + 1)/2 ~ n^2
    @WatchedInMillis
    public void sort() {
        for (int i = 0; i < array.length; i++) {
            int j = findLowest(array, i);
            swapElements(array, i, j);
        }
    }

    // O(1)
    private void swapElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // O(n)
    private int findLowest(int[] array, int start) {
        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }
}
