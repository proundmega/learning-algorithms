package org.proundmega.cs.coding.interview.excercises.part2;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thinkpad
 */
public class IntersectionLinkedListTest {
    
    public IntersectionLinkedListTest() {
    }

    /**
     * Test of getIntersections method, of class IntersectionLinkedList.
     */
    @Test
    public void testCorrectIntersection() {
        int nodeToCopy = 7;
        LinkedList<Integer> first = new LinkedList<>(Arrays.asList(
                3, 8, 7, 1, 29, 42, 2, 91, 72
        ));
            
        LinkedList<Integer> second = new LinkedList<>(Arrays.asList(
                2, 8, 32
        ));
        
        int oldLeght = second.getCount();
        Node<Integer> repeatedNode = first.getNodeByPosition(nodeToCopy);
        Node<Integer> latestNode = second.getNodeByPosition(oldLeght - 1);
        latestNode.setNextNode(repeatedNode);
        
        Tuple<Integer, Integer> expected = new Tuple<>(nodeToCopy, oldLeght);
        Tuple<Integer, Integer> actual = IntersectionLinkedList.getIntersections(first, second);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDistinctLinkedList() {
        LinkedList<Integer> first = new LinkedList<>(Arrays.asList(
                9, 10, 72, 61, 38, 2, 12
        ));
            
        LinkedList<Integer> second = new LinkedList<>(Arrays.asList(
                9, 87, 2, 8, 62, 7
        ));
        
        Tuple<Integer, Integer> expected = new Tuple<>(-1, -1);
        Tuple<Integer, Integer> actual = IntersectionLinkedList.getIntersections(first, second);
        
        assertEquals(expected, actual);
    }
    
}
