package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        File allFilesContent = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);

        ArrayList<File> fileList = new ArrayList<>();
        try (FileOutputStream fileOutputStream = new FileOutputStream(allFilesContent)) {

            fillFileList(path.getPath(), fileList);
            fileList.sort(new FileNameComparator());

            for (File file : fileList) {
                FileInputStream fileInputStream = new FileInputStream(file);
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read());
                }
                fileOutputStream.write(System.lineSeparator().getBytes());
                fileOutputStream.flush();

                fileInputStream.close();
            }
        }
    }

    private static void fillFileList(String path, ArrayList<File> fileList) {
        File[] files = new File(path).listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                fillFileList(file.getAbsolutePath(), fileList);
                continue;
            }
            if (file.length() > 50)
                FileUtils.deleteFile(file);
            else
                fileList.add(file);
        }
    }
}

