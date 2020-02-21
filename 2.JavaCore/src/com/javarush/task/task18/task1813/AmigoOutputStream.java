package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream myObject;

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);
        myObject = fileOutputStream;
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    @Override
    public void flush() throws IOException {
        myObject.flush();
    }
    @Override
    public void write(int b) throws IOException {
        myObject.write(b);
    }
    @Override
    public void write (byte[] b) throws IOException{
        myObject.write(b);
    }
    @Override
    public void write (byte[] b, int off, int len) throws IOException {
        myObject.write(b, off, len);
    }
    @Override
    public void close() throws IOException {
        myObject.flush();
        myObject.write("JavaRush © All rights reserved.".getBytes());
        myObject.close();

    }
}
