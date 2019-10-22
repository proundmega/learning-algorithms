package org.proundmega.cs.algorithms.stock;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thinkpad
 */
public class StockInvestmentTest {
    
    private static final int[] STOCK_PRICE = {
        13, -3, -25, 20, -3
            , -16, -23, 18, 20, -7
            , 12, -5, -22, 15, -4
            , 7
    };
    
    public StockInvestmentTest() {
    }

    /**
     * Test of calculateBestProfitNaive method, of class StockInvestment.
     */
    @Test
    public void testCalculateBestProfitNaive() {
        StockInvestment stock = new StockInvestment();
        DayRange expected =  new DayRange(7, 10, 43);
        DayRange actual = stock.calculateBestProfitNaive(STOCK_PRICE);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCalculateBestProfitBetterNaive() {
        StockInvestment stock = new StockInvestment();
        DayRange expected =  stock.calculateBestProfitNaive(STOCK_PRICE);
        DayRange actual = stock.calculateBestProfitLessNaive(STOCK_PRICE);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCalculateBestProfitOptimal() {
        StockInvestment stock = new StockInvestment();
        DayRange expected =  stock.calculateBestProfitNaive(STOCK_PRICE);
        DayRange actual = stock.calculateBestProfitOptimal(STOCK_PRICE);
        
        assertEquals(expected, actual);
    }
    
}
