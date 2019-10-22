package org.proundmega.cs.algorithms.memory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.proundmega.cs.algorithms.utils.TestUtils;

/**
 *
 * @author thinkpad
 */
public class MergeSortV5Test {
    
    public MergeSortV5Test() {
    }

    /**
     * Test of mergeSort method, of class MergeSortV5.
     */
    @Test
    public void testMergeSort() {
        TestUtils.testSortFunction(10, MergeSortV5::mergeSort);
    }
    
}
