package by.automation.collections.airline.aircraft;

import by.automation.collections.airline.models.CargoAircraftModel;

import java.util.Objects;

public class CargoAircraft extends Aircraft {
    CargoAircraftModel cargoAircraftModel;
    int maxLoadKilograms;
    private String aircraftRegistrationNumber;

    public CargoAircraft() {
    }

    public CargoAircraft(CargoAircraftModel cargoAircraftModel, String aircraftRegistrationNumber) {
        super(cargoAircraftModel.getRangeKilometers(), cargoAircraftModel.getFuelConsumptionKgPerOur());
        this.cargoAircraftModel = cargoAircraftModel;
        this.maxLoadKilograms = cargoAircraftModel.getMaxLoadKilograms();
        this.aircraftRegistrationNumber = aircraftRegistrationNumber;
    }

    public int getMaxLoadKilograms() {
        return maxLoadKilograms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoAircraft that = (CargoAircraft) o;
        return maxLoadKilograms == that.maxLoadKilograms &&
                cargoAircraftModel == that.cargoAircraftModel &&
                Objects.equals(aircraftRegistrationNumber, that.aircraftRegistrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cargoAircraftModel, maxLoadKilograms, aircraftRegistrationNumber);
    }

    @Override
    public String toString() {
        return "CargoAircraft{" +
                cargoAircraftModel +
                ", rangeKilometers = " + getRangeKilometers() +
                ", fuelConsumptionKgPerOur = " + getFuelConsumptionKgPerOur() +
                ", maxLoadKilograms() = " + maxLoadKilograms +
                ", aircraftRegistrationNumber = " + aircraftRegistrationNumber + '}';
    }
}
