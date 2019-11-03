package org.proundmega.cs.coding.interview.excercises.part2;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 *
 * @author VOlivares
 */
@EqualsAndHashCode
public class LinkedList<T> {
    @Getter
    private Node<T> rootNode;

    public LinkedList() {
        
    }
    
    public LinkedList(Collection<T> values) {
        Node<T> currentNode = null;
        for(T value: values) {
            if(currentNode == null) {
                currentNode = new Node<>(value);
            }
            else {
                currentNode.append(value);
            }
        }
        
        this.rootNode = currentNode;
    }

    public LinkedList(Node<T> rootNode) {
        this.rootNode = rootNode;
    }
    
    public int getCount() {
        if(rootNode == null) return 0;
        else {
            int counter = 0;
            Node currentNode = rootNode;
            while(currentNode != null) {
                currentNode = currentNode.getNextNode();
                counter++;
            }
            
            return counter;
        }
    }
    
    public void append(T value) {
        if(rootNode == null) {
            rootNode = new Node(value);
        }
        else {
            rootNode.append(value);
        }
    }
    
    public Node<T> remove(int position) {
        if(rootNode != null) {
            return rootNode.deleteNode(position);
        }
        else return Node.NULL_NODE;
    }
    
    public void removeNode(Node<T> node) {
        Node<T> parentNode = rootNode;
        Node<T> childenNode = rootNode.getNextNode();
        while(node != childenNode) {
            parentNode = childenNode;
            childenNode = childenNode.getNextNode();
        }
        
        parentNode.setNextNode(childenNode.getNextNode());
    }
    
    public Node<T> getNodeByPosition(int position) {
        Node<T> currentNode = rootNode;
        for(int i = 1; i <= position; i++) {
            currentNode = currentNode.getNextNode();
        }
        
        return currentNode;
    }
    
    public Stream<Node<T>> stream() {
        Stream.Builder<Node<T>> builder = Stream
                .<Node<T>>builder();
        
        Node<T> currentNode = rootNode;
        while(currentNode != null) {
            builder.accept(currentNode);
        }
        
        return builder.build();
    }

    @Override
    public String toString() {
        StringBuilder builder  = new StringBuilder("[");
        Node currentNode = rootNode;
        while(currentNode != null) {
            builder.append(currentNode.getValue()).append(", ");
            currentNode = currentNode.getNextNode();
        }
        builder.append("]");
        
        return "LinkedList{" + "rootNode=" + builder.toString() + '}';
    }
}
