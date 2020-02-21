package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString();
        /*if (result.contains("3 + 6 = ")) {
            result = result.replaceAll("3 [+ \\- *] 6 = ", "3 + 6 = 9");
        }
        else if (result.contains("3 - 6 = ")) {
            result = result.replaceAll("3 [+ \\- *] 6 = ", "3 - 6 = -3");
        }
        else if (result.contains("3 * 6 = ")) {
            result = result.replaceAll("3 [+ \\- *] 6 = ", "3 * 6 = 18");
        }*/
        System.setOut(consoleStream);

        String[] str = result.split("\\s+");
        int n1 = Integer.parseInt(str[0]);
        int n2 = Integer.parseInt(str[2]);
        int res = 0;
        switch (str[1]){
            case "+": res = n1+n2;
                break;

            case "-": res = n1-n2;
                break;

            case "*": res = n1*n2;
                break;
        }
        System.out.printf("%d %s %d = %d", n1, str[1], n2, res);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

