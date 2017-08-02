package Sorting;

/**
 * Created by Lucas on 01/08/2017.
 */
public class InsertionSort extends Sort {

    @Override
    protected void sort(Double[] array) {
        final int size = array.length;

        for (int j = 1; j < size; j++) {
            int i = j - 1;
            Double key = array[j];
            while (i >= 0 && key < array[i]) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = key;
        }
    }
}
