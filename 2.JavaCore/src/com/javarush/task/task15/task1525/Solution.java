package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        String s = Statics.FILE_NAME;

        try {
            FileReader fileReader = new FileReader(s); // поток который подключается к текстовому файлу
            BufferedReader reader = new BufferedReader(fileReader); // соединяем FileReader с BufferedReader
            String str;
            while ((str = reader.readLine()) != null){
                lines.add(str); // добавляем содержимое файла в список lines построчно
            }
            reader.close(); // закрываем поток
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
