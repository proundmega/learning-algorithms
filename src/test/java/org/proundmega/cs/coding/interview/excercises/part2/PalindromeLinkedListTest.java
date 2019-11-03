/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.coding.interview.excercises.part2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thinkpad
 */
public class PalindromeLinkedListTest {
    
    public PalindromeLinkedListTest() {
    }

    /**
     * Test of isPalindrome method, of class IsPalindrome.
     */
    @Test
    public void testIsPalindrome() {
        String text = "amoreroma";
        DoubleLinkedList<Character> palindromeText = toCharacterDoubleLinkedList(text);
        
        assertTrue(PalindromeLinkedList.isPalindrome(palindromeText));
    }
    
    private DoubleLinkedList<Character> toCharacterDoubleLinkedList(String text) {
        DoubleLinkedList<Character> linkedList = new DoubleLinkedList<>();
        
        char[] characters = text.toCharArray();
        for(int i = 0; i < characters.length; i++) {
            linkedList.append(characters[i]);
        }
        
        return linkedList;
    }
    
    @Test
    public void testNonPalindrome() {
        String text = "this is a test";
        DoubleLinkedList<Character> palindromeText = toCharacterDoubleLinkedList(text);
        
        assertFalse(PalindromeLinkedList.isPalindrome(palindromeText));
    }
}
