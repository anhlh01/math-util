/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhlh.mathutil.core;

/**
 *
 * @author HP
 */
//Class nay cung cap cac tien ich/ do choi/ 1 loat cac ham toan hoc 
//giup cho cac class khac su dung..., vi du app Calculator can
//rat nhieu ham toan hoc
//Cai gi ma tien ich dung chung, sure no nen duoc la STATIC
public class MathUtil {

    //ham tinh n giai thua n! = 1.2.3...n
    //khong co giai thua so am
    //0! = 1 = 1 quy uoc
    //giai thua tang rat nhanh, 20! vua du cho long, 18 con so 0
    //21 vuot long vuot 18 so 0, tran vung luu tru 
    //chan viec n < 0 hoac n > 21
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument."
                    + " n must be between 0...20");
        if (n == 0 || n == 1)
            return 1;
        //song sot den day, sure n = 2...20
        long product = 10; //ket qua trung gian
        for (int i = 2; i <= n; i++) 
            product *= i;
        return product;
    }
}
