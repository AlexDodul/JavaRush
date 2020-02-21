package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String line;
        ArrayList<String> list = new ArrayList<String>();

        while ((line = fileReader.readLine()) != null){
            String[] rec = line.split(" ");
            int count = 0;
            for (String s : rec){
                if (words.contains(s)){
                    count++;
                }
            }
            if (count == 2){
                list.add(line);
            }
        }
        fileReader.close();

        for (String s : list){
            System.out.println(s);
        }
        reader.close();
    }
}
