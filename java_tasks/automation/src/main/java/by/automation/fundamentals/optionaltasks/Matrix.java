package by.automation.fundamentals.optionaltasks;

import java.util.Random;

public class Matrix {
    private int row;
    private int column;
    private int[][] matrix;

    public Matrix(int number) {
        if(number > 0) {
            matrix = new int[number][number];
            row = number;
            column = number;
        }else {
            System.out.println("Illegal argument");
        }
    }

    public void createRandomMatrix() {
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(200) - 100;
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
