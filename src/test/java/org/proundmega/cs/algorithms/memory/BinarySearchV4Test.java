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
public class BinarySearchV4Test {
    
    public BinarySearchV4Test() {
    }

    /**
     * Test of binarySearch method, of class BinarySearchV4.
     */
    @Test
    public void testBinarySearch() {
        int size = 10;
        TestUtils.testBinarySearch(size, BinarySearchV4::binarySearch);
    }
    
}
