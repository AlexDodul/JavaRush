package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    /*public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];
        BufferedReader reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2, true));
        //BufferedReader reader = new BufferedReader(new FileReader("d:/test1.txt"));
        //BufferedWriter writer = new BufferedWriter(new FileWriter("d:/test2.txt", true));

        String line;
        while ((line = reader.readLine()) != null){
            String[] rec = line.split(" ");
            for (String s : rec){
                if (s.matches(".*\\d.*")){
                    //writer.append(s).append(" ");
                    writer.write(s + " ");
                }
            }
        }
        reader.close();
        writer.close();
    }*/


    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter printWriter = new BufferedWriter(new FileWriter(args[1]));
        //BufferedReader fileReader = new BufferedReader(new FileReader("d:/test1.txt"));
        //BufferedWriter printWriter = new BufferedWriter(new FileWriter("d:/test2.txt", true));

        while (fileReader.ready()){
            String line =fileReader.readLine();
            String[] words = line.split(" ");
            for (String word : words)
                if (!word.matches("^\\D*$"))
                    printWriter.write(word + " ");
        }
        fileReader.close();
        printWriter.close();
    }

}
