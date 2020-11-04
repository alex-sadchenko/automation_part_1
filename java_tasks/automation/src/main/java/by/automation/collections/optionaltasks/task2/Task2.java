package by.automation.collections.optionaltasks.task2;

import InputFromConsole.InputFromConsole;

//Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке
public class Task2 {
    public static void main(String[] args) {
        InputFromConsole inputFromConsole = new InputFromConsole();
        NumberLogic numberLogic = new NumberLogic();
        System.out.println(numberLogic.numberReverse(numberLogic
                .splitNumber(inputFromConsole.inputNumber("Enter number"))));
    }
}
