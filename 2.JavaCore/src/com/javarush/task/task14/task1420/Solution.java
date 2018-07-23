package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String str1 = reader.readLine();
        String str2 = reader.readLine();
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        a = makePositive(a);
        b = makePositive(b);
        System.out.println(gcd_1(a, b));
    }

    public static int gcd_1(int a, int b) {
        if (b == 0)
            return a;
        return gcd_1(b, a % b);
    }

    public static int makePositive (int a) throws Exception {
        if (a<=0){ throw new Exception();
        } return a;
    }
}
