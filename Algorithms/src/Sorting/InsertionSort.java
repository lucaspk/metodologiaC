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
            sortAscending(array, new Range(range.getBeginIndex(), range.getEndIndex()));
        } else {
            sortDescending(array, new Range(range.getBeginIndex(), range.getEndIndex()));
        }
    }

    private void sortAscending(Double[] array, Range range) {
        final int beginIndex = range.getBeginIndex();
        final int endIndex = range.getEndIndex();

        for (int j = beginIndex; j < endIndex; j++) {
            int i = j - 1;
            Double key = array[j];
            while (i >= 0 && key < array[i]) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = key;
        }
    }

    private void sortDescending(Double[] array, Range range) {
        final int beginIndex = range.getBeginIndex();
        final int endIndex = range.getEndIndex();

        for (int j = beginIndex; j < endIndex; j++) {
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
