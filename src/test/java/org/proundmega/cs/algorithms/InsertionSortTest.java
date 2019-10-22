/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.algorithms;

import org.proundmega.cs.algorithms.utils.TestUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thinkpad
 */
public class InsertionSortTest {
    
    public InsertionSortTest() {
    }

    /**
     * Test of insertionSort method, of class InsertionSort.
     */
    @Test
    public void testInsertionSort() {
        TestUtils.testSortFunction(100, InsertionSort::insertionSort);
    }
    
    @Test
    public void testInsertionSortV2() {
        TestUtils.testSortFunction(10, InsertionSort::insertionSortV2);
    }
    
}
