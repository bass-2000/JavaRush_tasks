package com.javarush.task.task20.task2025;

import java.util.*;

/*
Алгоритмы-числа
*/
public class Solution {

    public static long[] getNumbers(long N) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 1; i < N; i++) {
            if (isUnique(i)) {
                int sum = powerAndSum(i);
                if (isArmstrong(sum) && sum < N) {
                    set.add(sum);
                }
            }
        }

        long[] result = new long[set.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = set.pollFirst();
        }

        return result;
    }

    /** Проверяет является ли параметр числом Армстронга — натуральным числом,
     * которое в данной системе счисления равно сумме своих цифр,
     * возведённых в степень, равную количеству его цифр.
     *
     * @param a целое число
     * @return true - если параметр является числом Армстронга
     */
    public static boolean isArmstrong(int a) {
        return a == powerAndSum(a);
    }

    public static boolean isUnique(int b) {
        int rightDigit = b % 10;
        int currentDigit;
        int a = b / 10;

        while (a != 0) {
            currentDigit = a % 10;
            if (currentDigit > rightDigit && rightDigit != 0) {
                return false;
            }
            else {
                rightDigit = currentDigit;
                a = a / 10;
            }
        }
        return true;
    }



    /** Возвращает сумму чисел возведенных в степень количества цифр в параметре {@code а} <br>
     *  Например: а = 123 <br>
     *  Результат: sum = 1*1*1 + 2*2*2 + 3*3*3 = 36
     *
     * @param a целое число
     * @return целое число
     */
    public static int powerAndSum(int a) {
        int digits = String.valueOf(a).length();

        int sum = 0;
        int b = a;
        while (b != 0) {
            int t = b % 10; // остаток от деления на 10 - получаем последнюю цифру в числе
            int c = t;
            for (int i = 1; i < digits; i++) {
                t *= c;
            }
            sum += t;
            b = b / 10; // целочисленное деление на 10 - отбрасываем последнюю цифру в числе
        }
        return sum;
    }

    public static void main(String[] args) {
        // начальная память
        long memoryStart = Runtime.getRuntime().freeMemory();
        // время начала вычислений
        long start = System.currentTimeMillis();

        // вычисляем числа
        long[] a = getNumbers(1000000000);

        // время окончания
        long end = System.currentTimeMillis();
        // память после вычислений
        long memoryEnd = Runtime.getRuntime().freeMemory();

        // выводим найденные числа
        for (long n: a) {
            System.out.println(n);
        }

        // выводим результат
        System.out.println(end - start + " ms");
        System.out.println(((memoryStart - memoryEnd) / (8 * 1024 * 1024) + " MB"));
    }
}