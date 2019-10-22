package org.proundmega.cs.coding.interview.excercises.part1;

public class URLify {
    
    private static final String URL_REPLACE = "%20";
    
    private static final int URL_REPLACE_LENGHT = URL_REPLACE.length();
    
    public static String toUrl(String text) {
        return String.valueOf(toUrlAsChar(text.toCharArray()));
    }
    
    private static char[] toUrlAsChar(char[] textArray) {
        // first I count the spaces inside the textArray
        int spaceCounter = 0;
        for(int i = 0; i < textArray.length; i++) {
            char value = textArray[i];
            if(value == ' ') {
                spaceCounter++;
            }
        }
        
        // now I calculate the extra space and create a new array with the nessesary extra space.
        int finalExtraSpace = (URL_REPLACE_LENGHT - 1) * spaceCounter;
        char[] finalText = new char[textArray.length + finalExtraSpace];
        
        copyArrayWithUrlify(textArray, finalText);
        return finalText;
    }

    private static void copyArrayWithUrlify(char[] textArray, char[] finalText) {
        // finally time to copy/paste the old array
        char[] urlValues = URL_REPLACE.toCharArray();
        int pointerFinalText = 0;
        for(int i = 0; i < textArray.length; i++) {
            char value = textArray[i];
            if(value == ' ') {
                for(int current = 0; current < URL_REPLACE_LENGHT; current++) {
                    finalText[pointerFinalText] = urlValues[current];
                    pointerFinalText++;
                }
            }
            else {
                finalText[pointerFinalText] = value;
                pointerFinalText++;
            }
        }
    }
}
