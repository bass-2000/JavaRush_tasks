package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        String[] country = {"Moldova", "Russia", "Belarus","Ukraine"};

        for (String a: country) {
            Hen hen = HenFactory.getHen(a);
            hen.getCountOfEggsPerMonth();
            System.out.println(hen.getDescription());
        }

    }

    static class HenFactory {

        static Hen getHen(String country) {
            switch (country){
                case "Belarus":
                    return new BelarusianHen();
                case "Moldova":
                    return new MoldovanHen();
                case "Ukraine":
                    return new UkrainianHen();
                default:
                    return new RussianHen();
            }
        }
    }


}


