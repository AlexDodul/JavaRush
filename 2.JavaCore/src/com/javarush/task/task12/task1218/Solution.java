package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        @Override
        public void move() {
            System.out.println("I am a dog and i am run");
        }
        @Override
        public void eat(){
            System.out.println("I am a dog and i am eat");
        }
    }

    public class Duck implements CanFly, CanMove, CanEat{
        @Override
        public void fly(){
            System.out.println("I am a duck and i am fly");
        }
        @Override
        public void move(){
            System.out.println("I am a duck and i am run");
        }
        @Override
        public void eat(){
            System.out.println("I am a duck and i am eat");
        }
    }

    public class Car  implements CanMove{
        @Override
        public void move() {
            System.out.println("I am a car and i am run");
        }
    }

    public class Airplane implements CanFly, CanMove{
        @Override
        public void fly(){
            System.out.println("I am a Airplane and i am fly");
        }
        @Override
        public void move(){
            System.out.println("I am a Airplane and i am run");
        }
    }
}
