package by.automation.fundamentals.task2;

//Отобразить в окне консоли аргументы командной строки в обратном порядке.

import InputFromConsole.InputFromConsole;

public class Task2 {
    public static void main(String[] args) {
        InputFromConsole inputFromConsole = new InputFromConsole();
        StringBuffer name = new StringBuffer(inputFromConsole.inputLine("Enter data"));
        System.out.println(name.reverse());
    }
}
