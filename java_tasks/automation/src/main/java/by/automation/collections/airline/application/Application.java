package by.automation.collections.airline.application;

import by.automation.fundamentals.input.InputFromConsole;
import by.automation.collections.airline.Airline;

public class Application {

    public void Menu() {
        System.out.println("Airline");
        System.out.println("To see all aircraft enter 1");
        System.out.println("To see sorted aircraft by max range enter 2");
        System.out.println("To see total capacity total commercial load of all aircraft enter 3");
        System.out.println("To find an aircraft that matches entered parameters of " +
                "fuel consumption enter 4");
    }

    public void Start(Airline airline) {

        InputFromConsole inputFromConsole = new InputFromConsole();

        switch (inputFromConsole.inputNumber("Enter number")) {
            case 1:
                airline.print();
                break;
            case 2:
                airline.sortByMaxRange();
                airline.print();
                break;
            case 3:
                System.out.printf("Total capacity of all aircraft %s \n",
                        airline.calculateTotalCapacity());
                System.out.printf("Total load of all aircraft %s",
                        airline.calculateTotalLoad());
                break;
            case 4:
                System.out.println("Enter range of fuel consumption");
                airline.findAircraft(inputFromConsole.inputNumber("Enter from"),
                        inputFromConsole.inputNumber("Enter to")).forEach(System.out::println);
                break;
            default:
                System.out.println("Incorrect input");
        }
    }
}
