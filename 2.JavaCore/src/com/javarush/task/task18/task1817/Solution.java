package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        FileReader fileReader = new FileReader(args[0]);

        int symblCount =0;
        int spaceCount =0;

        while (fileReader.ready()) {
            char s = (char) fileReader.read();
            symblCount++;
            if(s == ' ')spaceCount++;
        }
        fileReader.close();

        System.out.println(String.format("%.2f", ((float) spaceCount / symblCount) * 100));
    }
}
