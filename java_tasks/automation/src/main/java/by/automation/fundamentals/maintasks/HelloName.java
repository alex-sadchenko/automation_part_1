package by.automation.fundamentals.maintasks;

//Приветствовать любого пользователя при вводе его имени через командную строку

import by.automation.fundamentals.input.InputFromConsole;

public class HelloName {
    public static void main(String[] args) {
        InputFromConsole inputFromConsole = new InputFromConsole();
        System.out.println("Hello " + inputFromConsole.inputLine("Enter your name"));
    }
}
