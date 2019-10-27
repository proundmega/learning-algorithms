/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.algorithms.memory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 *
 * @author VOlivares
 */
public class HeapMaxV1Test {
    
    public HeapMaxV1Test() {
    }

    @Test
    public void testSomeMethod() {
        Integer[] values = {3, 9, 10, 8, 6};
        HeapMaxV1<Integer> heap = new HeapMaxV1<>(values, Integer.class);
        
        int expected = 10;
        int actual = heap.getFirstElement();
        
        System.out.println(heap);
        
        assertEquals(expected, actual);
    }
    
}
