package com.javarush.task.task21.task2103;

/* 
Все гениальное - просто!
*/
public class Solution {
    public static boolean calculate(boolean a, boolean b, boolean c, boolean d) {
        //return (a && b && c && !d) || (!a && c) || (!b && c) || (c && d);


        //"Операцию И часто называют "логическим умножением", а ИЛИ "логическим сложением"
        // По сути, в этом выражении все зависит от одной переменной.
        // Какое значение она примет, такое и принимают все значения в скобках.
        // Следовательно, можно ориентироваться только на значение этой переменной.
        // Ее и оставляем.
        return c;
    }

    public static void main(String[] args) {

    }
}
