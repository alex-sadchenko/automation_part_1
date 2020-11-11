package by.automation.fundamentals.maintasks;

//Отобразить в окне консоли аргументы командной строки в обратном порядке.

import by.automation.fundamentals.input.InputFromConsole;

public class InputReverse {
    public static void main(String[] args) {
        InputFromConsole inputFromConsole = new InputFromConsole();
        StringBuffer name = new StringBuffer(inputFromConsole.inputLine("Enter data"));
        System.out.println(name.reverse());
    }
}
