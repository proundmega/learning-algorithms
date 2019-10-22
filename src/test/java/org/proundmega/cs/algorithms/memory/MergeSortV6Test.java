/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.algorithms.memory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.proundmega.cs.algorithms.utils.TestUtils;

/**
 *
 * @author thinkpad
 */
public class MergeSortV6Test {
    
    public MergeSortV6Test() {
    }

    /**
     * Test of mergeSort method, of class MergeSortV6.
     */
    @Test
    public void testMergeSort() {
        TestUtils.testSortFunction(10, MergeSortV6::mergeSort);
    }
    
}
