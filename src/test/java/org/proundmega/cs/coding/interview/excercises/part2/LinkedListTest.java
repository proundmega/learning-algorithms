package org.proundmega.cs.coding.interview.excercises.part2;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VOlivares
 */
public class LinkedListTest {
    
    public LinkedListTest() {
    }

    @Test
    public void testInsertAndCountNodes() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(1);
        assertEquals(1, linkedList.getCount());
    }
    
    @Test
    public void testZeroNodeCount() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        assertEquals(0, linkedList.getCount());
    }
    
    @Test
    public void testMultipleInserts() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int expectedLength = 5;
        for(int i = 0; i < expectedLength; i++) {
            linkedList.append(i);
        }
        assertEquals(expectedLength, linkedList.getCount());
    }
    
    @Test
    public void testTransverseNodes() {
        List<Integer> expected = Arrays.asList(3, 9, 29, 87, 2);
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        for(Integer value: expected) {
            linkedList.append(value);
        }
        
        Node currentNode = linkedList.getRootNode();
        for(Integer value: expected) {
            assertEquals(value, currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }
    }
    
    
    @Test
    public void testDeleteNodeValid() {
        List<Integer> testValues = Arrays.asList(3, 9, 29, 87, 2);
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        for(Integer value: testValues) {
            linkedList.append(value);
        }
        
        int position = 3;
        int expected = 87;
        Node removedNode = linkedList.remove(position);
        assertEquals(expected, removedNode.getValue());
        assertEquals(testValues.size() - 1, linkedList.getCount());
    }
    
    @Test
    public void testDeleteOnNewLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Node returnNode = linkedList.remove(0);
        assertTrue(returnNode.isNull());
    }
    
    @Test
    public void testDeleteNodeByRef() {
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(
                3, 8, 120, 871, 26, 281, 62, 81
        ));
        
        LinkedList<Integer> actual = new LinkedList<>(Arrays.asList(
                3, 8, 120, 871, 26, 281, 62, 2, 81
        ));
        
        Node<Integer> nodeToDelete = actual.getNodeByPosition(7);
        assertEquals(2, nodeToDelete.getValue().intValue());
        
        // time to delete this node
        actual.removeNode(nodeToDelete);
        
        assertEquals(expected, actual);
    }
}
