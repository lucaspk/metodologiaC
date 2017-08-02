package Sorting;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Lucas on 02/08/2017.
 */
public class SortTestes {
    protected final Double[] ascendingArray = {-1.0, -1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
    protected final Double[] descendingArray = {10.0, 9.0, 8.0, 7.0, 6.0, 5.0, 4.0, 3.0, -1.0, -1.0};
    protected final Double[] shuffledArray = {10.0, -1.0, -1.0, 3.0, 9.0, 5.0, 8.0, 4.0, 7.0, 6.0};
    protected final Double[] shuffledNegArray = {-10.0, -1.0, -1.0, -3.0, -9.0, -5.0, -8.0, -4.0, -7.0, -6.0};
    protected final Double[] emptyArray = {};

    protected Double[] ascending = new Double[10];
    protected Double[] descending = new Double[10];
    protected Double[] shuffled = new Double[10];
    protected Double[] shuffledNeg = new Double[10];
    protected Double[] empty = {};

    protected final Double[] expectedArray = {-1.0, -1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
    protected final Double[] expectedNegArray = {-10.0, -9.0, -8.0, -7.0, -6.0, -5.0, -4.0, -3.0, -1.0, -1.0};

    protected Sort quickSort;
    protected Sort mergeSort;
    protected Sort insertionSort;

    @Before
    public void setUp() {
        ascending = Arrays.copyOfRange(ascendingArray, 0, 10);
        descending = Arrays.copyOfRange(descendingArray, 0, 10);
        shuffled = Arrays.copyOfRange(shuffledArray, 0, 10);
        shuffledNeg = Arrays.copyOfRange(shuffledNegArray, 0, 10);
        quickSort = new QuickSort();
        insertionSort = new InsertionSort();
        mergeSort = new MergeSort();
    }

    @Test
    public void testQuickSortAscending(){
        quickSort.sort(ascending);
        assertArrayEquals(expectedArray, ascending);
    }

    @Test
    public void testQuickSortDescending(){
        quickSort.sort(descending);
        assertArrayEquals(expectedArray, descending);
    }

    @Test
    public void testQuickSortShuffled(){
        quickSort.sort(shuffled);
        assertArrayEquals(expectedArray, shuffled);
    }

    @Test
    public void testQuickSortNegShuffled(){
        quickSort.sort(shuffledNeg);
        assertArrayEquals(expectedNegArray, shuffledNeg);
    }

    @Test
    public void testQuickSortEmpty(){
        quickSort.sort(empty);
        assertArrayEquals(emptyArray, empty);
    }

    @Test
    public void testMergeSortAscending(){
        mergeSort.sort(ascending);
        assertArrayEquals(expectedArray, ascending);
    }

    @Test
    public void testMergeSortDescending(){
        mergeSort.sort(descending);
        assertArrayEquals(expectedArray, descending);
    }

    @Test
    public void testMergeSortShuffled(){
        mergeSort.sort(shuffled);
        assertArrayEquals(expectedArray, shuffled);
    }

    @Test
    public void testMergeSortNegShuffled(){
        mergeSort.sort(shuffledNeg);
        assertArrayEquals(expectedNegArray, shuffledNeg);
    }

    @Test
    public void testMergeSortEmpty(){
        mergeSort.sort(empty);
        assertArrayEquals(emptyArray, empty);
    }

    @Test
    public void testInsertionSortAscending(){
        insertionSort.sort(ascending);
        assertArrayEquals(expectedArray, ascending);
    }

    @Test
    public void testInsertionSortDescending(){
        insertionSort.sort(descending);
        assertArrayEquals(expectedArray, descending);
    }

    @Test
    public void testInsertionSortShuffled(){
        insertionSort.sort(shuffled);
        assertArrayEquals(expectedArray, shuffled);
    }

    @Test
    public void testInsertionSortNegShuffled(){
        insertionSort.sort(shuffledNeg);
        assertArrayEquals(expectedNegArray, shuffledNeg);
    }

    @Test
    public void testInsertionSortEmpty(){
        insertionSort.sort(empty);
        assertArrayEquals(emptyArray, empty);
    }
}
