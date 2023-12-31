package com.javarush.task.task24.task2413;

public class Canvas {
    private int width; //ширина
    private int height; //высота

    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[height + 2][width + 2];
    }


    void setPoint(double x, double y, char c) {
        int x0 = (int) Math.round(x);
        int u0 = (int) Math.round(y);
        if (x0 > 0 || u0 > 0 || u0 <= matrix.length || x0 <= matrix[0].length) {
            matrix[u0][x0] = c;
        }
    }
        //отрисовка матрицы
    void drawMatrix(double x, double y, int[][] matrix, char c) {
        int height = matrix.length;
        int width = matrix[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[i][j] != 0) {
                    setPoint(x + j, y + i, c);
                }
            }
        }
    }

    //очистка матрицы
    void clear() {
        this.matrix = new char[height + 2][width + 2];
    }

    //отрисовка матрицы
    void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }
}
