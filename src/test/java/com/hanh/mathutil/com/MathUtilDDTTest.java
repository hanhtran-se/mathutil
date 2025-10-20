package com.hanh.mathutil.com;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;
// cách đẩ gen ra test case là nhấn chuột phải vào tên class MathUtil ->
class MathUtilDDTTest {
    // ta chẩn bị bộ data để riêng sau đó fill vào lệnh test
    // mang 2 chiều, gồm giá tr kì vọng | con n!

    public static Object[][] initTestData(){   // data là vùng chung nên phải dùng static để các hàm ờ mọi nơi có thể truy cập vào data
        // trả về 1 cái mảng 2 chiều
        // ={các phần tử mảng cách nahu dấu , }
        // {5, 10, 15, 20}
        Object[][] dataSet = {  {5, 120},
                                {6, 720},
                                {4, 240},
                                {3, 6},
                                {2, 2},
                                {1, 1},
                                {0, 1}};
        return dataSet;
    }
    //@Test : code khi chưa có tham số hóa
    @ParameterizedTest
    @MethodSource("initTestData")  // lấy data từ trên
    public void testFactorialGivenRightArgRunsWell(int n, int expected){
        assertEquals(expected, MathUtil.getFactorial(n));
                    // value      ex
    }
}