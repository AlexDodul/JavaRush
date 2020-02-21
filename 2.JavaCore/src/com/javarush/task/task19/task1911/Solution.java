package com.javarush.task.task19.task1911;

/* 
Ридер обертка
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;//запоминаем настоящий PrintStream в специальную переменную

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream(); //Создаем динамический массив
        PrintStream stream = new PrintStream(arrayOutputStream); //создаем адаптер к классу PrintStream

        System.setOut(stream); //Устанавливаем его как текущий System.out

        testString.printSomething(); //Вызываем функцию, которая ничего не знает о наших манипуляциях

        String arrayResult = arrayOutputStream.toString().toUpperCase(); //Преобразовываем записанные в наш ByteArray данные в строку и делаем все буквы заглавными (toUpperCase())
        System.setOut(consoleStream); //Возвращаем все как было
        System.out.println(arrayResult);




    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
