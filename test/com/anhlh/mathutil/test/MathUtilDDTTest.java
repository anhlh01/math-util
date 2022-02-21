/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhlh.mathutil.test;

import static com.anhlh.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author HP
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //ta can test thu ham getF() ben code chinh chay dung khong
    //ro rang ta phai dua data cho ham, xem no tra ve gi
    //so sanh ket luan dung sai
    //3 viec: chuan bi data, dua data vao ham (goi ham)
    //         ket luan dung sai
    //done o ben MathUtilTest roi, NHUNG
    
    //0!, 0 -> 1
    //1!, 1 -> 1
    //2!, 2 -> 2            bo du lieu test, test data
    //3!, 3 -> 6            luu table SQLServer, Excel, .CSV (commard separate)
    //4!, 2 -> 24           luu trong mot mang trong code cung duoc
    //mang 2 chieu [7][2]
    
    
    
    //hoc cach viet code tach dam data ra khoi cau lenh
    //getF(), khong mixed. Tat ca cac framework UnitTest
    //cua moi NNLT deu lam duoc dieu nay!!!
    
    //ham tra ve mang 2 chieu kieu Object
    //vi cac framework choi voi object thoi, mang so nguyen
    //phai hieu la Object, tuc laf Wrapper Class neu mang 
    //so ....
    //Wrapper class: Integer (int), Long (long), Character (char)
    
    //bao JVM JUnit day la data nguon!! dung vao assert()
    @Parameterized.Parameters
    public static Object[][] initData() {
        
        
        return new Integer[][]{
                                    {0, 1},
                                    {1, 1},
                                    {2, 2},
                                    {3, 6},
                                    {6, 720}
                              };
    }
    
    //can trich data tung mang con ra tu mang lon de duoc cap value input/expected
    @Parameterized.Parameter(value = 0) //map cot 0
    public int input;
    
    @Parameterized.Parameter(value = 1) //map cot 1
    public int expected;
    
    @Test
    public void  testFactorialGivenValidArgumentReturnsWell() {
        
        //long actual = getFactorial(input);
        
        assertEquals(expected, getFactorial(input));
    }
}

//DDT tach data test ra mot cho, sau do lay tung mieng data
//anh xa vao trong cho goi ham, cho assert()
//tach va nhoi vao -> lam hoai cho cac bo data
//phai thong qua ten bien/ tham so
//DDT con duoc goi la: THAM SO HOA TEST DATA PARAMETERRIZED


