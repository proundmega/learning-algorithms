package org.proundmega.cs.coding.interview.excercises.part3;

/**
 *
 * @author VOlivares
 */
public interface Stack<T> {
    T pop();
    void push(T value);
    T peep();
    boolean isEmpty();
}
