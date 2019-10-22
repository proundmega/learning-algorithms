package org.proundmega.cs.coding.interview.excercises.part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thinkpad
 */
public class StringCompressionTest {
    
    public StringCompressionTest() {
    }

    /**
     * Test of compress method, of class StringCompression.
     */
    @Test
    public void testCompress() {
        String value = "aabcccccaaa";
        String expected = "a2b1c5a3";
        String actual = StringCompression.compress(value);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testWorthlessCompress() {
        String value = "abcdef";
        String expected = "abcdef";
        String actual = StringCompression.compress(value);
        
        assertEquals(expected, actual);
    }
    
}
