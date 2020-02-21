package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {
        /*int x = 5;
        int z = 3;
        long q = 47;
        long w = 51;
        double d = 70.9;
        double f = 55.7;

        System.out.println(max(x,z));
        System.out.println(max(q,w));
        System.out.println(max(d,f));*/
    }
    //Напишите тут ваши методы
    public static int max(int a, int b){
        if (a > b){
            return a;
        }
        else {
            return b;
        }
    }
    public static long max(long a, long b){
        if (a > b){
            return a;
        }
        else {
            return b;
        }
    }
    public static double max(double a, double b){
        if (a > b){
            return a;
        }
        else {
            return b;
        }
    }
}
