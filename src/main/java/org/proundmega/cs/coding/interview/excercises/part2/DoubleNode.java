package org.proundmega.cs.coding.interview.excercises.part2;

import lombok.Data;

/**
 *
 * @author thinkpad
 */
@Data
public class DoubleNode<T> {
    private DoubleNode<T> parent;
    private DoubleNode<T> child;
    private T value;

    public DoubleNode(DoubleNode<T> parent, T value) {
        this.parent = parent;
        this.value = value;
    }
    
    public DoubleNode append(T value) {
        DoubleNode<T> currentNode = this;
        while(currentNode.child != null) {
            currentNode = currentNode.child;
        }
        
        DoubleNode<T> newNode = new DoubleNode<>(currentNode, value);
        currentNode.child = newNode;
        
        return newNode;
    }
}
