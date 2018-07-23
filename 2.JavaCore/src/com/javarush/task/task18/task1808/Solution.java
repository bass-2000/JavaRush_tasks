package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        reader.close();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream1 = new FileOutputStream(file2);
        FileOutputStream outputStream2 = new FileOutputStream(file3);


        if (inputStream.available() > 0) {
            byte[] bytes = new byte[inputStream.available()];
            int count = inputStream.read(bytes);
            outputStream1.write(bytes, 0, count / 2 + count % 2);
            outputStream2.write(bytes, count / 2 + count % 2, count / 2);
        }
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
