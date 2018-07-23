package com.javarush.task.task22.task2211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Charset win1251 = Charset.forName("Windows-1251");
        Charset utf8 = Charset.forName("UTF-8");

        FileInputStream reader = new FileInputStream(args[0]);
        byte[] buffer = new byte[reader.available()];
        try {
            reader.read(buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();
        String s = new String(buffer,win1251);
        buffer = s.getBytes(utf8);
        FileOutputStream writer = new FileOutputStream(args[1]);
        writer.write(buffer);
        writer.close();
    }
}