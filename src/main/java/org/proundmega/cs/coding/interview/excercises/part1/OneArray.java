package org.proundmega.cs.coding.interview.excercises.part1;

/**
 *
 * @author thinkpad
 */
public class OneArray {
    
    /** This algorithm searches if a base string is equal to another string
     *  by applying an edit in the base String. This algorithm runs in O(max(a, b))
     *  where:
     *  
     *  + a = baseString length
     *  + b = newString length
     * 
     * @param baseValue the base string to test
     * @param newValue the new string expected to be derived from the base string
     * @return true if you require only an edit (insert, update, delete) on the base string
     *         and you end up with the newString, false otherwise.
     */
    public static boolean isOneEditDifference(String baseValue, String newValue) {
        return isMultpleEditOfDifference(baseValue, newValue, 1);
    }

    public static boolean isMultpleEditOfDifference(String baseValue, String newValue, int numberOfEdits) {
        final int baseLength = baseValue.length();
        final int newLength = newValue.length();
        
        // is the string equals? return true
        if(baseValue.equals(newValue)) {
            return true;
        }
        // now it is time to check if the branch to take is an insert, delete or update
        // insert: newValue is longer than baseValue
        else if(baseLength + numberOfEdits == newLength) {
            return isInsert(baseValue, newValue, numberOfEdits);
        }
        // update: same length
        else if(baseLength == newLength) {
            return isUpdate(baseValue, newValue, numberOfEdits);
        }
        // delete: newValue is shorter than newValue
        else if(baseLength - numberOfEdits == newLength) {
            return isDelete(baseValue, newValue, numberOfEdits);
        }
        else return false;
    }
    
    private static boolean isInsert(String baseValue, String newValue, int numberOfEdits) {
        return isShorterEqualThan(baseValue, newValue, numberOfEdits);
    }

    private static boolean isShorterEqualThan(String shortValue, String longValue, int numberOfEdits) {
        /** If this is an insert, just one value is different, but it has to be located
         *  as the fist non-equal value. If there are more than one, this violates the principle
         *  and return false
         */
        
        char[] shorterString = shortValue.toCharArray();
        char[] longerString = longValue.toCharArray();
        
        int remainigDifferentValues = numberOfEdits;
        int currentShorterPosition = 0;
        
        for(int i = 0; i < longerString.length; i++) {
            if(shorterString.length == i) return true;
            
            if(shorterString[currentShorterPosition] != longerString[i]) {
                remainigDifferentValues--;
            }
            else {
                currentShorterPosition++;
            }
            
            // time to check if there are remainig errors
            if(remainigDifferentValues < 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isUpdate(String baseValue, String newValue, int numberOfEdits) {
        /** If this is an update, then it means that 
         *  they should be but in one value
         */
        int remainigDifferentValues = numberOfEdits;
        
        char[] firstString = baseValue.toCharArray();
        char[] secondString = newValue.toCharArray();
        for(int i = 0; i < firstString.length; i++) {
            if(firstString[i] != secondString[i]) {
                remainigDifferentValues--;
            }
            
            if(remainigDifferentValues < 0) {
                return false;
            }
        }
        
        return true;
    }

    private static boolean isDelete(String baseValue, String newValue, int numberOfEdits) {
        return isShorterEqualThan(newValue, baseValue, numberOfEdits);
    }

}
