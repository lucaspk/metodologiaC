package Sorting;

/**
 * Created by Lucas on 01/08/2017.
 */
public class QuickSort extends Sort {

    @Override
    protected void sort(Double[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(Double[] array,int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex && leftIndex >= 0){
            int pivot_position = partition(array, leftIndex, rightIndex);
            sort(array, leftIndex, pivot_position - 1);
            sort(array, pivot_position + 1, rightIndex);
        }
    }

    private int partition(Double[] array, int left, int right){
        int pivot_index = left;
        Double pivot = array[left];

        for (int j = pivot_index + 1; j <= right; j++) {
            if (array[j].compareTo(pivot) < 0){
                pivot_index++;
                swap(array, pivot_index, j);
            }
        }
        swap(array, left, pivot_index);

        return pivot_index;
    }

    private void swap(Object[] array, int i, int j) {
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
