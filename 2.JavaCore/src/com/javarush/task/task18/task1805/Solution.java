package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file);

        ArrayList<Integer> list = new ArrayList<Integer>();
        while(inputStream.available() > 0) {
            list.add(inputStream.read());
        }
        reader.close();
        inputStream.close();
        Collections.sort(list);

        int a = 0;
        for (int str: list){
            if (str != a) {
                System.out.print(str + " ");
                a = str;
            }
        }

    }
}
