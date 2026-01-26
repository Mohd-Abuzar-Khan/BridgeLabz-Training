package com.testing.numberutility;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberUtilsTest {
    private NumberUtils numberUtils = new NumberUtils();
    
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testIsEven_EvenNumbers(int number) {
        assertTrue(numberUtils.isEven(number));
    }
    
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void testIsEven_OddNumbers(int number) {
        assertFalse(numberUtils.isEven(number));
    }
}
