package com.javarush.task.task24.task2413;

public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height){
        this.width = width;
        this.height = height;
        matrix = new char[height + 2][width + 2];
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public char[][] getMatrix(){
        return matrix;
    }

    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setMatrix(char[][] matrix){
        this.matrix = matrix;
    }
/*     метод - setPoint будет "ставить точку в координатах x,y цветом c".    */
    public void setPoint(double x, double y, char c){
        int intX = (int) Math.round(x);
        int intY = (int) Math.round(y);
        matrix[intY][intX] = c;
        if (x < 0 || y < 0 || y >= matrix.length || x >= matrix[0].length){return;}
    }
    /*        метод - drawMatrix копирует переданную ему картинку (матрицу) в матрицу Canvas.    */
    public void drawMatrix(double x, double y, int[][] matrix, char c){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] != 0){
                    setPoint(x+j, y+i, c);
                }
            }
        }
    }

    public void clear(){
        matrix = new char[height + 2][width + 2];
    }
    public void print(){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}