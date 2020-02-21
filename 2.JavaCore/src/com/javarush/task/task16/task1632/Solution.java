package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).start();
        }
    }

    static {
        threads.add(new MyThread1());
        threads.add(new MyThread2());
        threads.add(new MyThread3());
        threads.add(new MyThread4());
        threads.add(new MyThread5());

    }
/*-------------поток 1-----------------*/
    public static class MyThread1 extends Thread{
        @Override
        public void run(){
            while (true){

            }
        }
    }
/*-------------поток 2-----------------*/
    public static class MyThread2 extends Thread{
        @Override
        public void run(){
            try {
                while (!isInterrupted()){

                }
                throw new InterruptedException();
            }catch (InterruptedException e){
                System.out.println("InterruptedException");
            }

        }
    }
/*-------------поток 3-----------------*/
    public static class MyThread3 extends Thread{
        @Override
        public void run(){
            try {
                while (true){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            }catch (InterruptedException e){

            }

        }
    }

/*-------------поток 4-----------------*/
    public static class MyThread4 extends Thread implements Message{
        @Override
        public void showWarning(){
            this.interrupt();
            try {
                this.join();
            } catch (InterruptedException e) {

            }
        }
        @Override
        public void run(){
            Thread current = Thread.currentThread();
            while(!current.interrupted())
            {

            }
        }
    }
/*-------------поток 5-----------------*/
    public static class MyThread5 extends Thread{
        @Override
        public void run(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int summ = 0;

            try {
                while (!isInterrupted()){
                    String s = reader.readLine();
                    if (s.equals("N")){
                        this.interrupt();
                    }
                    else {
                        int chislo = Integer.parseInt(s);
                        summ += chislo;
                    }
                }
            }catch (IOException e){

            }
            System.out.println(summ);


        }
    }
}