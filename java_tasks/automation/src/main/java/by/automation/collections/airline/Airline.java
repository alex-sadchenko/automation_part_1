package by.automation.collections.airline;

import by.automation.collections.airline.aircraft.Aircraft;
import by.automation.collections.airline.aircraft.CargoAircraft;
import by.automation.collections.airline.aircraft.PassengerAircraft;

import java.util.*;
import java.util.stream.Collectors;

public class Airline {
    List <Aircraft> aircraftList;

    public Airline(){

    }

    public Airline(List<Aircraft> aircraftList) {
        this.aircraftList = aircraftList;
    }

    public void sortByMaxRange(){
        aircraftList.sort(Comparator.comparingInt(Aircraft::getRangeKilometers));
    }

    public int calculateTotalCapacity(){
        return aircraftList.stream().filter(x -> x instanceof PassengerAircraft)
                .mapToInt(x -> ((PassengerAircraft) x).getPassengerCapacity()).sum();
    }

    public int calculateTotalLoad(){
        return aircraftList.stream().filter(x -> x instanceof CargoAircraft)
                .mapToInt(x -> ((CargoAircraft) x).getMaxLoadKilograms()).sum();
    }

    public void print(){
        for (Aircraft aircraft : aircraftList) {
            System.out.println(aircraft);
        }
    }

    public List<Aircraft> findAircraft(int numberFrom, int numberTo){
        return aircraftList.stream()
                .filter(x -> x.getFuelConsumptionKgPerOur() >= numberFrom)
                .filter(x -> x.getFuelConsumptionKgPerOur() <= numberTo)
                .collect(Collectors.toList());
    }
}
