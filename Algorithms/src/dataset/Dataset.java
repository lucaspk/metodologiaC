package dataset;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import sort.QuickSort;
import util.CSVUtils;
import util.SortOrder;
import util.SortType;

/**
 * Created by Wesley Silva on 05/08/2017.
 */

public class Dataset {
    public final static long MAX_RANDOM_NUM = 1000000;
    public final static long MIN_RANDOM_NUM = -1000000;

    private String name;
    private int arraySize;
    private SortType sortType;
    private int datasetSize;
    private SortOrder sortOrder;

    private List<Double[]> content;

    public static void main(String[] args) throws IOException {
        Dataset dataset = new Dataset("dataset_1.csv", SortOrder.DESCENDING, SortType.ALL, 10, 100);
        dataset.save();
    }

    public Dataset(String name, SortOrder sortOrder, SortType sortType, int arraySize, int datasetSize) {
        this.name = name;
        this.sortOrder = sortOrder;
        this.sortType = sortType;
        this.arraySize = arraySize;
        this.datasetSize = datasetSize;

        this.content = createContent();
    }

    private List<Double[]> createContent() {
        List<Double[]> content = new ArrayList<Double[]>();

        for (int i = 0; i < this.datasetSize; i++) {
            Double[] array = new Double[arraySize];

            if ((sortOrder == SortOrder.ASCENDING && sortType == SortType.ALL) || (sortOrder == SortOrder.DESCENDING && sortType == SortType.NONE)) {
                generateAscendingOrderedArray(array);
            } else if ((sortOrder == SortOrder.DESCENDING && sortType == SortType.ALL) || (sortOrder == SortOrder.ASCENDING && sortType == SortType.NONE)) {
                generateDescendingOrderedArray(array);
            } else {
                throw new RuntimeException("Error, for input: sortOrder=" + sortOrder + " and sortType=" + sortType + ".");
            }

            content.add(array);
        }

        return content;
    }

    private void generateAscendingOrderedArray(Double[] array) {
        QuickSort sort = new QuickSort();
        generateRandomArray(array);
        sort.sort(array, SortOrder.ASCENDING.getValue());
    }

    private void generateDescendingOrderedArray(Double[] array) {
        QuickSort sort = new QuickSort();
        generateRandomArray(array);
        sort.sort(array, SortOrder.DESCENDING.getValue());
    }

    private void generateRandomArray(Double[] array) {
        for (int j = 0; j < array.length; j++) {
            array[j] = generateRandomDouble();
        }
    }

    private Double generateRandomDouble() {
        return (MIN_RANDOM_NUM + (MAX_RANDOM_NUM - MIN_RANDOM_NUM) * new Random().nextDouble());
    }

    public void save() throws IOException {
        File file = new File("Algorithms/src/res/" + name);
        FileWriter writer = new FileWriter(file);

        for (Double[] c : content) {
            CSVUtils.writeLine(writer, Arrays.asList((c)));
        }


        writer.flush();
        writer.close();
    }

    public List<Double[]> getContent() {
        return content;
    }
}
