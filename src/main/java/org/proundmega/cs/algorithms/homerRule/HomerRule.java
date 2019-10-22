package org.proundmega.cs.algorithms.homerRule;

/**
 *
 * @author thinkpad
 */
public class HomerRule {
    private HomerNode parentNode;
    
    public HomerRule(HomerNode parentNode) {
        this.parentNode = parentNode;
    }
    
    public double calculate(double instanceValue) {
        HomerNode curentNode = parentNode;
        double total = 0;
        while(curentNode != null) {
            total = total*instanceValue + curentNode.getConstant();
            curentNode = curentNode.getNextNode();
        }
        return total;
    }
    
}
