package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        reader.close();

        FileReader file1 = new FileReader(f1);
        FileWriter file2 = new FileWriter(f2);

        int count = 1;

        while (file1.ready()){
            int data = file1.read();
            if (count % 2 == 0){
                file2.write(data);
            }
            count++;
        }

        file1.close();
        file2.close();
    }
}
