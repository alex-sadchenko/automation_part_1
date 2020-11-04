package by.automation.collections.airline.aircraft;

import by.automation.collections.airline.models.PassengerAircraftModel;

import java.util.Objects;

public class PassengerAircraft extends Aircraft {

    private PassengerAircraftModel passengerAircraftModel;
    private int passengerCapacity;
    private int maxCommercialLoadKilograms;
    private String aircraftRegistrationNumber;

    public PassengerAircraft() {
        super();
    }

    public PassengerAircraft(PassengerAircraftModel passengerAircraftModel, String aircraftRegistrationNumber) {
        super(passengerAircraftModel.getRangeKilometers(), passengerAircraftModel.getFuelConsumptionKgPerOur());
        this.passengerAircraftModel = passengerAircraftModel;
        this.passengerCapacity = passengerAircraftModel.getPassengerCapacity();
        this.maxCommercialLoadKilograms = passengerAircraftModel.getMaxCommercialLoadKilograms();
        this.aircraftRegistrationNumber = aircraftRegistrationNumber;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerAircraft that = (PassengerAircraft) o;
        return passengerCapacity == that.passengerCapacity &&
                maxCommercialLoadKilograms == that.maxCommercialLoadKilograms &&
                passengerAircraftModel == that.passengerAircraftModel &&
                Objects.equals(aircraftRegistrationNumber, that.aircraftRegistrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerAircraftModel, passengerCapacity, aircraftRegistrationNumber, maxCommercialLoadKilograms);
    }

    @Override
    public String toString() {
        return "PassengerAircraft{" +
                passengerAircraftModel +
                ", rangeKilometers = " + getRangeKilometers() +
                ", fuelConsumptionKgPerOur = " + getFuelConsumptionKgPerOur() +
                ", maxCommercialLoadKilograms = " + maxCommercialLoadKilograms +
                ", passengerCapacity = " + passengerCapacity +
                ", aircraftRegistrationNumber = " + aircraftRegistrationNumber + '}';
    }
}
