/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhlh.mathutil.main;

import com.anhlh.mathutil.core.MathUtil;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
        //ta kiem thu bang cach goi ham, voi data dua vao, chay
        //va nhin ket qua cua ham tra ve (ACTUAL) so sanh
        //voi cai ta hi vong no tra ve (EXPECTED)
        //voi vi du 5! thi ta hi vong nhan ve expected = 120
        //              thuc th ham getFI(5) tra ve may actual = ?
        //chay moi biet
        //cuoi cung so sanh EXPECTED vs. ACTUAL

        //de dam bao ham dung, ta phai chia cac truong hop/ nghi ra
        //cac tinh huong ham se duoc xai, tuc la nghi ra cac bo data
        //dua cho ham, ham chay, output, ket luan
        //MOI BO DATA DUA VAO, MOI DATA CU THE DE TEST HAM CHO 1 MUC 
        //DICH NAO DO, TA GOI LA TEST CASE - TINH HUONG TEST
        //n = 5, goi ham getF() -> test case
        //n = -5, goi ham getF() -> test case
        
        //Test case #1: check getF() with valid argument
        //n = 0, expected = 1; actual: doan xem!!
        long expected = 1;
        long actual = MathUtil.getFactorial(0); //doan xem
        //compare
        System.out.println("0! -> expected: " + expected
                + "; actual: " + actual);
        
        //Test case #2: check getF() with valid argument
        //n = 6, expected = 720; actual: doan xem!!
        expected = 720;
        actual = MathUtil.getFactorial(6); 
        //compare
        System.out.println("6! -> expected: " + expected
                + "; actual: " + actual);
        
        //Test case #3: check getF() with invalid argument
        //n = -5, expected = ??? nem ra ngoai le
        //thay ngoai le mung roi nuoc mat
        //expected = Exception phai xh, khong la long
        System.out.println("check if an exception is thrown by using invalid arument");
        MathUtil.getFactorial(-6); 
        //nhin bang mat de tim ngoai le xuat hien
        //ngoai le xuat hien nhu ki vong phai mung
        //C:\Program Files\Java\jdk1.8.0_111\jre\bin
        //C:\Users\HP\Documents\SWT301\math-util\dist\math-util.jar
    }
}
