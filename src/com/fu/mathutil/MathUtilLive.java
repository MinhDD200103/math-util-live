/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author ASUS
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long rs = MathUtil.getFactorial(5);
        System.out.println("expected: 5! = 120; actual : " + rs);
        
        //Thêm code sau lần đầu tiên đưa code lên server 10:53
        System.out.println("expected: 3! = 6; actual : " + MathUtil.getFactorial(3));
        //MathUtil.getFactorial(-5);
    }
    
}
