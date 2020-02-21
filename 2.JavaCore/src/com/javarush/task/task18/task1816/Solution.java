package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(args[0]); //Создай поток чтения из файла, который приходит первым параметром в main
        int count = 0;
        while (file.available() > 0){ //пока есть еще непрочитанные байты
            int data = file.read();// прочитать очередной байт в переменную data

            if ((data > 64 && data < 91) || (data > 96 && data < 123)){
                count++;
            }
        }
        file.close();
        System.out.println(count);
    }
}
