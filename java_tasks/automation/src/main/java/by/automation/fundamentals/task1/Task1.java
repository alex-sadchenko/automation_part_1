package by.automation.fundamentals.task1;

//Приветствовать любого пользователя при вводе его имени через командную строку

import InputFromConsole.InputFromConsole;

public class Task1 {
    public static void main(String[] args) {
        InputFromConsole inputFromConsole = new InputFromConsole();
        System.out.println("Hello " + inputFromConsole.inputLine("Enter your name"));
    }
}
