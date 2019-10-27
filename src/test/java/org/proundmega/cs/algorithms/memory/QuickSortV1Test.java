package org.proundmega.cs.algorithms.memory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.proundmega.cs.algorithms.utils.TestUtils;

/**
 *
 * @author thinkpad
 */
public class QuickSortV1Test {
    
    public QuickSortV1Test() {
    }

    /**
     * Test of sort method, of class QuickSortV1.
     */
    @Test
    public void testSort() {
        TestUtils.testSortFunction(10, QuickSortV1::sort);
    }
    
}
