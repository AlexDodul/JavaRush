package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
       // FileInputStream file = new FileInputStream(args[0]);

        byte[] symbol = new byte[file.available()];
        file.read(symbol);
        Arrays.sort(symbol);

        HashMap<Byte, Integer> map = new HashMap<Byte, Integer>();

        int count;

        for (byte x : symbol){
            count = 0;

            for (byte x1 : symbol){
                if (x == x1){
                    count++;
                }
            }
            if (!map.containsKey(x)){
                map.put(x, count);
                System.out.println((char) x + " " + count);
            }
        }
        file.close();
    }
}
