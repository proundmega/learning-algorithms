package org.proundmega.cs.algorithms;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author thinkpad
 */
public class RandomSearch {
    
    public static int getPositionOfValueByRandom1(int[] searchArray, int value) {
        // cache of used values 
        Map<Integer, Boolean> valoresUsados = new HashMap<>();
        
        // preparation of random generator values
        Random random = new SecureRandom();
        do {
            // generate a random value and then store it
            int randomIndex = random.nextInt(searchArray.length);
            valoresUsados.put(randomIndex, Boolean.TRUE);
            
            // get the value of the random position
            int currentValue = searchArray[randomIndex];
            
            if(currentValue == value) {
                return randomIndex;
            }
            
        } while(valoresUsados.size() < searchArray.length);
        
        return -1;
    }
}
