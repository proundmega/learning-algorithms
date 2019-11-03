package org.proundmega.cs.coding.interview.excercises.part2;

import lombok.Data;

/**
 *
 * @author thinkpad
 */
@Data
public class DoubleLinkedList<T> {
    private DoubleNode<T> rootNode;
    private DoubleNode<T> latestNode;
    
    public void append(T value) {
        if(rootNode == null) {
            rootNode = new DoubleNode<>(null, value);
        }
        else {
            DoubleNode<T> newLatestNode = rootNode.append(value);
            latestNode = newLatestNode;
        }
    }
    
    @Override
    public String toString() {
        StringBuilder builder  = new StringBuilder("[");
        DoubleNode currentNode = rootNode;
        while(currentNode != null) {
            builder.append(currentNode.getValue()).append(", ");
            currentNode = currentNode.getChild();
        }
        builder.append("]");
        
        return "DoubleLinkedList{" + "rootNode=" + builder.toString() + '}';
    }
}
