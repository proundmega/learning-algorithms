package org.proundmega.cs.algorithms.memory;

import java.util.Arrays;

/**
 *
 * @author VOlivares
 */
public class HeapMaxV1<T extends Comparable<T>> {
    private T[] values;
    private Class<T> clase;

    public HeapMaxV1(T[] values, Class<T> clase) {
        this.values = values;
        this.clase = clase;
        
        int half = values.length / 2;
        for(int i = half; i >= 0; i--) {
            maxHeapify(i);
        }
    }
    
    private void maxHeapify(int index) {
        int left = getLeft(index);
        int rigth = getRigth(index);
        int largest = index;
        
        if(left < values.length && compareTo(values[left], values[largest]) > 0) {
            largest = left;
        }
        if(rigth < values.length && compareTo(values[rigth], values[largest]) > 0) {
            largest = rigth;
        }
        if(largest != index) {
            T currentValue = values[index];
            T maxinumValue = values[largest];
            values[index] = maxinumValue;
            values[largest] = currentValue;
            
            maxHeapify(largest);
        }
    }
    
    private int getLeft(int index) {
        return index * 2;
    }
    
    private int getRigth(int index) {
        return getLeft(index) + 1;
    }
    
    private int compareTo(T a, T b) {
        return a.compareTo(b);
    }
    
    public T getFirstElement() {
        return values[0];
    }

    @Override
    public String toString() {
        return "HeapMaxV1{" + "values=" + Arrays.toString(values) + ", clase=" + clase + '}';
    }
    
    
}
