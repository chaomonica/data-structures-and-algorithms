package data.structures.and.algorithms;

import data.structures.and.algorithms.quicksort.QuickSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class QuickSortTest {

    private QuickSort quickSort;

    @BeforeEach
    void setUP() {
        quickSort = new QuickSort();
    }

    @Test
    void newQuickSort_should_exist(){
        assertNotNull(quickSort);
    }

    @Test
    void quickSort_lengthZero_returns_array(){
        int[] unsorted = {};

        int[] expected = unsorted;
        int[] actual = quickSort.sort(unsorted);
        assertEquals(expected, actual);
    }

    @Test
    void quickSort_lengthOne_returns_array(){
        int[] unsorted = {1};

        int[] expected = unsorted;
        int[] actual = quickSort.sort(unsorted);
        assertEquals(expected, actual);
    }

    @Test
    void quickSort_sorts_lengthThree(){
        int[] unsorted = {2,1, 0};
        int [] expected = {0, 1, 2};

        int[] sorted = quickSort.sort(unsorted);

        boolean areEqual = Arrays.equals(expected, sorted);
        assertEquals(true, areEqual);

    }

}
