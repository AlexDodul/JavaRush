package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;/*
Самые редкие байты
*/
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        String res="";

        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            list.add(data);
        }
        //в count считаем кол-во каждого байта
        int[] count = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            count[i] = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    count[i]++;
                }
            }
        }

        //определяем минимум
        int min = Integer.MAX_VALUE;
        for (int h: count)
        {
            if (h < min) min = h;
        }

        //собираем байты с минимумом использования и без повторов
        for (int i = 0; i<list.size(); i++)
        {
            if (!result.contains(list.get(i))&&count[i]==min) result.add(list.get(i));
        }
        for (int y : result)
        {
            res = y + " ";
            System.out.print(res);
        }

        reader.close();
        fileInputStream.close();
    }
}
