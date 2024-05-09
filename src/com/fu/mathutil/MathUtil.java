/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author ASUS
 */
public class MathUtil {
    
    //n! = 1 x 2 x 3 x 4 x .... x n
    //Quy ước: 0! = 1! = 1
    //Ko tính giai thừa số âm
    //20! là vừa khớp kiểu long
    //21! là quá kiểu long
    //nếu đưa vào âm hay 21!, ta ko tính, ta đập vào mặt ai sử dụng hàm 1 cái exception
    
    public static long getFactorial(int n){
        if(n < 0 || n > 21)
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
        if(n == 0 || n == 1)
            return 1; 
        
        long product = 1; // tích khởi đầu bằng 1
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
