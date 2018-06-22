package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
//        try {
//            float i = 1 / 0;
//
//        } catch (Exception e) {
//            exceptions.add(e);
//        }

       try {
            throw new java.lang.ArithmeticException();
       }catch (Exception e){
           exceptions.add(e);
       }

        try {
            throw new java.lang.NullPointerException();
        }catch (Exception e){
            exceptions.add(e);
        }

        try {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }catch (Exception e){
            exceptions.add(e);
        }

        try {
            throw new java.lang.IndexOutOfBoundsException();
        }catch (Exception e){
            exceptions.add(e);
        }

        try {
            throw new java.lang.NumberFormatException();
        }catch (Exception e){
            exceptions.add(e);
        }

        try {
            throw new java.io.FileNotFoundException();
        }catch (Exception e){
            exceptions.add(e);
        }

        try {
            throw new java.lang.StringIndexOutOfBoundsException();
        }catch (Exception e){
            exceptions.add(e);
        }

        try {
            throw new java.lang.NegativeArraySizeException();
        }catch (Exception e){
            exceptions.add(e);
        }

        try {
            throw new java.util.TooManyListenersException();
        }catch (Exception e){
            exceptions.add(e);
        }

        try {
            throw new java.lang.ClassCastException();
        }catch (Exception e){
            exceptions.add(e);
        }
    }
}
