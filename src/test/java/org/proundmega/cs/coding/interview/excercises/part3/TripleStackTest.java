package org.proundmega.cs.coding.interview.excercises.part3;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VOlivares
 */
public class TripleStackTest {
    
    public TripleStackTest() {
    }

    @Test
    public void testFirstStack() {
        TripleStack<Integer> tripleStack = new TripleStack<>(Integer.class);
        List<Stack<Integer>> stacks = tripleStack.getStacks();
        Stack<Integer> currentStack = stacks.get(0);
        
        currentStack.push(1);
        currentStack.push(5);
        currentStack.push(9);
        
        assertEquals(9, currentStack.pop().intValue());
        assertEquals(5, currentStack.pop().intValue());
        assertEquals(1, currentStack.pop().intValue());
    }
    
    @Test
    public void testFirstStackAddAndRemove() {
        TripleStack<Integer> tripleStack = new TripleStack<>(Integer.class);
        List<Stack<Integer>> stacks = tripleStack.getStacks();
        Stack<Integer> currentStack = stacks.get(0);
        
        currentStack.push(1);
        currentStack.pop();
        currentStack.push(30);
        
        assertEquals(30, currentStack.pop().intValue());
    }
    
    @Test
    public void testAllStacks() {
        TripleStack<Integer> tripleStack = new TripleStack<>(Integer.class);
        List<Stack<Integer>> stacks = tripleStack.getStacks();
        
        for(int i = 0; i < 30; i++) {
            Stack<Integer> currentStack = stacks.get(i%3);
            currentStack.push(i);
        }
        
        for(int i = 30 - 1; i > 0; i--) {
            Stack<Integer> currentStack = stacks.get(i%3);
            assertEquals(i, currentStack.pop().intValue());
        }
    }
}
