package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

import java.io.IOException;

public class Solution {
    public static int A = 0;

    static {

        if(A == 0) throw new RuntimeException();
        }


    public static int B = 5;

    public static void main(String[] args) throws RuntimeException{
        System.out.println(B);
    }
}
