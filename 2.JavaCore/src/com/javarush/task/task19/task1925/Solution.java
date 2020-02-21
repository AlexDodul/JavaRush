package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];

        BufferedReader reader = new BufferedReader(new FileReader(file1));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null){
            String[] rec = line.split(" ");
            for (String s : rec){
                if (s.length() > 6){
                    sb.append(s).append(",");
                }
            }
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        writer.write(sb.toString());
        writer.close();


        /*BufferedReader reader = new BufferedReader(new FileReader("d:/test1.txt"));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null){
            String[] rec = line.split(" ");
            for (String s : rec){
                if (s.length() > 6){
                    sb.append(s).append(",");
                }
            }
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("d:/test2.txt"));
        writer.write(sb.toString());
        writer.close();*/

    }
}
