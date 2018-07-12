package com.javarush.task.task21.task2113;

import java.util.*;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws Exception{
        for(int i=0; i<100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){
        for (Horse h: horses){
            h.move();
        }
    }

    public void print(){
        for (Horse h: horses){
            h.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner(){
        Horse winner = horses.get(0);
        double dis = horses.get(0).getDistance();
        for (Horse horse : horses)
            if (horse.getDistance() > dis)
            {
                dis = horse.getDistance();
                winner = horse;
            }
        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws Exception {
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("\uD83D\uDC0E", 3, 0));
        game.getHorses().add(new Horse("\uD83D\uDC0E", 3, 0));
        game.getHorses().add(new Horse("\uD83D\uDC0E", 3, 0));
        game.run();
        game.printWinner();
    }
}
