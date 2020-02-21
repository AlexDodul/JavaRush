package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(12.3, "i");
        labels.put(12.4, "i");
        labels.put(12.5, "i");
        labels.put(12.6, "i");
        labels.put(12.7, "i");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
