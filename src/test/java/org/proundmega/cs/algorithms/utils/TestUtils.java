package org.proundmega.cs.algorithms.utils;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author thinkpad
 */
public class TestUtils {
    
    
    public  static void testSortFunction(final int arrayLength, Consumer<int[]> consumer) {
        int[] arrayToSort = generateRandomIntegerArray(arrayLength);
        int[] expectedArray = new int[arrayLength];
        System.arraycopy(arrayToSort, 0, expectedArray, 0, arrayLength);
        
        consumer.accept(arrayToSort);
        Arrays.sort(expectedArray);
        
        System.out.println("Expected: " + Arrays.toString(expectedArray));
        System.out.println("Actual: " + Arrays.toString(arrayToSort));
        assertArrayEquals(expectedArray, arrayToSort);
    }
    
    public static int[] generateRandomIntegerArray(int length) {
        Random random = new SecureRandom();
        int[] arrayToSort = new int[length];
        for(int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = random.nextInt(1000);
        }
        return arrayToSort;
    }
    
    public static void testBinarySearch(int length, IntBinarySearch function) {
        int[] randomArray = TestUtils.generateRandomIntegerArray(length);
        Random random = new SecureRandom();
        int randomExpectedPosition = random.nextInt(length);
        int searchValue = randomArray[randomExpectedPosition];
        
        Arrays.sort(randomArray);
        
        int expected = Arrays.binarySearch(randomArray, searchValue);
        int actual = function.find(randomArray, searchValue);
        assertEquals(expected, actual);
    }
}
