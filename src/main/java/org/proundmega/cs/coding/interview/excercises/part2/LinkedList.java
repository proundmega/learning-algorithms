package org.proundmega.cs.coding.interview.excercises.part2;

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
    
    public Node remove(int position) {
        if(rootNode != null) {
            return rootNode.deleteNode(position);
        }
        else return Node.NULL_NODE;
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
            builder.append(currentNode.getValue() + ", ");
            currentNode = currentNode.getNextNode();
        }
        builder.append("]");
        
        return "LinkedList{" + "rootNode=" + builder.toString() + '}';
    }
}
