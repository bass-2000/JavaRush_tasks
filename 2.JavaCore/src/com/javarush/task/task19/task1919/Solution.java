package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        String filename = args[0];
        HashMap<String, Double> hashMap = new HashMap<String, Double>();
        BufferedReader fileReader = new BufferedReader(new FileReader(filename));
        while (fileReader.ready()) {
            String[] values = fileReader.readLine().split(" ");
            if (hashMap.containsKey(values[0])) {
                hashMap.put(values[0], (hashMap.get(values[0]) + Double.parseDouble(values[1])));
            } else hashMap.put(values[0], Double.parseDouble(values[1]));
        }
        fileReader.close();

        TreeMap<String, Double> treeMap = new TreeMap<String, Double>(hashMap);

        for (Map.Entry<String, Double> value : treeMap.entrySet()) {
            System.out.println(value.getKey() + " " + value.getValue());
        }
    }
}