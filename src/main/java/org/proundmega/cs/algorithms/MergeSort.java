/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.algorithms;

import java.util.Arrays;

/**
 *
 * @author thinkpad
 */
public class MergeSort {
    
    public static void mergeSort(int[] arrayToSort) {
        mergeSortLoop(arrayToSort, 0, arrayToSort.length);
    }
    
    private static void mergeSortLoop(int[] arrayToSort, int start, int end) {
        int middle = (end + start)/2;
        final int distance = end - start;
        if(distance > 1) {
            mergeSortLoop(arrayToSort, start, middle);
            mergeSortLoop(arrayToSort, middle, end);
            merge(arrayToSort, start, middle, end);
        }
    }
    
    private static void merge(int[] arrayToSort, int start, int middle, int end) {
        int fullLength = end - start;
        int n1 = middle - start;
        int n2 = end - middle;
        
        int[] part1 = new int[n1 + 1];
        for(int i = 0; i < n1; i++) {
            part1[i] = arrayToSort[start + i];
        }
        
        int[] part2 = new int[n2 + 1];
        for(int i = 0; i < n2; i++) {
            part2[i] = arrayToSort[middle + i];
        }
        
        part1[part1.length - 1] = Integer.MAX_VALUE;
        part2[part2.length - 1] = Integer.MAX_VALUE;
        
        int cursor1 = 0, cursor2 = 0;
        for(int i = 0; i < fullLength; i++) {
            if(part1[cursor1] < part2[cursor2]) {
                arrayToSort[start + i] = part1[cursor1];
                cursor1++;
            }
            else {
                arrayToSort[start + i] = part2[cursor2];
                cursor2++;
            }
        }
    }
}
