package org.proundmega.cs.coding.interview.excercises.part2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VOlivares
 */
public class RemoveDuplicatedTest {
    
    public RemoveDuplicatedTest() {
    }

    @Test
    public void testRemoveDuplicates() {
        LinkedList<Integer> linkedList = toLinkedList(3, 5, 9, 8, 3, 7, 7);
        
        LinkedList<Integer> expected = toLinkedList(3, 5, 9, 8, 7);
        LinkedList<Integer> actual = RemoveDuplicated.removeDuplicates(linkedList);
        assertEquals(expected, actual);
    }
    
    private LinkedList<Integer> toLinkedList(int... values) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < values.length; i++) {
            linkedList.append(values[i]);
        }
        
        return linkedList;
    }
    
    
    @Test
    public void testRemoveDuplicatesUltra() {
        LinkedList<Integer> linkedList = toLinkedList(3, 3, 3, 9, 4, 5, 6, 8, 9, 3);
        
        LinkedList<Integer> expected = toLinkedList(3, 9, 4, 5, 6, 8);
        LinkedList<Integer> actual = RemoveDuplicated.removeDuplicates(linkedList);
        assertEquals(expected, actual);
    }
}
