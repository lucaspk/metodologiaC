package Sorting;

/**
 * Created by Lucas on 01/08/2017.
 */
public abstract class Sort {

    /*Que sort a nossa ♫*/
    protected abstract void sort(Double array[], boolean isAscending);

    public abstract void sort(Double[] array, Range range, boolean isAscending);
}
