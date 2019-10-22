package org.proundmega.cs.algorithms;

/**
 *
 * @author thinkpad
 */
public class BinarySearch {
    
    public static int binarySearch(int[] searchArray, int value) {
        return binarySearchLoop(searchArray, value, 0, searchArray.length);
    }
    
    private static int binarySearchLoop(int[] searchArray, int value, int start, int end) {
        int middle = (start + end)/2;
        int distance = end - start;
        int middleValue = searchArray[middle];
        if(middleValue == value) {
            return middle;
        }
        else if(distance > 1) {
            if(middleValue > value) {
                return binarySearchLoop(searchArray, value, start, middle);
            }
            else {
                return binarySearchLoop(searchArray, value, middle, end);
            }
        }
        else return -1;
    }
}
