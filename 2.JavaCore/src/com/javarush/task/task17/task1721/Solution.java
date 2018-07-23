package com.javarush.task.task17.task1721;

import java.util.*;
import java.io.*;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName1 = sc.nextLine();
        String fileName2 = sc.nextLine();

        fillList(fileName1,allLines);
        fillList(fileName2,forRemoveLines);


        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            System.out.println("Что-то");
        }
    }
    public static void fillList (String fileName, List<String> list) {
        try {
            BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

            while (file.ready()) {
                list.add(file.readLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName + " not found");
        } catch (IOException e) {
            System.out.println("Can't Read File " + fileName);
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
            return;
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}