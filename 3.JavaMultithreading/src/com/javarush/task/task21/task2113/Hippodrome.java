package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    public static void main(String[] args) {
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
    }

    private List <Horse> horses;
    public static Hippodrome game;
    public List <Horse> getHorses(){
        return horses;
    }

    public Hippodrome (List <Horse> horses){
        this.horses = horses;
    }

}
