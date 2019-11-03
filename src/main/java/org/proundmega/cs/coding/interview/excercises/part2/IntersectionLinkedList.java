package org.proundmega.cs.coding.interview.excercises.part2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author thinkpad
 */
public class IntersectionLinkedList {
    
    public static <T> Tuple<Integer, Integer> getIntersections(LinkedList<T> first, LinkedList<T> second) {
        Map<Integer, Integer> counter = new HashMap<>();
        Node<T> currentNode = first.getRootNode();
        
        int positionCounter = 0;
        while(currentNode != null) {
            final int identityHashCode = System.identityHashCode(currentNode);
            counter.put(identityHashCode, positionCounter);
            currentNode = currentNode.getNextNode();
            positionCounter++;
        }
        
        currentNode = second.getRootNode();
        positionCounter = 0;
        while(currentNode != null) {
            final int identityHashCode = System.identityHashCode(currentNode);
            if(counter.containsKey(identityHashCode)) {
                int firstPosition = counter.get(identityHashCode);
                return new Tuple<>(firstPosition, positionCounter);
            }
            currentNode = currentNode.getNextNode();
            positionCounter++;
        }
        
        // if here it means no repeated values, so return 'null like' value
        return new Tuple<>(-1, -1);
    }
}
