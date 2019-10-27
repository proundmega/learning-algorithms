package org.proundmega.cs.algorithms;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author VOlivares
 */
public class QuickSort {
    private static final Random rng = new SecureRandom();
    
    public static void sort(int[] values) {
        executeQuickSort(values, 0, values.length - 1);
    }
    
    private static void executeQuickSort(int[] values, int start, int end) {
        int distance = end - start;
        if(distance > 0) {
            int randomMiddle = partition(values, start, end);
            executeQuickSort(values, start, randomMiddle - 1);
            executeQuickSort(values, randomMiddle + 1, end);
        }
    }

    private static int partition(int[] values, int start, int end) {
        System.out.println("Start: " + start + ", end: " + end + ", values: " + Arrays.toString(values));
        int pivot = values[end];
        int i = start - 1;
        for(int currentPosition = start; currentPosition <= end; currentPosition++ ) {
            if(values[currentPosition] <= pivot) {
                i++;
                swap(values, i, currentPosition);
            }
        }
        
        return i;
    }
    
    private static void swap(int[] values, int a, int b) {
        int firstValue = values[a];
        int secondValue = values[b];
        
        values[a] = secondValue;
        values[b] = firstValue;
    }
    
    public static void randomSort(int[] values) {
        executeRandomQuickSort(values, 0, values.length - 1);
    }

    private static void executeRandomQuickSort(int[] values, int start, int end) {
        int distance = end - start;
        if(distance > 0) {
            int randomMiddle = randomPartition(values, start, end);
            executeQuickSort(values, start, randomMiddle - 1);
            executeQuickSort(values, randomMiddle + 1, end);
        }
    }

    private static int randomPartition(int[] values, int start, int end) {
        int randomPosition = rng.nextInt(values.length);
        swap(values, randomPosition, end);
        return partition(values, start, end);
    }
    
}
