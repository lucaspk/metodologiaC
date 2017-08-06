package Sorting;

/**
 * Created by Lucas on 01/08/2017.
 */
public class InsertionSort extends Sort {

    @Override
    protected void sort(Double[] array, boolean isAscending) {
        final int size = array.length;
        sort(array, new Range(0, size), isAscending);
    }

    @Override
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
