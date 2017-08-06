package Sorting;

/**
 * Created by Lucas on 01/08/2017.
 */
public class SortFactory {

    /** O algoritmo de ordenação default é o Insertion Sort.
     *  Digite'MergeSort' para criar uma instância do MergeSort algorithm;
     *  'QuickSort', se quiser criar o QuickSort. Qualquer outro nome digitado
     *  selecionará o Insertion Sort.
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
