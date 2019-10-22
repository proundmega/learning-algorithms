/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.coding.interview.excercises.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author thinkpad
 */
public class StringCounter {

    private Map<Character, Integer> counting = new HashMap<>();

    public StringCounter(String stringToCount) {
        char[] values = stringToCount.toCharArray();
        for (int i = 0; i < values.length; i++) {
            final char value = values[i];
            if (!counting.containsKey(value)) {
                counting.put(value, 1);
            } else {
                int count = counting.get(value);
                count++;
                counting.put(value, count);
            }
        }
    }

    public Map<Character, Integer> getCounting() {
        return counting;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.counting);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StringCounter other = (StringCounter) obj;
        if (!Objects.equals(this.counting, other.counting)) {
            return false;
        }
        return true;
    }
}
