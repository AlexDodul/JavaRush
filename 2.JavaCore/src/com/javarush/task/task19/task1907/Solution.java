package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(file); //Посимвольное чтение из текстового файла
        StringBuffer buffer = new StringBuffer();

        while (fileReader.ready()){
            char simbol = (char) fileReader.read();
            buffer.append(simbol);
        }
        Pattern p = Pattern.compile("\\b[Ww][Oo][Rr][Ll][Dd]\\b");
        Matcher m = p.matcher(buffer.toString());

        int count = 0;
        while (m.find()){
            count++;
        }
        System.out.println(count);
        fileReader.close();
    }
}
