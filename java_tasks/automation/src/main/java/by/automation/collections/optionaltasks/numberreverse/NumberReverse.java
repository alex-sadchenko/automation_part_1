package by.automation.collections.optionaltasks.numberreverse;

import by.automation.fundamentals.input.InputFromConsole;

//Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке
public class NumberReverse {
    public static void main(String[] args) {
        InputFromConsole inputFromConsole = new InputFromConsole();
        NumberLogic numberLogic = new NumberLogic();
        System.out.println(numberLogic.numberReverse(numberLogic
                .splitNumber(inputFromConsole.inputNumber("Enter number"))));
    }
}
