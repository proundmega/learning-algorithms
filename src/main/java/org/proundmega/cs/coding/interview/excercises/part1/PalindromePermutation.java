/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.coding.interview.excercises.part1;

import java.util.Map;
import org.proundmega.cs.coding.interview.excercises.util.StringCounter;

/**
 *
 * @author thinkpad
 */
public class PalindromePermutation {
    
    /** In order for this to work, each non-central character must exist in pairs and
     *  with central characters certain special rules apply depending on the string itself:
     * 
     *  - If the String is odd (1, 3) then there should be only one character that has it counting odd
     *    and every other characters must be even
     * 
     *  - If the String is even (2, 4) then either (1) every character must be even or (2) every
     *    character minus 2 must be even and the remaining 2 characters must be odd.
     * 
     * @param test
     * @return 
     */
    public static boolean hasPalindrome(String test) {
        StringCounter counter = new StringCounter(test);
        Map<Character, Integer> counting = counter.getCounting();
        
        // is even?
        final boolean isEven = test.length() % 2 == 0;
        if(isEven) {
            return checkEvenPalindrome(counting);
        }
        else {
            return checkOddPalindrome(counting);
        }
    }
    
    private static boolean checkEvenPalindrome(Map<Character, Integer> counting) {
        long countOfOdd = getOddCount(counting);
        return countOfOdd == 0 || countOfOdd == 2;
    }

    private static long getOddCount(Map<Character, Integer> counting) {
        long countOfOdd = counting.values()
                .stream()
                .filter(value -> value % 2 == 1)
                .count();
        return countOfOdd;
    }

    private static boolean checkOddPalindrome(Map<Character, Integer> counting) {
        long countOfOdd = getOddCount(counting);
        return countOfOdd == 1;
    }
}
