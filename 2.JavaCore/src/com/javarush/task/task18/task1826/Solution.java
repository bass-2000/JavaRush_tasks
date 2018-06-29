package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static byte[] key = new byte[] {1,2,3,4,5};
    public static void main(String[] args) throws IOException {


        switch (args[0]) {
            case "-e": {
                crypt(args[1],args[2]);
                break;
            }
            case "-d": {
                crypt(args[1],args[2]);
                break;
            }
        }

    }

    public static void crypt(String arg1, String arg2) throws IOException {
        FileInputStream src = new FileInputStream(arg1);
        FileOutputStream dst = new FileOutputStream(arg2);

        while (src.available() > 0) {
            byte[] buf = new byte[src.available()];
            src.read(buf);

            //XOR Code
            int j = 0;
            for (int i = 0; i < buf.length; i++) {
                buf[i] = (byte) (buf[i] ^ key[j]);
                if (j > key.length)
                    j = 0;
            }
            dst.write(buf);
        }
        src.close();
        dst.close();
    }

}