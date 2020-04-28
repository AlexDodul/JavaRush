package com.javarush.task.task23;

public class Test {
    public static void main(String... args){
        Integer number = 123;

        // Бинарный формат числа
        String convert = Integer.toBinaryString(number);
        System.out.println(convert);

        // Восьмиричная форма
        convert = Integer.toOctalString(number);
        System.out.println(convert);

        // Шеснадцатиричная форма
        convert = Integer.toHexString(number);
        System.out.println(convert);

        int[][] matrix = new int[5][7];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = i+j;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
