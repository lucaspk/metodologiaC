package sort;

import util.Range;

/**
 * Created by Lucas on 01/08/2017.
 */
public class InsertionSort extends Sort {

    @Override
    public long sort(Double[] array, boolean isAscending) {
        long startTime = System.nanoTime();
        sort(array, new Range(0, array.length), isAscending);
        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public void sort(Double[] array, Range range, boolean isAscending) {
        if (isAscending) {
            sortAscending(array, range.getLeftIndex(), range.getRightIndex());
        } else {
            sortDescending(array, range.getLeftIndex(), range.getRightIndex());
        }
    }

    private void sortAscending(Double[] array, int leftIndex, int rightIndex) {
        for (int j = leftIndex; j < rightIndex; j++) {
            int i = j - 1;
            Double key = array[j];
            while (i >= 0 && key < array[i]) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = key;
        }
    }

    private void sortDescending(Double[] array, int leftIndex, int rightIndex) {
        for (int j = leftIndex; j < rightIndex; j++) {
            int i = j - 1;
            Double key = array[j];
            while (i >= 0 && key > array[i]) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = key;
        }
    }

}