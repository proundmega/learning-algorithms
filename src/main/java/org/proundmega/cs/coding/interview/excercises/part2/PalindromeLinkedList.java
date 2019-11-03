/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.coding.interview.excercises.part2;

/**
 *
 * @author thinkpad
 */
public class PalindromeLinkedList {
    
    public static boolean isPalindrome(DoubleLinkedList<Character> values) {
        StringBuilder normalBuilder = new StringBuilder();
        StringBuilder reverseBuilder = new StringBuilder();
        
        // lets move first forward
        DoubleNode<Character> currentNode = values.getRootNode();
        while(currentNode != null) {
            normalBuilder.append(currentNode.getValue());
            
            currentNode = currentNode.getChild();
        }
        
        // now lets do it backward
        currentNode = values.getLatestNode();
        while(currentNode != null) {
            reverseBuilder.append(currentNode.getValue());
            
            currentNode = currentNode.getParent();
        }
        
        final String forwardString = normalBuilder.toString();
        final String backwardString = reverseBuilder.toString();
        
        System.out.println("forwardString: " + forwardString);
        System.out.println("backwardString: " + backwardString);
        
        
        return forwardString.equals(backwardString);
    }
}
