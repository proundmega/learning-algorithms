package org.proundmega.cs.algorithms.memory;

/**
 *
 * @author thinkpad
 */
public class BinarySearchV2 {
    
    public static int binarySearch(int[] searchArray, int valor) {
        return binarySearchLoop(searchArray, valor, 0, searchArray.length);
    }
    
    private static int binarySearchLoop(int[] searchArray, int  value, int start, int end) {
        int middle = (start + end)/2;
        int distance = end - start;
        int currentValue = searchArray[middle];
        if(currentValue == value) {
            return middle;
        }
        else if(distance > 1) {
            if(currentValue > value) {
                return binarySearchLoop(searchArray, value, start, middle);
            }
            else {
                return binarySearchLoop(searchArray, value, middle, end);
            }
        }
        else return -1;
    }
}
