package by.automation.fundamentals.maintasks;

//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и
// вывести результат на консоль.

import by.automation.fundamentals.input.InputFromConsole;

public class NumbersSum {
    public static void main(String[] args) {
        InputFromConsole inputFromConsole = new InputFromConsole();
        int a = inputFromConsole.inputNumber("Enter number");
        int b = inputFromConsole.inputNumber("Enter number");
        int result = a + b;

        System.out.println("Sum of numbers = " + result);
    }
}
