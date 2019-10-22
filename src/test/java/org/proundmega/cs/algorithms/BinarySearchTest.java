/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.algorithms;

import org.proundmega.cs.algorithms.utils.TestUtils;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.proundmega.cs.algorithms.memory.BinarySearchV2;

/**
 *
 * @author thinkpad
 */
public class BinarySearchTest {
    
    public BinarySearchTest() {
    }

    /**
     * Test of binarySearch method, of class BinarySearch.
     */
    @Test
    public void testBinarySearch() {
        Random random = new SecureRandom();
        int[] testArray = TestUtils.generateRandomIntegerArray(100);
        Arrays.sort(testArray);
        int expectedRandomPosition = random.nextInt(testArray.length);
        
        int value = testArray[expectedRandomPosition];
        int actual = BinarySearch.binarySearch(testArray, value);
        
        assertEquals(expectedRandomPosition, actual);
    }
    
    @Test
    public void testBinarySearchMemoryV2() {
        Random random = new SecureRandom();
        int[] testArray = TestUtils.generateRandomIntegerArray(100);
        Arrays.sort(testArray);
        int expectedRandomPosition = random.nextInt(testArray.length);
        
        int value = testArray[expectedRandomPosition];
        int actual = BinarySearchV2.binarySearch(testArray, value);
        
        assertEquals(expectedRandomPosition, actual);
    }
    
}
