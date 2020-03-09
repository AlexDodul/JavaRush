package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    public static void main(String[] args) throws InterruptedException {
        List <Horse> list = new ArrayList<>();
        game = new Hippodrome(list);
        Horse horse1 = new Horse("Pirat", 3, 0);
        Horse horse2 = new Horse("Rita", 3, 0);
        Horse horse3 = new Horse("Ducia", 3, 0);
        list.add(horse1);
        list.add(horse2);
        list.add(horse3);
        /*for (Horse s : list){
            System.out.println(s.getName() + " " + s.getSpeed() + " " + s.getDistance());
        }*/
        game.run();
        game.printWinner();
    }

    private List <Horse> horses;
    public static Hippodrome game;
    public List <Horse> getHorses(){
        return horses;
    }

    public Hippodrome (List <Horse> horses){
        this.horses = horses;
    }
    public void run() throws InterruptedException {
        for (int i = 1; i <= 100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move(){
        for (int i = 0; i < horses.size(); i++){
            horses.get(i).move();
        }
    }
    public void print(){
        for (int i = 0; i < horses.size(); i++){
            horses.get(i).print();
        }
        for (int j = 0; j < 10; j++){
            System.out.println();
        }
    }

    public Horse getWinner (){
        Horse winner = getHorses().get(0);
        for (Horse each: getHorses()) {
            if (each.getDistance() > winner.getDistance())
                winner = each;
        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

}
