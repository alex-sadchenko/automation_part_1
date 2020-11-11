package by.automation.fundamentals.optionaltasks;
//Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале
//значений от -M до M с помощью генератора случайных чисел (класс Random).
//1.Упорядочить строки матрицы в порядке возрастания значений элементов k-го столбца
//2.Упорядочить столбцы матрицы в порядке возрастания значений элементов k-й строки
//3.Найти и вывести наибольшее число возрастающих элементов матрицы, идущих подряд
//4.Найти и вывести наибольшее число убывающих элементов матрицы, идущих подряд

import by.automation.fundamentals.input.InputFromConsole;

public class MatrixMain {
    public static void main(String[] args) {
        InputFromConsole inputFromConsole = new InputFromConsole();
        int matrixSize = inputFromConsole.inputNumber("Enter matrix size");
        Matrix matrix = new Matrix(matrixSize);
        MatrixLogic matrixLogic = new MatrixLogic();
        matrix.createRandomMatrix();
        matrixLogic.printMatrix(matrix.getMatrix());

        matrixLogic.sortByColumn(matrix.getMatrix());
        matrixLogic.printMatrix(matrix.getMatrix());
        matrixLogic.sortByRow(matrix.getMatrix());
        matrixLogic.printMatrix(matrix.getMatrix());
        matrixLogic.ascendingInRow(matrix.getMatrix());
        matrixLogic.descendingInRow(matrix.getMatrix());
    }
}
