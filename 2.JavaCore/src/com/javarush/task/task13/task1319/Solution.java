package com.javarush.task.task13.task1319;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        // напишите тут ваш код
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String str = "";
        try {
            reader = new BufferedReader(new InputStreamReader(System.in)); //считываем имя файла с консоли
            writer = new BufferedWriter(new FileWriter(reader.readLine()));


                while (!str.equals("exit")) {
                    str = reader.readLine();
                    writer.write(str);
                    writer.newLine(); //новая строка
                }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            reader.close();
            writer.close();
        }
    }
}
