/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thinkpad
 */
public class RandomSearchTest {
    
    public RandomSearchTest() {
    }

    /**
     * Test of getPositionOfValueByRandom1 method, of class RandomSearch.
     */
    @Test
    public void testSearchInexistentValue() {
        int[] values = {1, 2, 3, 4, 5};
        int searchValue = 6;
        
        assertEquals(-1, RandomSearch.getPositionOfValueByRandom1(values, searchValue));
    }
    
    @Test
    public void testSearchCorrect1() {
        int[] values = {1, 2, 3, 4, 5};
        int expectedPosition = 2;
        int searchValue = 3;
        
        assertEquals(expectedPosition, RandomSearch.getPositionOfValueByRandom1(values, searchValue));
    }
    
}
