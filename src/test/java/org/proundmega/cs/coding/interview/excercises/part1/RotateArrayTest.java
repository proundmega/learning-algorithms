package org.proundmega.cs.coding.interview.excercises.part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thinkpad
 */
public class RotateArrayTest {
    
    public RotateArrayTest() {
    }

    /**
     * Test of rotateMatrixLeft method, of class RotateArray.
     */
    @Test
    public void testRotateMatrixLeft() {
        int[][] matrixes = {
            {1, 2, 3, 4, 5}
            , {6, 7, 8, 9, 10}
            , {11, 12, 13, 14, 15}
            , {16, 17, 18, 19, 20}
            , {21, 22, 23, 24, 25}
        };
        
        int[][] expected = {
              {1, 6, 11, 16, 21}
            , {2, 7, 12, 17, 22}
            , {3, 8, 13, 18, 23}
            , {4, 9, 14, 19, 24}
            , {5, 10, 15, 20, 25}
        };
        
        int[][] actual = RotateArray.rotateMatrixLeft(matrixes);
        assertArrayEquals(expected, actual);
    }
    
}
