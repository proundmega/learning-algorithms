package org.proundmega.cs.algorithms.memory;

/**
 *
 * @author thinkpad
 */
public class QuickSortV1 {
    
    public static void sort(int[] values) {
        quicksort(values, 0, values.length - 1);
    }
    
    private static void quicksort(int[] values, int start, int end) {
        int distance = end - start;
        if(distance > 0) {
           int middle = partition(values, start, end);
            quicksort(values, start, middle - 1);
            quicksort(values, middle + 1, end);
        }
    }
    
    private static int partition(int[] values, int start, int end) {
        int pivot = values[end];
        int startBlock = start - 1;
        for(int currentPosition = start; currentPosition <= end; currentPosition++) {
            if(values[currentPosition] <= pivot) {
                startBlock++;
                swap(values, currentPosition, startBlock);
            }
        }
        
        return startBlock;
    }
    
    private static void swap(int[] values, int a, int b) {
        int fisrtValue = values[a];
        int secondValue = values[b];
        
        values[a] = secondValue;
        values[b] = fisrtValue;
    }
        
}
