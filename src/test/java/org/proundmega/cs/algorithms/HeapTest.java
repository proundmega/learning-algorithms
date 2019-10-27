package org.proundmega.cs.algorithms;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author VOlivares
 */
public class HeapTest {
    
    public HeapTest() {
    }

    @Test
    public void testMaxValue() {
        Integer[] values = {3, 5, 6, 8, 1, 2};
        Heap<Integer> heap = new Heap<>(values, Integer.class);
        
        int expected  = 8;
        int actual = heap.getTopElement();
        assertEquals(expected, actual);
    }
    
    public void testSort() {
        Integer[] values = {100, 37, 812, 4918, 72, 9, 74, 61};
        Integer[] expected = Arrays.copyOf(values, values.length);
        
        Arrays.sort(expected);
        Heap.sort(values, Integer.class);
        
        assertArrayEquals(expected, values);
    }
    
    @Test
    public void testRemoverElementos() {
        Integer[] values = {100, 37, 812, 4918, 72, 9, 74, 61};
        Heap<Integer> heap = new Heap<>(values, Integer.class);
        
        Integer[] expected = Arrays.copyOf(values, values.length);
        Arrays.sort(expected, (a, b) -> b.compareTo(a));
        
        for(int i = 0; i < values.length; i++) {
            int intValue = expected[i];
            int currentValue = heap.getAndRemoveTopElement();
            assertEquals(intValue, currentValue);
        }
    }
    
    @Test
    public void testAddElement() {
        Integer[] values = {100, 37, 812, 102, 72, 9, 74, 61};
        Heap<Integer> heap = new Heap<>(values, Integer.class);
        
        int nextValue = 2900;
        heap.addElement(nextValue);
        
        assertEquals(nextValue, heap.getTopElement().intValue());
    }
        
}
