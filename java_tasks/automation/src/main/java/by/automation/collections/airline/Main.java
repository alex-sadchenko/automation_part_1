package by.automation.collections.airline;

import by.automation.collections.airline.aircraft.Aircraft;
import by.automation.collections.airline.application.Application;
import by.automation.collections.airline.application.Initialisation;

import java.util.ArrayList;
import java.util.List;

//Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию. Посчитать общую
//вместимость и грузоподъемность. Провести сортировку самолетов компании по дальности полета.
//Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.

public class Main {
    public static void main(String[] args) {
        Initialisation initialisation = new Initialisation();
        List<Aircraft> aircraftList = new ArrayList<>();

        aircraftList.addAll(initialisation.initialisePassengerAircraft());
        aircraftList.addAll(initialisation.initialiseCargoAircraft());

        Airline airline = new Airline(aircraftList);
        Application application = new Application();

        application.Menu();
        application.Start(airline);
    }
}
