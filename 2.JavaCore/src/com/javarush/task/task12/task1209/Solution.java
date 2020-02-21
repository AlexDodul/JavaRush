package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {
        /*int x = 5;
        int z = 3;
        long q = 47;
        long w = 51;
        double d = 70.9;
        double f = 55.7;

        System.out.println(min(x,z));
        System.out.println(min(q,w));
        System.out.println(min(d,f));*/

    }

    //Напишите тут ваши методы
    public static int min(int a, int b){
        if (a < b){
            return a;
        }
        else {
            return b;
        }
    }
    public static long min(long a, long b) {
        if (a < b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static double min(double a, double b) {
        if (a < b) {
            return a;
        }
        else {
            return b;
        }
    }
}
