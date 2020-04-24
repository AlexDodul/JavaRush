package com.javarush.task.task22.task2210;

import java.util.*;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(getTokens("level22.lesson13.task01", ".")));
    }

    public static String[] getTokens(String query, String delimiter) {
        ArrayList<String> tokens = new ArrayList<>();
        StringTokenizer str = new StringTokenizer(query,delimiter);
        while (str.hasMoreTokens()){
            tokens.add(str.nextToken());
        }
        return tokens.toArray(new String[0]);
    }

}
