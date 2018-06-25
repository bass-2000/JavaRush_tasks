package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        String url = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            url = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (!url.contains("obj")) {
            String[] subStr1;
            String delimeter1 = "\\?";
            subStr1 = url.split(delimeter1);
            String[] subStr2;
            String delimeter2 = "=";
            subStr2 = subStr1[1].split(delimeter2);

            System.out.print(subStr2[0] + " ");

            String[] subStr3;
            String delimeter3 = "&";

            subStr3 = subStr2[1].split(delimeter3);

            System.out.print(subStr3[1] + " " + subStr3[2]);

        } else {
            {
                String[] subStr1;

                String delimeter1 = "\\?";

                subStr1 = url.split(delimeter1);
                String[] subStr2;
                String delimeter2 = "=";
                subStr2 = subStr1[1].split(delimeter2);
                System.out.print(subStr2[0] + " ");
                String[] subStr3;
                String delimeter3 = "&";

                subStr3 = subStr2[1].split(delimeter3);

                System.out.println(subStr3[1]);


                if (isNumeric(subStr3[0])) {

                    alert(Double.parseDouble(subStr3[0]));
                } else
                    alert(subStr3[0]);

            }

        }
    }

        public static boolean isNumeric(String url)
        {
            try
            {
                double d = Double.parseDouble(url);
            }
            catch(NumberFormatException nfe)
            {
                return false;
            }
            return true;
        }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
