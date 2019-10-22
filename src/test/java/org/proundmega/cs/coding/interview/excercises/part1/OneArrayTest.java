package org.proundmega.cs.coding.interview.excercises.part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thinkpad
 */
public class OneArrayTest {
    
    public OneArrayTest() {
    }

    /**
     * Test of requiresOneEdit method, of class OneArray.
     */
    @Test
    public void testEqualStrings() {
        String baseString = "test";
        String newstring = "test";
        
        assertTrue(OneArray.isOneEditDifference(baseString, newstring));
    }
    
    @Test
    public void testInsertStart() {
        String baseString = "test";
        String newstring = "ptest";
        
        assertTrue(OneArray.isOneEditDifference(baseString, newstring));
    }
    
    @Test
    public void testInsertInMiddle() {
        String baseString = "test";
        String newstring = "te2st";
        
        assertTrue(OneArray.isOneEditDifference(baseString, newstring));
    }
    
    @Test
    public void testInsertEnd() {
        String baseString = "test";
        String newstring = "test1";
        
        assertTrue(OneArray.isOneEditDifference(baseString, newstring));
    }
    
    @Test
    public void testWrongInserts() {
        String baseString = "test";
        String newstring = "test90";
        
        assertFalse(OneArray.isOneEditDifference(baseString, newstring));
    }
    
    @Test
    public void testWrongInserts2() {
        String baseString = "test";
        String newstring = "t9est0";
        
        assertFalse(OneArray.isOneEditDifference(baseString, newstring));
    }
    
    @Test
    public void testUpdateStart() {
        String baseString = "test";
        String newstring = "Lest";
        
        assertTrue(OneArray.isOneEditDifference(baseString, newstring));
    }
    
    @Test
    public void testUpdateMiddle() {
        String baseString = "test";
        String newstring = "teLt";
        
        assertTrue(OneArray.isOneEditDifference(baseString, newstring));
    }
    
    @Test
    public void testUpdateEnd() {
        String baseString = "test";
        String newstring = "tesL";
        
        assertTrue(OneArray.isOneEditDifference(baseString, newstring));
    }
    
    @Test
    public void testWrongUpdate1() {
        String baseString = "test";
        String newstring = "PLtest";
        
        assertFalse(OneArray.isOneEditDifference(baseString, newstring));
    }
    
    @Test
    public void testWrongUpdate2() {
        String baseString = "test";
        String newstring = "PtesLt";
        
        assertFalse(OneArray.isOneEditDifference(baseString, newstring));
    }
    
    @Test
    public void testDeleteStart() {
        String baseString = "test";
        String newstring = "est";
        
        assertTrue(OneArray.isOneEditDifference(baseString, newstring));
    }
    
    @Test
    public void testDeleteMiddle() {
        String baseString = "test";
        String newstring = "tst";
        
        assertTrue(OneArray.isOneEditDifference(baseString, newstring));
    }
    
    @Test
    public void testDeleteEnd() {
        String baseString = "test";
        String newstring = "tes";
        
        assertTrue(OneArray.isOneEditDifference(baseString, newstring));
    }
    
    @Test
    public void testWrongDeleteEnd() {
        String baseString = "test";
        String newstring = "ts";
        
        assertFalse(OneArray.isOneEditDifference(baseString, newstring));
    }
    
    @Test
    public void testMultipleSameEdits() {
        String baseString = "test";
        String newstring = "PLtest";
        
        assertTrue(OneArray.isMultpleEditOfDifference(baseString, newstring, 2));
    }
}
