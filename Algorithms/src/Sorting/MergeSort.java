package Sorting;

import java.util.Arrays;

/**
 * Created by Lucas on 01/08/2017.
 */
public class MergeSort extends Sort {

    private Double[] helper;

    @Override
    protected void sort(Double[] array, boolean isAscending) {
        sort(array, new Range(0, array.length - 1), isAscending);
    }

    @Override
    public void sort(Double[] array, Range range, boolean isAscending) {
        if (range.getLeftIndex() < range.getRightIndex()){
            int mid = (range.getRightIndex() + range.getLeftIndex()) / 2;
            sort(array, new Range(range.getLeftIndex(), mid), isAscending);
            sort(array, new Range(mid + 1, range.getRightIndex()), isAscending);
            if (isAscending){
                mergeTwoSortedListAsc(array, range.getLeftIndex(), mid, range.getRightIndex());
            } else {
                mergeTwoSortedListDesc(array, range.getLeftIndex(), mid, range.getRightIndex());
            }
        }
    }

    private void mergeTwoSortedListAsc(Double[] array, int low, int middle, int high) {
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

    private void mergeTwoSortedListDesc(Double[] array, int low, int middle, int high) {
        helper = Arrays.copyOfRange(array, low, high + 1);

        int i = 0;
        int j = middle - low + 1;
        int k = low;

        while (i <= middle - low && j <= high - low) {
            if (helper[i].compareTo(helper[j]) > 0) {
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
