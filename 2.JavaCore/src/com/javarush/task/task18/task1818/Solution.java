package com.javarush.task.task18.task1818;

/* 
Два в одном
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

        FileOutputStream f1 = new FileOutputStream(file1, true);
        FileInputStream f2 = new FileInputStream(file2);
        FileInputStream f3 = new FileInputStream(file3);

        while(f2.available()>0){
            byte[] buff = new byte[f2.available()];
            f2.read(buff);
            f1.write(buff);
        }

        f2.close();

        while(f3.available()>0){
            byte[] buff = new byte[f3.available()];
            f3.read(buff);
            f1.write(buff);
        }

        f1.close();
        f3.close();
    }
}
