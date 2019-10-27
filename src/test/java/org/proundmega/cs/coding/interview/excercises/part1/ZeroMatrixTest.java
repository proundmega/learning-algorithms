package org.proundmega.cs.coding.interview.excercises.part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thinkpad
 */
public class ZeroMatrixTest {
    
    public ZeroMatrixTest() {
    }

    /**
     * Test of zeroInMatriz method, of class ZeroMatrix.
     */
    @Test
    public void testZeroInMatriz() {
        int[][] matrixes = {
            {1, 2, 3, 4, 5}
            , {6, 7, 0, 9, 10}
            , {11, 12, 13, 14, 15}
            , {16, 17, 18, 19, 20}
            , {21, 22, 23, 24, 25}
        };
        
        int[][] expected = {
            {1, 2, 0, 4, 5}
            , {0, 0, 0, 0, 0}
            , {11, 12, 0, 14, 15}
            , {16, 17, 0, 19, 20}
            , {21, 22, 0, 24, 25}
        };
        
        int[][] actual = ZeroMatrix.zeroInMatriz(matrixes);
        for(int i = 0; i < matrixes.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }
    
}
