package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }

    public static Flyable result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(str.equals("helicopter")){
            result = new Helicopter();
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(str.equals("plane")){
            int num =0;
            try {
                num = Integer.parseInt(reader.readLine());
            reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            result = new Plane(num);
        }

    }
}
