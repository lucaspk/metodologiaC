package Sorting;

import java.util.Arrays;

/**
 * Created by Lucas on 01/08/2017.
 */
public class MergeSort extends Sort {

    private Double[] helper;

    @Override
    protected void sort(Double[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(Double[] array,int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex){
            int mid = (rightIndex + leftIndex) / 2;
            sort(array, leftIndex, mid);
            sort(array, mid + 1, rightIndex);
            mergeTwoSortedList(array, leftIndex, mid, rightIndex);
        }

    }

    private void mergeTwoSortedList(Double[] array, int low, int middle, int high) {
        helper = Arrays.copyOfRange(array, low, high + 1);

        int i = 0;
        int j = middle - low + 1;
        int k = low;

        while (i <= middle - low && j <= high - low) {
            if (helper[i].compareTo(helper[j]) < 0) {
                array[k] = helper[i];
                i++;
            } else {
                array[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= middle - low) {
            array[k++] = helper[i++];
        }
        while (j <= high - low) {
            array[k++] = helper[j++];
        }
    }
}
