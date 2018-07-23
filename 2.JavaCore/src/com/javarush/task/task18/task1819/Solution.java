package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    static final int SIZE_OF_BUFFER = 1024;
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        ByteArrayOutputStream memory = new ByteArrayOutputStream();
        fileToMemory (memory, file2);
        fileToMemory (memory, file1);
        FileOutputStream f = new FileOutputStream(file1);
        memory.writeTo(f);
        f.close();
    }

    public static void fileToMemory(ByteArrayOutputStream memory, String fileName) throws IOException {
        FileInputStream f = new FileInputStream(fileName);
        int readedByte = 0;
        while (f.available() > 0) {
            byte[] buf = new byte[Solution.SIZE_OF_BUFFER];
            readedByte = f.read(buf);
            memory.write(buf, 0, readedByte);
        }
        f.close();
    }
}


