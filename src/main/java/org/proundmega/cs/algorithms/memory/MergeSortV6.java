package org.proundmega.cs.algorithms.memory;

/**
 *
 * @author thinkpad
 */
public class MergeSortV6 {
    
    public static void mergeSort(int[] arrayToSort) {
        mergeSortLoop(arrayToSort, 0 , arrayToSort.length);
    }
    
    private static void mergeSortLoop(int[] arrayToSort, int start, int end) {
        int middle = (start + end)/2;
        int distance = end - start;
        if(distance > 1) {
            mergeSortLoop(arrayToSort, start, middle);
            mergeSortLoop(arrayToSort, middle, end);
            merge(arrayToSort, start, middle, end);
        }
    }
    
    private static void merge(int[] arrayToSort, int start, int middle, int end) {
        int n1 = middle - start;
        int[] part1 = new int[n1];
        for(int i = 0; i < n1; i++) {
            part1[i] = arrayToSort[start + i];
        }
        
        int n2 = end - middle;
        int[] part2 = new int[n2];
        for(int i = 0; i < n2; i++) {
            part2[i] = arrayToSort[middle + i];
        }
        
        // now it is time to merge both arrays
        int fullLength = end - start;
        int cursor1 = 0, cursor2 = 0;
        for(int i = 0; i < fullLength; i++) {
            if(cursor1 == part1.length) {
                arrayToSort[start + i] = part2[cursor2];
                cursor2++;
            }
            else if(cursor2 == part2.length) {
                arrayToSort[start + i] = part1[cursor1];
                cursor1++;
            }
            else if(part1[cursor1] < part2[cursor2]) {
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
