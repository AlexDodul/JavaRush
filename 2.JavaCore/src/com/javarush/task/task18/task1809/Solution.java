package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());

        FileOutputStream file2 = new FileOutputStream(reader.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (file1.available() > 0){
            int data = file1.read();
            list.add(data);
        }

        for (int i = list.size()-1; i >= 0 ; i--) {
            file2.write(list.get(i));
        }
        reader.close();
        file1.close();
        file2.close();
    }
}
