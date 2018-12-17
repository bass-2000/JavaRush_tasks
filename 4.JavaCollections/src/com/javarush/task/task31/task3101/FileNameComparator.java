package com.javarush.task.task31.task3101;

import java.io.File;
import java.util.Comparator;

public class FileNameComparator implements Comparator<File> {
    public int compare(File first, File second) {
        return first.getName().compareTo(second.getName());
    }
}
