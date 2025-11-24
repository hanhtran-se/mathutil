package com.hanh.mathutil.com;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilDDTTest {


    public static Object[][] initTestData(){
        Object[][] dataSet = {  {5, 120},
                                {6, 720},
                                {4, 24},
                                {3, 6},
                                {2, 2},
                                {1, 1},
                                {0, 1} };
        return dataSet;
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgRunsWell(int n, int expected){
        assertEquals(expected, MathUtil.getFactorial(n));

    }
}