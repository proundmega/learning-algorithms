package org.proundmega.cs.algorithms.memory;

/**
 *
 * @author thinkpad
 */
public class MergeSortV7 {
    
    public static void sort(int[] values) {
        mergeSort(values, 0, values.length);
    }
    
    private static void mergeSort(int[] values, int start, int end) {
        int middle = (start + end)/2;
        int distance = end - start;
        if(distance > 1) {
            mergeSort(values, start, middle);
            mergeSort(values, middle, end);
            merge(values, start, middle, end);
        }
    }
    
    private static void merge(int[] values, int start, int middle, int end) {
        int[] part1 = new int[middle - start];
        for(int i = 0; i < part1.length; i++) {
            part1[i] = values[start + i];
        }
        
        int[] part2 = new int[end - middle];
        for(int i = 0; i < part2.length; i++) {
            part2[i] = values[middle + i];
        }
        
        int pointer1 = 0, pointer2 = 0;
        int distance = end - start;
        for(int i = 0; i < distance; i++) {
            if(part1.length == pointer1) {
                values[start + i] = part2[pointer2];
                pointer2++;
            }
            else if(part2.length == pointer2) {
                values[start + i] = part1[pointer1];
                pointer1++;
            }
            else if(part1[pointer1] < part2[pointer2]) {
                values[start + i] = part1[pointer1];
                pointer1++;
            }
            else {
                values[start + i] = part2[pointer2];
                pointer2++;
            }
        }
    }
}
