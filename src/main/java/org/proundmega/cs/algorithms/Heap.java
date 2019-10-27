package org.proundmega.cs.algorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author VOlivares
 */
public class Heap<T extends Comparable<T>> {
    private T[] values;
    private int heapLength;
    private Comparator<T> providedComparator;
    
    private Class<T> clase;
    
    public Heap(Class<T> clase) {
        this.clase = clase;
        heapLength = 0;
    }
    
    public Heap(T[] values, Class<T> clase) {
        this(clase);
        this.values = values;
        this.heapLength = values.length;
        
        int middle = values.length / 2;
        for(int i = middle; i >= 0; i--) {
            maxHeapify(i);
        }
    }
    
    public Heap(Comparator<T> comparator, Class<T> clase) {
        this(clase);
        this.providedComparator = comparator;
    }
    
    private void maxHeapify(int index) {
        int left = getLeft(index);
        int rigth = getRigth(index);
        
        int largest = index;
        if(left < heapLength && compareTo(getElement(left), getElement(index)) > 0) {
            largest = left;
        }
        if(rigth < heapLength && compareTo(getElement(rigth), getElement(largest)) > 0) {
            largest = rigth;
        }
        if(largest != index) {
            T largestValue = getElement(largest);
            T currentValue = getElement(index);
            
            values[index]   = largestValue;
            values[largest] = currentValue;
            
            maxHeapify(largest);
        }
    }
    
    private T getElement(int position) {
        return values[position];
    }
    
    private int getParent(int position) {
        return position/2;
    }
    
    private int getLeft(int position) {
        return 2 * position;
    }
    
    private int getRigth(int position) {
        return 2 * position + 1;
    }
    
    private int compareTo(T a, T b) {
        if(providedComparator == null) {
            return a.compareTo(b);
        }
        else throw new UnsupportedOperationException("Still implementing...");
    }
    
    public T getTopElement() {
        return values[0];
    }
    
    public T getAndRemoveTopElement() {
        if(heapLength < 1) {
            throw new IllegalArgumentException("No hay elementos por remover");
        }
        T valorMaximo = values[0];
        int lastValue = heapLength - 1;
        swap(0, lastValue);
        values[lastValue] = null;
        heapLength--;
        maxHeapify(0);
        
        return valorMaximo;
    }
    
    private void swap(int a, int b) {
        T firstElement = values[a];
        T secondElement = values[b];
        
        values[a] = secondElement;
        values[b] = firstElement;
    }
    
    public void addElement(T element) {
        ensureSpace();
        values[heapLength] = element;
        int i = heapLength;
        heapLength++;
        
        int parent = getParent(i);
        while(i > 0 && compareTo(values[i], values[parent]) > 0) {
            swap(i, parent);
            
            i = parent;
            parent = getParent(i);
        }
    }
    
    private void ensureSpace() {
        if(values.length == heapLength) {
            values = Arrays.copyOf(values, values.length * 2);
        }
    }
    
    public static <T extends Comparable<T>> void sort(T[] array, Class<T> clase) {
        Heap<T> heap = new Heap<>(array, clase);
        for(int i = heap.values.length - 1; i >= 1; i--) {
            heap.swap(i, 0);
            heap.heapLength--;
            heap.maxHeapify(0);
        }
    }

    @Override
    public String toString() {
        return "Heap{" + "values=" + Arrays.toString(values) + ", heapLength=" + heapLength + ", providedComparator=" + providedComparator + ", clase=" + clase + '}';
    }
}
