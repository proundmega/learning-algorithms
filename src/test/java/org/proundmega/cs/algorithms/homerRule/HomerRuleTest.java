package org.proundmega.cs.algorithms.homerRule;

import org.proundmega.cs.algorithms.homerRule.HomerRule;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.proundmega.cs.algorithms.homerRule.HomerNode;

/**
 *
 * @author thinkpad
 */
public class HomerRuleTest {
    
    public HomerRuleTest() {
    }

    /**
     * Test of calculate method, of class HomerRule.
     */
    @Test
    public void testCalculate() {
        HomerNode x0 = new HomerNode(9, null);
        HomerNode x1 = new HomerNode(7, x0);
        HomerNode x2 = new HomerNode(5, x1);
        HomerNode x3 = new HomerNode(3, x2);
        HomerNode x4 = new HomerNode(1, x3);
        
        HomerRule rule = new HomerRule(x4);
        
        double x = 2;
        double expected = 83;
        double actual = rule.calculate(x);
        assertEquals(expected, actual, 0.01);
    }
    
}
