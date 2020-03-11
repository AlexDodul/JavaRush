package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        StringBuilder strBld = new StringBuilder();
        if (string != null && string.split("\t").length > 2){
            strBld.append(string.split("\\t")[1]);
        } else
            throw new TooShortStringException();
        return strBld.toString();
    }

    public static class TooShortStringException extends Exception {
    }


}
