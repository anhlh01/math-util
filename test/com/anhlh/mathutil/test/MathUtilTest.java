/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhlh.mathutil.test;

import static com.anhlh.mathutil.core.MathUtil.getFactorial;
import java.util.IllegalFormatException;
import org.junit.Test;
import static org.junit.Assert.*;

//neu muon xai cac ham static, co 2 cach
//1: goi tem class.ten ham static() truyen thong 100 nam nay
//   nho import package... ten class chua ham static

//2: khong can goi ten class cham, goi tem ham minhf len, giong
//   C nho import static package...ten class.ten ham static
//                                          .* thi goi tat ca voi nhieu ham


/**
 *
 * @author HP
 */
public class MathUtilTest {
    
    //test case #1: getF() with valid argument
    //n = 0, expected = 1; actual: doan xem!!
    @Test //bien 1 ham bat ki trong 1 class bat ki thanh main()
    public void  testFactorialGivenValidArgumentReturnsWell() {
        long exepcted = 1; //hi vong ham tra ve 1 neu tinh 0!
        long actual = getFactorial(0);
        
        assertEquals(exepcted, actual);
        //~~~ trong main() kieu cu, ta in ra ket qua expected va actual
        //mat tu nhin de coi 2 thang giong nhau 2 khong
        //ben JUnit, tung 2 mau: XANH: 2 dua giong nhau
        //                       DO: 2 dua khong giong nhau
    }
    
    //test case #2: getF() with valid argument
    //n = 6, expected = 720; actual: doan xem!!
    
    @Test
    public void  testFactorialGivenValidArgumentN6ReturnsWell() {
        long exepcted = 720; //hi vong ham tra ve 720 neu tinh 6!
        long actual = getFactorial(6);
        
        assertEquals(exepcted, actual);
    }
    
    //TEST NGOAI LE
    //NHO LA: NGOAI LE KHONG PHAI LA 1 VALUE
    //NGOAI LE LA 1 TINH HUONG, THU GI DO BAT THUONG, CO KHA NANG XAY RA
    //KHONG LA VALUE DE SO SANH KIEU assertEquals()
    //ngoai le khong dung ham assertEquals()
    //chi do luong = cach coi m co xuat hien hay khong???
    //test case #3: getF() with invalid argument
    //n = -5, expected = ngoai le phai xuat hien; actual: doan xem!!
    @Test (expected = IllegalArgumentException.class)
    public void  testFactorialGivenInvalidArgumentThrowsException() {
        
        getFactorial(-5);
    }
}
