package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static Properties props = new Properties();

    public void fillInPropertiesMap() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();

        FileInputStream fileReader = new FileInputStream(filename);
        load(fileReader);
        fileReader.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        PrintWriter saver = new PrintWriter(outputStream);
        for (Map.Entry<String,String> pair : properties.entrySet())
        {
            props.put(pair.getKey(),pair.getValue());
        }
        props.store(outputStream, null); //метод save устарел, используем этот метод
        saver.close();

    }

    public void load(InputStream inputStream) throws Exception {
        BufferedReader loader = new BufferedReader(new InputStreamReader(inputStream));
        props.load(loader); //в Properties props загружены данные из файла
        Set<String> list = props.stringPropertyNames(); //возвращаю set ключей файла
        for (String current : list) {
            properties.put(current, props.getProperty(current)); //добавлю в map пары из файла
        }
        loader.close();
    }

    public static void main(String[] args) throws Exception {
        properties.clear();
        Solution solution = new Solution();
        solution.fillInPropertiesMap();
        System.out.println(properties);
        solution.save(new FileOutputStream("d:/javarushcopy.properties"));
    }
}
