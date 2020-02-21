package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        //BufferedReader fileReader = new BufferedReader(new FileReader("d:/test1.txt"));
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

        double maxValue = 0;

        for (Map.Entry<String, Double> pairs : map.entrySet()){
            if (pairs.getValue() > maxValue){
                maxValue = pairs.getValue();
            }
        }

        for (Map.Entry<String, Double> pairs : map.entrySet()){
            if (pairs.getValue() == maxValue){
                System.out.println(pairs.getKey());
            }
        }
    }
}
