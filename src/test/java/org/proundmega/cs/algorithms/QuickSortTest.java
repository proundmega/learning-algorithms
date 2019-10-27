package org.proundmega.cs.algorithms;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author VOlivares
 */
public class QuickSortTest {
    
    public QuickSortTest() {
    }

    @Test
    public void testQuickSort() {
        int[] values = {3, 21, 9, 821, 82, 71, 2};
        
        int[] expected = Arrays.copyOf(values, values.length);
        Arrays.sort(expected);
        QuickSort.sort(values);
        
        assertArrayEquals(expected, values);
    }
    
    @Test
    public void testRandmoQuickSort() {
        int[] values = {9, 2, 39, 71, 98, 72, 6, 18};
        
        int[] expected = Arrays.copyOf(values, values.length);
        Arrays.sort(expected);
        QuickSort.randomSort(values);
        
        assertArrayEquals(expected, values);
    }
}
