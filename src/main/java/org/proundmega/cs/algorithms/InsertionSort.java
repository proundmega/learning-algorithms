package org.proundmega.cs.algorithms;

import java.util.Arrays;

/**
 *
 * @author thinkpad
 */
public class InsertionSort {
    
    public static void insertionSort(int[] arrayToSort) {
        for(int i = 1; i < arrayToSort.length; i++) {
            int value = arrayToSort[i];
            int nextValue = i - 1;
            while(nextValue >= 0 && arrayToSort[nextValue] > value) {
                arrayToSort[nextValue + 1] = arrayToSort[nextValue];
                nextValue--;
            }
            arrayToSort[nextValue + 1] = value;
        }
    }
    
    public static void insertionSortV2(int[] arrayToSort) {
        System.out.println("arrayToSort: " + Arrays.toString(arrayToSort));
        for(int i = 1; i < arrayToSort.length; i++) {
            int value = arrayToSort[i];
            int position = binarySearchMinimun(arrayToSort, value, 0, i);
            int tempValue = arrayToSort[position];
            
            System.out.println("Value: " + value);
            System.out.println("position: " + position);
            
            for(int move = position; move <= i; move++) {
                int nextValue = arrayToSort[move];
                arrayToSort[move] = tempValue;
                tempValue = nextValue;
            }
            
            arrayToSort[position] = value;
        }
    }
    
    private static int binarySearchMinimun(int[] searchArray, int value, int start, int end) {
        int distance = end - start;
        int middle = (start + end)/2;
        int currentValue = searchArray[middle];
        if(distance > 1) {
            if(currentValue < value) {
                return binarySearchMinimun(searchArray, value, middle, end);
            }
            else {
                return binarySearchMinimun(searchArray, value, start, middle);
            }
        }
        else if(currentValue < value) {
            return end;
        }
        else {
            return start;
        }
    }
}
