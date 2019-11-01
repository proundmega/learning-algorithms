/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.algorithms;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VOlivares
 */
public class CountingSortTest {
    
    public CountingSortTest() {
    }

    @Test
    public void testSomeMethod() {
        int[] values  = {3, 4, 7, 8, 1, 9, 2, 8, 7, 8};
        int[] expected = {1, 2, 3, 4, 7, 7, 8, 8, 8, 9};
        
        int[] actual = CountingSort.sort(values);
//        System.out.println("Expected: " +  Arrays.toString(expected));
//        System.out.println("Actual: " +  Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void generateRandomNumbers() {
        int[] values = {2, 6, 6, 12, 7, 15, 18, 10, 18
                , 0, 4, 4, 13, 19, 7, 5, 8, 8
                , 18, 6, 15, 9, 10, 1, 1, 19
                , 18, 7, 10, 5, 6, 10, 13, 4
                , 10, 12, 17, 4, 10, 19};
        
        int[] expected = Arrays.copyOf(values, values.length);
        Arrays.sort(expected);
        
        int[] actual = CountingSort.sort(values);
        assertArrayEquals(expected, actual);
    }

    private void printRandomSequence(int expetedRandom, int bound) {
        Random random = new SecureRandom();
        for(int i = 0; i < expetedRandom; i++) {
            int nextInt = random.nextInt(bound);
            System.out.print(nextInt + ", ");
        }
    }
    
}
