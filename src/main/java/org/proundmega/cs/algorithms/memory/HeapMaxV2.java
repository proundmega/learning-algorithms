package org.proundmega.cs.algorithms.memory;

/**
 *
 * @author VOlivares
 */
public class HeapMaxV2<T extends Comparable<T>> {
    private T[] values;
    private Class<T> clase;
    private int heapLength;

    public HeapMaxV2(T[] values, Class<T> clase) {
        this.values = values;
        this.clase = clase;
        this.heapLength = values.length;
        
        buildHeap();
    }
    
    private void buildHeap() {
        for(int i = values.length / 2; i >= 0; i--) {
            heapify(i);
        }
    }
    
    private void heapify(int index) {
        int left = getLeft(index);
        int rigth = getRigth(index);
        int largest = index;
        if(left < heapLength && compareTo(values[left], values[largest]) > 0) {
            largest = left;
        }
        if(rigth < heapLength && compareTo(values[rigth], values[largest]) > 0) {
            largest = rigth;
        }
        
        if(largest != index) {
            swapPosition(index, largest);
            heapify(largest);
        }
    }
    
    private int compareTo(T a, T b) {
        return a.compareTo(b);
    }
    
    private void swapPosition(int a, int b) {
        T firstValue = values[a];
        T secondValue = values[b];
        
        values[a] = secondValue;
        values[b] = firstValue;
    }
    
    public T getFirstElement() {
        return values[0];
    }
    
    private int getLeft(int index) {
        return 2 * index;
    }
    
    private int getRigth(int index) {
        return getLeft(index) + 1;
    }
    
    public static <T extends Comparable<T>> void sort(T[] values, Class<T> clase) {
        HeapMaxV2<T> heap = new HeapMaxV2<>(values, clase);
        for(int i = values.length - 1; i >= 1; i--) {
            heap.swapPosition(i, 0);
            
            heap.heapLength--;
            heap.heapify(0);
        }
    }
}
