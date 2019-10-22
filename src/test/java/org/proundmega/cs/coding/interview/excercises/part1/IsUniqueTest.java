/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.coding.interview.excercises.part1;

import org.proundmega.cs.coding.interview.excercises.part1.IsUnique;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thinkpad
 */
public class IsUniqueTest {
    
    public IsUniqueTest() {
    }

    /**
     * Test of isUniqueWithMap method, of class IsUnique.
     */
    @Test
    public void testMapIsCorrecltyIUnique() {
        String text = "Al uniqe";
        assertTrue(IsUnique.isUniqueWithMap(text));
    }
    
    @Test
    public void testMapRepeatedValues() {
        String text = "This text is repeated";
        assertFalse(IsUnique.isUniqueWithMap(text));
    }
    
    @Test
    public void testNoStructIsCorrecltyIUnique() {
        String text = "Al uniqe";
        assertTrue(IsUnique.isUniqueNoStructs(text));
    }
    
    @Test
    public void testNoStructRepeatedValues() {
        String text = "This text is repeated";
        assertFalse(IsUnique.isUniqueNoStructs(text));
    }
}
