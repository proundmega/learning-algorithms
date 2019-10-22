/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.algorithms;

import org.proundmega.cs.algorithms.utils.TestUtils;
import org.proundmega.cs.algorithms.memory.MergeSortV2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.proundmega.cs.algorithms.memory.MergeSortV3;
import org.proundmega.cs.algorithms.memory.MergeSortv4;

/**
 *
 * @author thinkpad
 */
public class AlgorithmUtilsTest {
    
    public AlgorithmUtilsTest() {
    }

    /**
     * Test of mergeSort method, of class AlgorithmUtils.
     */
    @Test
    public void testMergeSort() {
        final int arrayLength = 10;
        TestUtils.testSortFunction(arrayLength, MergeSort::mergeSort);
    }
    
    @Test
    public void testMergeSortFromMemoryV2() {
        final int arrayLength = 10;
        TestUtils.testSortFunction(arrayLength, MergeSortV2::mergerSort);
    }
    
    @Test
    public void testMergeSortFromMemoryV3() {
        final int arrayLength = 10;
        TestUtils.testSortFunction(arrayLength, MergeSortV3::mergeSort);
    }
    
    @Test
    public void testMergeSortFromMemoryV4() {
        final int arrayLength = 10;
        for(int i = 0; i < 10; i++) {
            TestUtils.testSortFunction(arrayLength, MergeSortv4::mergeSort);
        }
    }

}
