/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.algorithms.homerRule;

/**
 *
 * @author thinkpad
 */
public class HomerNode {
    private double constant;
    private HomerNode nextNode;

    public HomerNode(double constant, HomerNode nextNode) {
        this.constant = constant;
        this.nextNode = nextNode;
    }

    public double getConstant() {
        return constant;
    }

    public HomerNode getNextNode() {
        return nextNode;
    }

    @Override
    public String toString() {
        return "HomerNode{" + "constant=" + constant + ", nextNode=" + nextNode + '}';
    }
    
}
