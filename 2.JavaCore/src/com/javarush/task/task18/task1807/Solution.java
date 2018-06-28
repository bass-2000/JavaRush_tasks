package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.rmi.server.ExportException;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file);
        int count =0;
        while(inputStream.available() > 0) {
            if (inputStream.read() == 44)
                count++;
        }

        inputStream.close();
        System.out.println(count);
    }
}
