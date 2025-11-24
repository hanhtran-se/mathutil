package com.hanh.mathutil.com;

public class MathUtil {

    // viết ham theo phong cach đệ quy
    // 5! = 1.2.3.4.5 = 4! . 5
    // 4! = 4 . 3!
    // 3! = 1 . 2!
    // 2! = 2 . 1!
    // 1! = 1
    //  return
    public static long getFactorial(int n){
        if(n < 0 || n > 20){

            throw new IllegalArgumentException("n must be between 0 and 20");
        }
       if(n == 0 || n == 1){
           return 1;
       }
        return n * getFactorial(n-1);

    }
}
