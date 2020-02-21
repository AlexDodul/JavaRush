package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());

        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (file1.available() > 0){
            int data = file1.read();
            list.add(data);
        }
        if (list.size() % 2 == 0){
            int listSize1 = list.size() / 2;
            for (int i = 0; i < listSize1; i++) {
                file2.write(list.get(i));
            }
            for (int i = listSize1; i < list.size(); i++) {
                file3.write(list.get(i));
            }
        }else if (list.size() % 2 != 0){
            int listSize1 = list.size() / 2;
            for (int i = 0; i < listSize1 + 1; i++) {
                file2.write(list.get(i));
            }
            for (int i = listSize1 + 1; i < list.size(); i++) {
                file3.write(list.get(i));
            }
        }
        reader.close();
        file1.close();
        file2.close();
        file3.close();

    }
}
