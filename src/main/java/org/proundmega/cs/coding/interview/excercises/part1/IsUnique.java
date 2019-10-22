/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.coding.interview.excercises.part1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author thinkpad
 */
public class IsUnique {
    
    public static boolean isUniqueWithMap(String chain) {
        Map<Character, Boolean> countOfChain = new HashMap<>();
        char[] values = chain.toCharArray();
        for(int i = 0; i < values.length; i++) {
            char currentValue = values[i];
            if(!countOfChain.containsKey(currentValue)) {
                countOfChain.put(currentValue, Boolean.TRUE);
            }
            else return false;
        }
        
        return true;
    }
    
    public static boolean isUniqueNoStructs(String chain) {
        char[] values =  chain.toCharArray();
        Arrays.sort(values);
        for(int i = 1; i < values.length; i++) {
            char prevValue = values[i - 1];
            char currentValue = values[i];
            if(currentValue == prevValue) {
                return false;
            }
        }
        return true;
    }
}
