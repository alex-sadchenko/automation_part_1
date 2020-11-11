package by.automation.fundamentals.input;

import java.util.Scanner;

public class InputFromConsole {
    public String inputLine(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    public int inputNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println(message);
        }
        return scanner.nextInt();
    }

    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Enter number");
        }
        return scanner.nextInt();
    }
}
