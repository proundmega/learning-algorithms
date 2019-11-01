package org.proundmega.cs.coding.interview.excercises.part2;

import lombok.Data;

/**
 *
 * @author VOlivares
 */
@Data
public class Node<T> {
    private Node<T> nextNode;
    private T value;

    public Node(T value) {
        this.value = value;
        this.nextNode = null;
    }
    
    public Node(Node<T> nextNode, T value) {
        this.nextNode = nextNode;
        this.value = value;
    }
    
    public void append(T value) {
        Node currentNote = this;
        while(currentNote.nextNode != null) {
            currentNote = currentNote.nextNode;
        }
        Node newNode = new Node(value);
        currentNote.nextNode = newNode;
    }
    
    public Node deleteNode(int position) {
        int counter = 0;
        Node parentNode = null;
        Node currentNode = this;
        while(position > counter) {
            parentNode = currentNode;
            currentNode = currentNode.nextNode;
            counter++;
        }
        
        parentNode.nextNode = currentNode.nextNode;
        return currentNode;
    }
    
    public static final Node NULL_NODE = new Node(new Object());
    
    public boolean isNull() {
        return this == NULL_NODE;
    }
}
