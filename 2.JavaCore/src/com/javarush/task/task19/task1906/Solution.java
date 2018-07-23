package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        FileReader file1 = new FileReader(fileName1);
        FileWriter file2 = new FileWriter(fileName2);
        int i=1;
        while (file1.ready()) {
            int value = file1.read();
            if (i % 2 == 0)
                file2.write(value);
            i++;
        }
        file1.close();
        file2.close();

    }
}


