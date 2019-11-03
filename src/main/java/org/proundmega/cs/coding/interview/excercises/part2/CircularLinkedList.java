package org.proundmega.cs.coding.interview.excercises.part2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author thinkpad
 */
public class CircularLinkedList {
    public static <T> Node<T> getCircularEntry(LinkedList<T> list) {
        Map<Integer, Boolean> previouslyUsedNodes = new HashMap<>();
        Node<T> currentNode = list.getRootNode();
        while(currentNode != null) {
            int currentReference = System.identityHashCode(currentNode);
            if(!previouslyUsedNodes.containsKey(currentReference)) {
                previouslyUsedNodes.put(currentReference, Boolean.TRUE);
            }
            else return currentNode;
            
            currentNode = currentNode.getNextNode();
        }
        
        // if i am here, return the null node
        return Node.NULL_NODE;
    }
    
}
