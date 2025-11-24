package com.hanh.mathutil.com.test;

import com.hanh.mathutil.com.MathUtil;
import org.junit.jupiter.api.Test;

import static com.hanh.mathutil.com.MathUtil.*;

import static org.junit.jupiter.api.Assertions.*;
// TDD l kỹ thuật viết code và test code xong xong

class MathUtilTest {
    @Test
    public void testFactorialGivenRightArg5RunsWell(){

        assertEquals(120, getFactorial(5));
    }

    @Test
    public void testFactorialGivenRightArg4RunsWell(){

        assertEquals(24, getFactorial(4));
    }


    @Test
    // test case #1: Check/Verify getFactorial() method with valid parameter, e.g. n = 0

    // Steps/ procedure:
    // 1. Given a valid n,  e.g. n = 0
    // 2. call.invoke getFactorial(n=0)
    // 3. execute
    // EXPECTED RESULT:
    // The expected value will return 1 as the result of 0!
    // STATUS (PASSED | FAIL)
    public void testFactorialGivenRightArg0RunsWell(){
        int n = 0;
        long expectedValue = 1;

        long actualValue = getFactorial(n);
            assertEquals(expectedValue, actualValue);
        assertEquals(1, getFactorial(0));

    }
}