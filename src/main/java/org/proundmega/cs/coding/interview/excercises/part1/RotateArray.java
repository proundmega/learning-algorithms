package org.proundmega.cs.coding.interview.excercises.part1;

/**
 *
 * @author thinkpad
 */
public class RotateArray {
    
    public static int[][] rotateMatrixLeft(int[][] matrix) {
        int[][] newValues = new int[matrix.length][matrix.length];
        
        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix.length; column++) {
                newValues[column][row] = matrix[row][column];
            }
        }
        
        return newValues;
    }
}
