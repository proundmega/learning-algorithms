package org.proundmega.cs.coding.interview.excercises.part1;

import org.proundmega.cs.coding.interview.excercises.util.StringCounter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 *
 * @author thinkpad
 */
public class StringPermutation {
    
    public static boolean isPermutationOf(String base, String test) {
        StringCounter baseCounter = new StringCounter(base);
        StringCounter otherCounter = new StringCounter(test);
        return baseCounter.equals(otherCounter);
    }
    
    
}
