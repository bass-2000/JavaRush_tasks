package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream2 = new FileOutputStream(file2);

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (inputStream.available() > 0) {
            list.add(0,inputStream.read());
        }
        for (int line:list)
        {
            outputStream2.write(line);
        }
        inputStream.close();
        outputStream2.close();
    }
}
