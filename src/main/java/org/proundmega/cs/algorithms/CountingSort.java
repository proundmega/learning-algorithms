package org.proundmega.cs.algorithms;

/**
 *
 * @author VOlivares
 */
public class CountingSort {
    
    public static int[] sort(int[] values) {
        int length = values.length;
        
        // first I calculate the max value of the array
        int maxValue = -1;
        for(int i = 0; i < length; i++) {
            if(maxValue < values[i]) {
                maxValue = values[i];
            }
        }
        
        // next I create an array using this value as the length of it
        int[] counter = new int[maxValue + 1];
        
        // it's time to count every number's occurrence on the search array
        for(int i = 0; i < length; i++) {
            int value = values[i];
            counter[value] += 1;
        }
        
        // now it's time to get the numbers that are equals or less than the indexes
        for(int i = 1; i < counter.length; i++) {
            counter[i] = counter[i] + counter[i - 1];
        }
        
        // finally time to move the values to their current position
        int[] result = new int[length];
        for(int i = 0; i < length; i++) {
            int value = values[i];
            int currentPosition = counter[value];
            result[currentPosition - 1] = value;
            
            // time to decrease the counter
            counter[value] = currentPosition - 1;
        }
        
        return result;
    }
}
