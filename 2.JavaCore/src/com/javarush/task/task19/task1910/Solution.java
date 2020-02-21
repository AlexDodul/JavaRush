package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f1 = reader.readLine();
        String f2 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(f1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(f2));

        while (fileReader.ready()){
            String s = fileReader.readLine();
            //s = s.replaceAll("[^a-zA-Z]", "");
            s = s.replaceAll("\\p{Punct}", "");
            fileWriter.write(s);
            //fileWriter.newLine();
        }
        fileReader.close();
        fileWriter.close();
    }
}
