package org.proundmega.cs.coding.interview.excercises.part2;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thinkpad
 */
public class SumListTest {
    
    public SumListTest() {
    }

    /**
     * Test of sumLists method, of class SumList.
     */
    @Test
    public void testSumLists() {
        LinkedList<Integer> a = new LinkedList<>(Arrays.asList(
                4, 7, 1
        ));
        
        LinkedList<Integer> b = new LinkedList<>(Arrays.asList(
                9, 7, 6
        ));
        
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(
                3, 5, 8
        ));
        
        LinkedList<Integer> actual = SumList.sumLists(a, b);
        assertEquals(expected, actual);
    }
    
    
    @Test
    public void testSumListsALargerThanB() {
        LinkedList<Integer> a = new LinkedList<>(Arrays.asList(
                9, 0, 7, 3
        ));
        
        LinkedList<Integer> b = new LinkedList<>(Arrays.asList(
                9, 7, 6
        ));
        
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(
                8, 8, 3, 4
        ));
        
        LinkedList<Integer> actual = SumList.sumLists(a, b);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSumListsALargerThanBWithOverflow() {
        LinkedList<Integer> a = new LinkedList<>(Arrays.asList(
                9, 0, 7, 9
        ));
        
        LinkedList<Integer> b = new LinkedList<>(Arrays.asList(
                9, 7, 6
        ));
        
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(
                8, 8, 3, 0, 1
        ));
        
        LinkedList<Integer> actual = SumList.sumLists(a, b);
        assertEquals(expected, actual);
    }
}
