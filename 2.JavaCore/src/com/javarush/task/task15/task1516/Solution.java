package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

import java.io.IOException;

public  class Solution {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    static {
        int intVar = 15;
        double doubleVar = 15.6;
        Double DoubleVar = 17.8;
        boolean booleanVar = true;
        Object ObjectVar = new Object();
        Exception ExceptionVar = new IOException();
        String StringVar = "String";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.intVar);
        System.out.println(solution.doubleVar);
        System.out.println(solution.DoubleVar);
        System.out.println(solution.booleanVar);
        System.out.println(solution.ObjectVar);
        System.out.println(solution.ExceptionVar);
        System.out.println(solution.StringVar);
    }
}
