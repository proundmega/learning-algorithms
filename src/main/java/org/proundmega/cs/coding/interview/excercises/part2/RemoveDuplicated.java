package org.proundmega.cs.coding.interview.excercises.part2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author VOlivares
 */
public class RemoveDuplicated {
    
    public static <T> LinkedList<T> removeDuplicates(LinkedList<T> values) {
        // cache for improving performance
        Map<T, Boolean> usedValues = new HashMap<>();

        LinkedList<T> newCopy = new LinkedList<>();
        
        Node<T> currentNode = values.getRootNode();
        while(currentNode != null) {
            currentNode = processAndGetNextNode(currentNode, usedValues, newCopy);
        }
        
        return newCopy;
    }

    private static <T> Node<T> processAndGetNextNode(Node<T> currentNode, Map<T, Boolean> usedValues, LinkedList<T> newCopy) {
        T value = currentNode.getValue();
        if(usedValues.get(value) == null) {
            usedValues.put(value, Boolean.TRUE);
            newCopy.append(value);
        }
        currentNode = currentNode.getNextNode();
        return currentNode;
    }
}
