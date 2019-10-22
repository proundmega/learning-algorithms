/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.algorithms.memory;

/**
 *
 * @author thinkpad
 */
public class BinarySearchV4 {
    
    public static int binarySearch(int[] searchArray, int value) {
        return binarySearchLoop(searchArray, value, 0, searchArray.length);
    }
    
    private static int binarySearchLoop(int[] searchArray, int value, int start, int end) {
        int middle = (start + end)/2;
        int distance = end - start;
        
        int currentValue = searchArray[middle];
        if(value  == currentValue) {
            return middle;
        }
        else if(distance > 1) {
            if(value < currentValue) {
                return binarySearchLoop(searchArray, value, start, middle);
            }
            else {
                return binarySearchLoop(searchArray, value, middle, end);
            }
        }
        else return -1;
    }
}
