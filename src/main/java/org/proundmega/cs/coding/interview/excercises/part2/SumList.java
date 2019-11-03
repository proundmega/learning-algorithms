package org.proundmega.cs.coding.interview.excercises.part2;

/**
 *
 * @author thinkpad
 */
public class SumList {
    
    public static LinkedList<Integer> sumLists(LinkedList<Integer> a, LinkedList<Integer> b) {
        int remaining = 0;
        int currentSum = 0;
        Node<Integer> aDigit = a.getRootNode();
        Node<Integer> bDigit = b.getRootNode();
        
        LinkedList<Integer> result = new LinkedList<>();
        
        while(aDigit != null || bDigit != null) {
            /** There are 3 cases:
             * 
             *   1) Both are not null, so both are summed
             *   2) Only a is not null, so I take that value
             *   3) Only b is not null, so I take that value
             * 
             */
            if(aDigit != null && bDigit != null) {
                currentSum = aDigit.getValue() + bDigit.getValue() + remaining;
                aDigit = aDigit.getNextNode();
                bDigit = bDigit.getNextNode();
            }
            else if(bDigit == null) {
                currentSum = aDigit.getValue() + remaining;
                aDigit = aDigit.getNextNode();
            }
            else {
                currentSum = bDigit.getValue() + remaining;
                bDigit = bDigit.getNextNode();
            }
            
            // I only need the current dijit for this value
            result.append(currentSum % 10);
            remaining = currentSum/10;
        }
        
        if(remaining > 0) {
            result.append(remaining);
        }
        
        return result;
    }
}
