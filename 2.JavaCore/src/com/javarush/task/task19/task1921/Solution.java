package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        //String file = args[0];
        //BufferedReader fileName = new BufferedReader(new FileReader(file));
        BufferedReader fileName = new BufferedReader(new FileReader("d:/test1.txt"));

        StringBuilder name;
        int year, month, day;
        String line;

        while ((line = fileName.readLine()) != null){
            String[] rec = line.split(" ");
            year = Integer.parseInt(rec[rec.length - 1]);
            month = Integer.parseInt(rec[rec.length - 2]) - 1;
            day = Integer.parseInt(rec[rec.length - 3]);
            name = new StringBuilder();
            for (int i = 0; i < rec.length -3; i++){
                name.append(rec[i]).append(" ");
            }
            name.replace(name.length() - 1, name.length(), "");

            PEOPLE.add(new Person(name.toString(), new GregorianCalendar(year, month, day).getTime()));
        }
        fileName.close();
    }
}
