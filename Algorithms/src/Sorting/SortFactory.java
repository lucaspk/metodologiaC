package Sorting;

/**
 * Created by Lucas on 01/08/2017.
 */
public class SortFactory {

    /** O algoritmo de ordenação default é o insertion sort.
    * */
    public static Sort createSort(final String sortAlgorithm) {
        Sort sortAlgoChoosed = new InsertionSort();

        if (sortAlgorithm.equals("MergeSort")) {
            sortAlgoChoosed = new MergeSort();
        } else if (sortAlgorithm.equals("QuickSort")) {
            sortAlgoChoosed = new QuickSort();
        }
        return sortAlgoChoosed;
    }
}
