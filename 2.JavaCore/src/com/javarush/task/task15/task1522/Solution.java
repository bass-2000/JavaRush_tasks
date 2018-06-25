package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    static{
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
        }
    }
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            if(s.equals(Planet.EARTH)){
                Solution.thePlanet = Earth.getInstance();
            }else if(s.equals(Planet.MOON)) {
                Solution.thePlanet = Moon.getInstance();
            }else if(s.equals(Planet.SUN)) {
                Solution.thePlanet = Sun.getInstance();
            }else Solution.thePlanet = null;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
