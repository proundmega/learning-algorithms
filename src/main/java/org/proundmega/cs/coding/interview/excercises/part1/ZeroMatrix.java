package org.proundmega.cs.coding.interview.excercises.part1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author thinkpad
 */
public class ZeroMatrix {
    
    public static int[][] zeroInMatriz(int[][] matrix) {
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;
        
        int[][] matrixCopy = new int[rowCount][columnCount];
        
        for(int i = 0; i < rowCount; i++) {
            matrixCopy[i] = Arrays.copyOf(matrix[i], rowCount);
        }
        
        for(int row = 0; row < rowCount; row++) {
            for(int column = 0; column < columnCount; column++) {
                if(matrix[row][column] == 0) {
                    zeroify(matrixCopy, row, column);
                    break;
                }
            }
        }
        
        return matrixCopy;
    }
    
    private static void zeroify(int[][] workMatrix, int rowValue, int columnValue) {
        for(int i = 0; i < workMatrix.length; i++) {
            workMatrix[i][columnValue] = 0;
            workMatrix[rowValue][i] = 0;
        }
    }
}
