/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.algorithms.memory;

import java.util.Arrays;
import org.proundmega.cs.algorithms.Heap;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author VOlivares
 */
public class HeapMaxV2Test {
    
    public HeapMaxV2Test() {
    }

    @Test
    public void testSomeMethod() {
        Integer[] values = {3, 4, 9, 71, 28, 8};
        
        HeapMaxV2<Integer> heap = new HeapMaxV2<>(values, Integer.class);
        int expected = 71;
        int actual = heap.getFirstElement();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testHeapSort() {
        Integer[] values = {9, 3, 29, 17, 62, 72};
        Integer[] expected = Arrays.copyOf(values, values.length);
        Arrays.sort(expected);
        
        Heap.sort(values, Integer.class);
        
        assertArrayEquals(expected, values);
    }
    
}
