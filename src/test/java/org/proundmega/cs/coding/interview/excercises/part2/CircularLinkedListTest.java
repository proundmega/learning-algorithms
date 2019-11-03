package org.proundmega.cs.coding.interview.excercises.part2;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thinkpad
 */
public class CircularLinkedListTest {
    
    public CircularLinkedListTest() {
    }

    /**
     * Test of getCircularEntry method, of class CircularLinkedList.
     */
    @Test
    public void testGetCircularEntry() {
        int positionLoop = 6;
        LinkedList<Integer> values = new LinkedList<>(Arrays.asList(
                3, 9, 81, 2, 1, 72, 82, 8, 91, 2
        ));
        
        Node<Integer> currentNode = values.getNodeByPosition(positionLoop);
        Node<Integer> lastNode = values.getNodeByPosition(values.getCount() - 1);
        lastNode.setNextNode(currentNode);
        
        Node<Integer> actual = CircularLinkedList.getCircularEntry(values);
        assertSame(currentNode, actual);
        
    }
    
    @Test
    public void testNormalLinkedList() {
        LinkedList<Integer> values = new LinkedList<>(Arrays.asList(
                3, 9, 81, 2, 1, 72, 82, 8, 91, 2
        ));
        
        Node<Integer> nullNode = Node.NULL_NODE;
        Node<Integer> actual = CircularLinkedList.getCircularEntry(values);
        assertSame(nullNode, actual);
    }
    
}
