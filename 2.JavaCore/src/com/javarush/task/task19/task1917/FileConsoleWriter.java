package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.*;

public class FileConsoleWriter {
    private FileWriter fileWriter;

    public FileConsoleWriter(String var1) throws IOException {
        fileWriter = new FileWriter(var1);
    }

    public FileConsoleWriter(String var1, boolean var2) throws IOException {
        fileWriter = new FileWriter(var1, var2);
    }

    public FileConsoleWriter(File var1) throws IOException {
        fileWriter = new FileWriter(var1);
    }

    public FileConsoleWriter(File var1, boolean var2) throws IOException {
        fileWriter = new FileWriter(var1, var2);
    }

    public FileConsoleWriter(FileDescriptor var1) {
        fileWriter = new FileWriter(var1);
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        System.out.println(new String(cbuf).substring(off, off + len));
    }

    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.println(str.substring(off, off + len));
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        System.out.println(new String(cbuf));
    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }

    public void close() throws IOException {
        fileWriter.close();
    }


    public static void main(String[] args) {

    }

}
