package by.automation.fundamentals.optionaltasks;

import by.automation.fundamentals.input.InputFromConsole;

import java.util.Arrays;
import java.util.Comparator;

public class MatrixLogic {

    public void printMatrix(int[][] matrix) {
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.printf("%5d", j);
            }
            System.out.println();
        }
    }

    public void sortByColumn(int[][] matrix) {

        int columnForSorting = new InputFromConsole().inputNumber("Enter column for sorting");
        while (columnForSorting > matrix.length || columnForSorting < 1) {
            columnForSorting = new InputFromConsole().inputNumber("Enter number within then matrix size");
        }

        int finalColumnForSorting = columnForSorting - 1;
        Arrays.sort(matrix, Comparator.comparing(x -> x[finalColumnForSorting]));
    }

    public void sortByRow(int[][] matrix) {
        int columnForSorting = new InputFromConsole().inputNumber("Enter row for sorting");
        while (columnForSorting > matrix.length || columnForSorting < 1) {
            columnForSorting = new InputFromConsole().inputNumber("Enter number within then matrix size");
        }

        swapMatrixSides(matrix);

        int finalColumnForSorting = columnForSorting - 1;
        Arrays.sort(matrix, Comparator.comparing(x -> x[finalColumnForSorting]));

        swapMatrixSides(matrix);
    }

    public void swapMatrixSides(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void ascendingInRow(int[][] matrix) {
        int[] array = new int[0];
        int count = 0;
        int increasingNum = 0;

        for (int[] ints : matrix) {
            for (int j = 1; j < ints.length; j++) {

                if (ints[j - 1] + 1 == ints[j]) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == 1) {
                    count++;
                }
                if (count > increasingNum) {
                    increasingNum = count;
                    array = new int[increasingNum];
                    int a = (j + 1) - count; //вычисляет начало вставки возрастающих чисел
                    for (int k = 0; k < increasingNum; k++) {
                        array[k] = ints[a++];
                    }
                }
            }
        }

        System.out.println("The biggest number of ascending matrix elements = " + increasingNum);
        System.out.println(Arrays.toString(array));
    }

    public void descendingInRow(int[][] matrix) {
        int[] array = new int[0];
        int count = 0;
        int decreasingNum = 0;

        for (int[] ints : matrix) {
            for (int j = 1; j < ints.length; j++) {
                if (ints[j - 1] - 1 == ints[j]) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == 1) {
                    count++;
                }
                if (count > decreasingNum) {
                    decreasingNum = count;
                    array = new int[decreasingNum];
                    int a = (j + 1) - count;
                    for (int k = 0; k < decreasingNum; k++) {
                        array[k] = ints[a++];
                    }
                }
            }
        }

        System.out.println("The biggest number of descending matrix elements = " + decreasingNum);
        System.out.println(Arrays.toString(array));
    }
}
