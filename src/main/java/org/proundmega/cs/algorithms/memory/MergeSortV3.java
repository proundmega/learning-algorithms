package org.proundmega.cs.algorithms.memory;

/**
 *
 * @author thinkpad
 */
public class MergeSortV3 {
    
    public static void mergeSort(int[] arrayToSort) {
        mergerSortLoop(arrayToSort, 0, arrayToSort.length);
    }
    
    private static void mergerSortLoop(int[] arrayToSort, int start, int end) {
        int middle = (start + end)/2;
        int distance = end - start;
        if(distance > 1) {
            mergerSortLoop(arrayToSort, start, middle);
            mergerSortLoop(arrayToSort, middle, end);
            merge(arrayToSort, start, middle, end);
        }
    }
    
    private static void merge(int[] arraytToSort, int start, int middle, int end) {
        int fullLength = end - start;
        int n1 = middle - start;
        int n2 = end - middle;
        
        int[] part1 = new int[n1 + 1];
        for(int i = 0; i < n1; i++) {
            part1[i] = arraytToSort[start + i];
        }
        part1[part1.length - 1] = Integer.MAX_VALUE;
                
        int[] part2 = new int[n2 + 1];
        for(int i = 0; i < n2; i++) {
            part2[i] = arraytToSort[middle + i];
        }
        part2[part2.length - 1] = Integer.MAX_VALUE;
        
        int cursor1 = 0, cursor2 = 0;
        for(int i = 0; i < fullLength; i++) {
            if(part1[cursor1] < part2[cursor2]) {
                arraytToSort[start +  i] = part1[cursor1];
                cursor1++;
            }
            else {
                arraytToSort[start + i] = part2[cursor2];
                cursor2++;
            }
        }
    }
}
