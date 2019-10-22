package org.proundmega.cs.algorithms.stock;

/**
 *
 * @author thinkpad
 */
public class StockInvestment {
   
    public DayRange calculateBestProfitNaive(int[] stockPrice) {
        DayRange currentBestRange = new DayRange(0, 0, 0);
        for(int start = 0; start < stockPrice.length; start++) {
            for(int end = start; end < stockPrice.length; end++) {
                DayRange rangeToTest = toDayRange(stockPrice, start, end);
                if(rangeToTest.isBetterInvestmentThan(currentBestRange)) {
                    currentBestRange = rangeToTest;
                }
            }
        }
        
        return currentBestRange;
    }
    
    private DayRange toDayRange(int[] stockPrice, int start, int end) {
        int sum = 0;
        for(int i = start; i <= end; i++) {
            sum += stockPrice[i];
        }
        
        return new DayRange(start, end, sum);
    }
    
    public DayRange calculateBestProfitLessNaive(int[] stockPrice) {
        DayRange currentBestRange = new DayRange(0, 0, 0);
        for(int start = 0; start < stockPrice.length; start++) {
            DayRange baseRange = new DayRange(start, start, stockPrice[start]);
            for(int end = start + 1; end < stockPrice.length; end++) {
                DayRange rangeToTest = baseRange.addValue(stockPrice[end]);
                if(rangeToTest.isBetterInvestmentThan(currentBestRange)) {
                    currentBestRange = rangeToTest;
                }
                baseRange = rangeToTest;
            }
        }
        
        return currentBestRange;
    }
    
    public DayRange calculateBestProfitOptimal(int[] stockPrice) {
        DayRange currentBestRange = getInitialBestRange(stockPrice);
        DayRange accumulator = new DayRange(0, 0, 0);
        
        for(int counter = 0; counter < 5; counter++) {
            // then I try to get the best sum but going backwards
            accumulator = currentBestRange;
            for(int start = currentBestRange.getStart(); start < currentBestRange.getEnd(); start++) {
                int currentValue = stockPrice[start];
                accumulator = accumulator.removeInitialValue(currentValue);
                if(accumulator.isBetterInvestmentThan(currentBestRange)) {
                    currentBestRange = accumulator;
                }
            }
            
            accumulator = currentBestRange;
            for(int end = currentBestRange.getEnd(); end > currentBestRange.getStart(); end--) {
                int currentValue = stockPrice[end];
                accumulator = accumulator.removeLastValue(currentValue);
                if(accumulator.isBetterInvestmentThan(currentBestRange)) {
                    currentBestRange = accumulator;
                }
            }
        }
        
        return currentBestRange;
    }
    
    private DayRange getInitialBestRange(int[] stockPrice) {
        int bestStartingDay = 0;
        for(int i = 0; i < stockPrice.length; i++) {
            if(stockPrice[i] > 0) {
                bestStartingDay = i;
                break;
            }
        }
        
        int bestLastDay = stockPrice.length - 1;
        for(int i = stockPrice.length - 1; i >=0; i--) {
            if(stockPrice[i] > 0) {
                bestLastDay = i;
                break;
            }
        }
        
        return new DayRange(bestStartingDay, bestLastDay, sumRange(bestStartingDay, bestLastDay, stockPrice));
    }
    
    private int sumRange(int start, int end, int[] values) {
        int sum = 0;
        for(int i = start; i <= end; i++) {
            sum += values[i];
        }
        
        return sum;
    }
}
