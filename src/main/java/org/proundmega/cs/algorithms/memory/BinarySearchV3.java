package org.proundmega.cs.algorithms.memory;

/**
 *
 * @author thinkpad
 */
public class BinarySearchV3 {
    
    public static int binarySearch(int[] searchArray, int value) {
        return binarySeachLoop(searchArray, value, 0, searchArray.length);
    }
    
    private static int binarySeachLoop(int[] searchArray, int value, int start, int end) {
        int middle = (start + end)/2;
        int distance = end - start;
        int currentValue = searchArray[middle];
        if(currentValue == value) {
            return middle;
        }
        else if(distance > 1) {
            if(value <  currentValue) {
                return binarySeachLoop(searchArray, value, start, middle);
            }
            else {
                return binarySeachLoop(searchArray, value, middle, end);
            }
        }
        else return -1;
    }
}
