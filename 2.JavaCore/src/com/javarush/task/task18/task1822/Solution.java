package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader file = new FileReader(reader.readLine());
        BufferedReader fileBufReader = new BufferedReader(file);


        String res;

        while ((res = fileBufReader.readLine()) != null){
            if (res.startsWith(args[0] + " ")){
                System.out.println(res);
                break;
            }
        }
        reader.close();
        file.close();
        fileBufReader.close();
    }
}
