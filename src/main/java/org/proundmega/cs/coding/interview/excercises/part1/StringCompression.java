package org.proundmega.cs.coding.interview.excercises.part1;

/**
 *
 * @author thinkpad
 */
public class StringCompression {
    
    public static String compress(String value) {
        StringBuilder builder = new StringBuilder();
        
        char[] characterValues = value.toCharArray();
        
        SimilarString similarString = new SimilarString(0, characterValues[0]);
        
        for(int i = 1; i < characterValues.length; i++) {
            final char currentValue = characterValues[i];
            if(!similarString.isEqualsToPreviousValue(currentValue)) {
                int distance = i - similarString.startPosition;
                builder.append(similarString.commonValue)
                        .append(distance);
                
                // recreate the SimilarString instance
                similarString = new SimilarString(i, currentValue);
            }
        }
        
        // when the loop ends, the final character must be processed, too
        int distance = value.length() - similarString.startPosition;
        builder.append(similarString.commonValue)
                .append(distance);
        
        
        String compressedValue = builder.toString();
        if(compressedValue.length() <  value.length()) {
            return compressedValue;
        }
        else return value;
    }
    
    private static class SimilarString {
        private int startPosition;
        private char commonValue;
        
        public SimilarString(int startPosition, char commonValue) {
            this.startPosition = startPosition;
            this.commonValue = commonValue;
        }
        
        public boolean isEqualsToPreviousValue(char value) {
            return commonValue == value;
        }
    }
}
