package by.automation.fundamentals.task4;

//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и
// вывести результат на консоль.

import InputFromConsole.InputFromConsole;

public class Task4 {
    public static void main(String[] args) {
        InputFromConsole inputFromConsole = new InputFromConsole();
        int a = inputFromConsole.inputNumber("Enter number");
        int b = inputFromConsole.inputNumber("Enter number");
        int result = a + b;

        System.out.println("Sum of numbers = " + result);
    }
}
