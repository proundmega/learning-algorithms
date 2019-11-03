package org.proundmega.cs.coding.interview.excercises.part2;

import lombok.AllArgsConstructor;
import lombok.Value;

/**
 *
 * @author thinkpad
 */
@Value
@AllArgsConstructor
public class Tuple<A, B> {
    private A first;
    private B second;
}
