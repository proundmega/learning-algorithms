/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.coding.interview.excercises.part1;

import org.proundmega.cs.coding.interview.excercises.part1.URLify;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thinkpad
 */
public class URLifyTest {
    
    public URLifyTest() {
    }

    /**
     * Test of toUrl method, of class URLify.
     */
    @Test
    public void testToUrl() {
        String test = "This is a test";
        String expected = "This%20is%20a%20test";
        
        String actual = URLify.toUrl(test);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToUrlV2() {
        String test = "Mr John Smith";
        String expected = "Mr%20John%20Smith";
        
        String actual = URLify.toUrl(test);
        assertEquals(expected, actual);
    }
}
