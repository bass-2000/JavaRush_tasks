package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int maxByte =0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileReader = new FileInputStream(fileName);
        while (fileReader.available()>0){
            int data = fileReader.read();
            if(data>maxByte)maxByte=data;
        }
        fileReader.close();
        reader.close();
        System.out.println(maxByte);

    }
}
