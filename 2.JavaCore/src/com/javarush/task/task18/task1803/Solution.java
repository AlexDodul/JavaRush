package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;/*
Самые частые байты
*/
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> reslist = new ArrayList<Integer>();

        String res = "";

        while (file.available()>0){
            int data = file.read();
            list.add(data);
        }
//в count считаем кол-во каждого байта
        int[] count = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            count[i] = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count[i]++;
                    //System.out.println(count[i]);
                }
            }
        }
        //определяем максимум
        int max = Integer.MIN_VALUE;
        for (int h : count){
            if (h > max){
                max = h;
            }
        }
        //собираем байты с минимумом использования и без повторов
        for (int i = 0; i<list.size(); i++)
        {
            if (!reslist.contains(list.get(i))&&count[i]==max) reslist.add(list.get(i));
        }
        for (int y : reslist)
        {
            res = y + " ";
            System.out.print(res);
        }

        reader.close();
        file.close();
    }
}
