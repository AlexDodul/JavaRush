package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {
        int z = 5;
        Integer y = 3;
        print(z);
        print(y);
    }
    public static void print(int a){
        a+=a;
        System.out.println(a);
    }
    public static void print(Integer b){
        b+=b;
        System.out.println(b);
    }

    //Напишите тут ваши методы
}
