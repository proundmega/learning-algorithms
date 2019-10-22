package org.proundmega.cs.algorithms.memory;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Function;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.proundmega.cs.algorithms.utils.TestUtils;

/**
 *
 * @author thinkpad
 */
public class BinarySearchV3Test {
    
    public BinarySearchV3Test() {
    }

    /**
     * Test of binarySearch method, of class BinarySearchV3.
     */
    @Test
    public void testBinarySearch() {
        int selectedLength = 100;
        TestUtils.testBinarySearch(selectedLength, BinarySearchV3::binarySearch);
    }
    
}
