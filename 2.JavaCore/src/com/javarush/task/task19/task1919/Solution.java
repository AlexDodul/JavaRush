package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        //BufferedReader fileReader = new BufferedReader(new FileReader("d:/test1.txt"));
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        Map<String, Double> map = new TreeMap<String, Double>();
        String line;
        double value;
        while ((line = fileReader.readLine()) != null){
            String[] rec = line.split(" ");
            value = Double.parseDouble(rec[1]);
            if (map.containsKey(rec[0])){
                map.put(rec[0], map.get(rec[0]) + value);
            } else {
                map.put(rec[0], value);
            }
        }
        fileReader.close();

        for (Map.Entry<String, Double> pairs : map.entrySet()){
            System.out.println(pairs.getKey() + " " + pairs.getValue());
        }
    }
}
