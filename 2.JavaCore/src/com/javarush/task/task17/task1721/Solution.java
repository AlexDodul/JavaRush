package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();



    public static void main(String[] args) throws IOException {
        String fileName1, fileName2;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fileName1 = reader.readLine();
        fileName2 = reader.readLine();
        reader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
        String line = null;
        while ((line = reader1.readLine()) != null)
        {
            allLines.add(line);
        }
        reader1.close();

        BufferedReader reader2 = new BufferedReader(new FileReader(fileName2));
        line = null;
        while ((line = reader2.readLine()) != null)
        {
            forRemoveLines.add(line);
        }
        reader2.close();

        new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {

        if(allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
