package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        //поток, читающий из файла
        reader = new BufferedReader(new InputStreamReader((new FileInputStream(fileName))));

        //Коллекция
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Преобразуем в int и узнаем четный или нет
        while (reader.ready()) {
            //считай число;
            //если число чётное добавь в numbers;
            int num = Integer.parseInt(reader.readLine());

            if (num % 2 == 0) {
                numbers.add(num);
            }
        }
        // Закрываем ридер
        reader.close();

        // Сортируем коллекцию
        Collections.sort(numbers);

        // вывод на экран
        for (int i : numbers) {
            System.out.println(i);
        }

    }
}
