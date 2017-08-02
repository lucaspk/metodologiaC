package Sorting;

import java.util.Arrays;

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
                System.out.println(Arrays.toString(array));
                array[i+1] = array[i];
                System.out.println(Arrays.toString(array));
                i--;
            }
            array[i+1] = key;
        }
    }

    //test
    public static void main(String[] args){
        Sort is = new InsertionSort();
        Double[] a = {-2.0, 1.0, 5.0, 4.0, 6.0, 3.0};
        is.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
