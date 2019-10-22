/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.coding.interview.excercises.part1;

import org.proundmega.cs.coding.interview.excercises.part1.StringPermutation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thinkpad
 */
public class StringPermutationTest {
    
    public StringPermutationTest() {
    }

    @Test
    public void testCorrectPermutation() {
        String case1 = "abcde";
        String case2 = "edabc";
        
        assertTrue(StringPermutation.isPermutationOf(case1, case2));
    }
    
    
    @Test
    public void testFalsePermutation() {
        String case1 = "estaesunapermutacion";
        String case2 = "estanoesunapermutacion";
        
        assertFalse(StringPermutation.isPermutationOf(case1, case2));
    }
}
