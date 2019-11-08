package org.proundmega.cs.coding.interview.excercises.part3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author VOlivares
 */
public class TripleStack<T> {
    private static final int INITIAL_VALUE = 66;
    private static final int STACK_COUNT = 3;
    
    private Class<T> clase;
    private T[] values;
    private int[] currentLength = new int[STACK_COUNT];
    private Map<Integer, Stack<T>> currentStacks = new HashMap<>();

    public TripleStack(Class<T> clase) {
        this.clase = clase;
        this.values = (T[]) Array.newInstance(clase, INITIAL_VALUE);
        
        // time to create the 3 stacks
        for(int i = 0; i < STACK_COUNT; i++) {
            currentStacks.put(i, new ArrayStack(i, STACK_COUNT));
        }
    }
    
    public List<Stack<T>> getStacks() {
        return new ArrayList<>(currentStacks.values());
    }
    
    private class ArrayStack implements Stack<T> {
        private final int offset;
        private final int distance;
        private int count = 0;
        private int currentPosition;

        public ArrayStack(int offset, int distance) {
            this.offset = offset;
            this.distance = distance;
            this.currentPosition = offset;
        }
        
        @Override
        public T pop() {
            if(isEmpty()) {
                throw new EmptyStackException("This stack is empty!");
            }
            
            T value = values[currentPosition - distance];
            values[currentPosition - distance] = null;    
            
            currentPosition -= distance;
            count--;
            if(currentPosition < 0) {
                currentPosition = offset;
            }

            return value;
        }

        @Override
        public void push(T value) {
            values[currentPosition] = value;
            count++;
            currentPosition = currentPosition + distance;
        }

        @Override
        public T peep() {
            if(isEmpty()) {
                throw new EmptyStackException("This stack is empty!");
            }
            
            return values[currentPosition - distance];
        }

        @Override
        public boolean isEmpty() {
            return count == 0;
        }
    }
}
