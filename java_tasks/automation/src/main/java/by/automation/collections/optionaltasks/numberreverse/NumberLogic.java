package by.automation.collections.optionaltasks.numberreverse;

import java.util.Stack;

public class NumberLogic {
    public Stack<Integer> splitNumber(int number) {
        Stack<Integer> digitStack = new Stack<>();
        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            digitStack.push(digit);
        }
        return digitStack;
    }

    public int numberReverse(Stack<Integer> stack) {
        int multiplier = 1;
        int number = 0;
        while (!stack.isEmpty()) {
            int numberFromStack = stack.pop() * multiplier;
            number = numberFromStack + number;
            multiplier *= 10;
        }
        return number;
    }
}