/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.coding.interview.excercises.part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thinkpad
 */
public class PalindromePermutationTest {
    
    public PalindromePermutationTest() {
    }

    /**
     * Test of hasPalindrome method, of class PalindromePermutation.
     */
    @Test
    public void testCorrectPalindrome() {
        String testValue = "taco cat";
        assertTrue(PalindromePermutation.hasPalindrome(testValue));
    }
    
    @Test
    public void testFalsePalindrome1() {
        String testValue = "palindrome";
        assertFalse(PalindromePermutation.hasPalindrome(testValue));
    }
}
