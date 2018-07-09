package com.javarush.task.task21.task2103;

/* 
Все гениальное - просто!
*/
public class Solution {
    public static boolean calculate(boolean a, boolean b, boolean c, boolean d) {
        return c ;
    }

    public static void main(String[] args) {

    }
}


// (a * b * c * ^d) + (^a * c) + (^b * c) + (c * d) = c * (a * b * ^d + ^a + ^b + d);
// По распределительному закону: a * b * ^d + ^a = (a + ^a) * (b * ^d + ^a) = b * ^d + ^a
// отсюда: c * (a * b * ^d + ^a + ^b + d) = c * (b * ^d + ^a + ^b + d)
// По тому же распределительному закону: b * ^d + ^b = (b + ^b)*(^b + ^d) = ^b + ^d
// отсюда: c * (b * ^d + ^a + ^b + d) = c * (^a + d + ^b + ^d) = c * (1 + ^a + ^b) = c + ^a*c + ^b*c