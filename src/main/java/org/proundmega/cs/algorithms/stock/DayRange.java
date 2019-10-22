/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proundmega.cs.algorithms.stock;

/**
 *
 * @author thinkpad
 */
public class DayRange {
    private int start;
    private int end;
    private int sum;

    public DayRange(int start, int end, int sum) {
        this.start = start;
        this.end = end;
        this.sum = sum;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "DayRange{" + "start=" + start + ", end=" + end + ", sum=" + sum + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.start;
        hash = 89 * hash + this.end;
        hash = 89 * hash + this.sum;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DayRange other = (DayRange) obj;
        if (this.start != other.start) {
            return false;
        }
        if (this.end != other.end) {
            return false;
        }
        if (this.sum != other.sum) {
            return false;
        }
        return true;
    }

    public boolean isBetterInvestmentThan(DayRange currentBestRange) {
        return this.sum > currentBestRange.sum;
    }
    
    public boolean isBetterInvestmentRange(DayRange currentBestRange) {
        int myRange = end - start;
        int otherRange = currentBestRange.end - currentBestRange.start;
        return currentBestRange.sum > 0 && otherRange > myRange;
    }
    
    public DayRange addValue(int i) {
        int newEnd = end + 1;
        return new DayRange(start, newEnd, sum + i);
    }
    
    public DayRange removeInitialValue(int value) {
        int newStart = start + 1;
        return new DayRange(newStart, end, sum - value);
    }
    
    public DayRange removeLastValue(int value) {
        int newEnd = end - 1;
        return new DayRange(start, newEnd, sum - value);
    }
}
