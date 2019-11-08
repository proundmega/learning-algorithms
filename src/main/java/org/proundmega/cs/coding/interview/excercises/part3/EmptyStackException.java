package org.proundmega.cs.coding.interview.excercises.part3;

/**
 *
 * @author VOlivares
 */
public class EmptyStackException extends RuntimeException {

    public EmptyStackException(String message) {
        super(message);
    }

    public EmptyStackException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
