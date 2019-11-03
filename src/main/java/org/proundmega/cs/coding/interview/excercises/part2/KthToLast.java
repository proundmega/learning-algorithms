package org.proundmega.cs.coding.interview.excercises.part2;

/**
 *
 * @author thinkpad
 */
public class KthToLast {
    
    public static <T> LinkedList<T> getkthNode(LinkedList<T> list, int position) {
        Node<T> kthNode = list.getRootNode();
        for(int i = 1; i <= position; i++) {
            kthNode = kthNode.getNextNode();
        }
        
        return new LinkedList<>(kthNode);
    }
}
