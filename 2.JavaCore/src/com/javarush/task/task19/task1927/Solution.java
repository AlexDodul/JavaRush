package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;//запоминаем настоящий PrintStream в специальную переменную

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();//Создаем динамический массив
        PrintStream stream = new PrintStream(outputStream);//создаем адаптер к классу PrintStream
        System.setOut(stream);//Устанавливаем его как текущий System.out
        testString.printSomething();//Вызываем функцию, которая ничего не знает о наших манипуляциях

        System.setOut(consoleStream);//Возвращаем все как было

        String[] byteArray = outputStream.toString().split("\\n");
        for (int i = 0; i < byteArray.length; i++){
            System.out.println(byteArray[i]);
            if (i % 2 != 0){
                System.out.println("JavaRush - курсы Java онлайн");
            }
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
