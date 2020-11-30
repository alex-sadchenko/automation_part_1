package by.automation.collections.airline.application;

import by.automation.collections.airline.aircraft.Aircraft;
import by.automation.collections.airline.aircraft.CargoAircraft;
import by.automation.collections.airline.aircraft.PassengerAircraft;
import by.automation.collections.airline.models.CargoAircraftModel;
import by.automation.collections.airline.models.PassengerAircraftModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Initialisation {
    public List<Aircraft> initialisePassengerAircraft() {
        List<Aircraft> aircraftList = new ArrayList<>();
        String separator = File.separator;
        File filePassengerAircraft = new File("src" + separator + "main" +
                separator + "resources" + separator + "files" + separator + "PassengerAircraft");

        try (BufferedReader bufferedReaderPassengerAircraft = new BufferedReader( new FileReader(filePassengerAircraft))){

            while (bufferedReaderPassengerAircraft.ready()) {
                String[] parameter = bufferedReaderPassengerAircraft.readLine().split(",");
                String aircraftModel = parameter[0];
                PassengerAircraftModel passengerAircraftModel = PassengerAircraftModel.valueOf(aircraftModel);
                String registrationNumber = parameter[1];

                aircraftList.add(new PassengerAircraft(passengerAircraftModel, registrationNumber));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return aircraftList;
    }

    public List<Aircraft> initialiseCargoAircraft() {
        List<Aircraft> aircraftList = new ArrayList<>();
        String separator = File.separator;
        File fileCargoAircraft = new File("src" + separator + "main" +
                separator + "resources" + separator + "files" + separator + "CargoAircraft");

        try (BufferedReader bufferedReaderCargoAircraft = new BufferedReader( new FileReader(fileCargoAircraft))){

            while (bufferedReaderCargoAircraft.ready()) {
                String[] parameter = bufferedReaderCargoAircraft.readLine().split(",");
                String aircraftModel = parameter[0];
                CargoAircraftModel cargoAircraftModel = CargoAircraftModel.valueOf(aircraftModel);
                String registrationNumber = parameter[1];

                aircraftList.add(new CargoAircraft(cargoAircraftModel, registrationNumber));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return aircraftList;
    }
}