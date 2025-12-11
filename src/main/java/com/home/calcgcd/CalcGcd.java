/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.home.calcgcd;
import java.io.*;
/**
 *
 * @author PC
 */
public class CalcGcd 
{
    public static void main(String[] args) throws Exception
    {
        var bufStdIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input The First Integer number:");
        var strNum = bufStdIn.readLine();
        var iNum1 = Long.parseLong(strNum);
        System.out.println("Input The Second Integer number:");
        strNum = bufStdIn.readLine();
        var iNum2 = Long.parseLong(strNum);
        var iVal1 = Math.abs(iNum1);
        var iVal2 = Math.abs(iNum2);
        if(iVal1 > 0 && iVal2 > 0)
        {
            while(iVal1 != iVal2)
            {
                if(iVal1 > iVal2)
                    iVal1 -= iVal2;
                else
                    iVal2 -= iVal1;
            }
            var nGcd = iVal1;
            System.out.printf("The Gcd of the numbers %d and %d is %d\r\n",iNum1,iNum2,nGcd);
        }
        else
        {
            System.out.println("The numbers must not be equal 0");
        }
    }
}
