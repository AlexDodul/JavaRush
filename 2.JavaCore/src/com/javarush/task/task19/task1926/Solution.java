package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader fReader = new BufferedReader(new FileReader(fileName));
        String line;

        while ((line = fReader.readLine()) != null){
            System.out.println(new StringBuffer(line).reverse());
        }
        fReader.close();
        reader.close();
    }
}
