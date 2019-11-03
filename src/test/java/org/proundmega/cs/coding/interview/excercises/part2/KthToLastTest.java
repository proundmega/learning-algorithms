package org.proundmega.cs.coding.interview.excercises.part2;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thinkpad
 */
public class KthToLastTest {
    
    public KthToLastTest() {
    }

    /**
     * Test of getkthNode method, of class KthToLast.
     */
    @Test
    public void testGetkthNode() {
        LinkedList<Integer> values = new LinkedList<>(Arrays.asList(
                1, 4, 8, 9, 6, 1, 9, 2
        ));
        
        int position = 4;
        
        System.out.println("values: " + values);
        
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(
                6, 1, 9, 2
        ));
        
        LinkedList<Integer> actual = KthToLast.getkthNode(values, position);
        assertEquals(expected, actual);
    }
    
}
