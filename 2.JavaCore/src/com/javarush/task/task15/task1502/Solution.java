package com.javarush.task.task15.task1502;

/* 
ООП - Наследование животных
*/

public class Solution {
    //добавьте классы Goose и Dragon тут
    public static class Goose extends SmallAnimal {

        @Override
        public String getSize(){
            return "Гусь маленький, " + "как кошка";
        }
    }

    public static class Dragon extends BigAnimal {
        @Override
        public String getSize(){
            return "Дракон большой, " + "как динозавр";
        }
    }

    public static void main(String[] args) {
        /*Dragon dragon = new Dragon();
        Goose goose = new Goose();
        System.out.println(dragon.getSize());
        System.out.println(goose.getSize());*/

    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
}