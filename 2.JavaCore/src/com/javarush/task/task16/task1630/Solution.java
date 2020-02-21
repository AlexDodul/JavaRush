package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        }catch (IOException e){

        }


    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {

        String fileName;
        List<String> list = new ArrayList();
        String result = "";

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            for(int i = 0; i < list.size(); i++){
                result = result + " " + list.get(i);
            }
            return result;
        }

        @Override
        public void run() {
            BufferedReader fileReader = null;
            String add = null;
            try {
                File myFile = new File(fileName);
                fileReader = new BufferedReader(new FileReader(myFile));
                while((add = fileReader.readLine()) != null){
                    list.add(add);
                }


            } catch (FileNotFoundException ex) {
            } catch (IOException ex) {
            } finally {
                try {
                    fileReader.close();
                } catch (IOException ex) {
                }
            }

        }

    }
}
