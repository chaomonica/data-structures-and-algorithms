package data.structures.and.algorithms;

import data.structures.and.algorithms.mergesort.MergeSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

    private MergeSort mergeSort;

    @BeforeEach
    void setup(){
        mergeSort = new MergeSort();
    }

    @Test
    void mergeSort_exists(){
        assertNotNull(mergeSort);
    }

    @Test
    void mergeSort_canMergeArray_withTwoSortedHalves(){
        int [] halfSorted = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int [] temp = new int[halfSorted.length];
        int leftStart = 0;
        int rightEnd = 9;

        mergeSort.setUnsorted(halfSorted);
        mergeSort.setTemp(temp);

        int[] actual = mergeSort.merge(0, 9);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean hasSameValues = Arrays.equals(actual, expected);
        assertEquals(true, hasSameValues);
    }

    @Test
    void mergeSort_sortsArray(){
        int[] unsorted = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int [] temp = new int[unsorted.length];

        int[] actual = mergeSort.sort(unsorted);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean hasSameValues = Arrays.equals(actual, expected);
        assertTrue(hasSameValues);

    }




}
