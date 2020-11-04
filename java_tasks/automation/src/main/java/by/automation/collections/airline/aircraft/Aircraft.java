package by.automation.collections.airline.aircraft;

import java.util.Objects;

public class Aircraft {
    private int rangeKilometers;
    private int fuelConsumptionKgPerOur;

    public Aircraft(){

    }

    public Aircraft(int rangeKilometers, int fuelConsumptionKgPerOur) {
        this.rangeKilometers = rangeKilometers;
        this.fuelConsumptionKgPerOur = fuelConsumptionKgPerOur;
    }

    public int getRangeKilometers() {
        return rangeKilometers;
    }

    public int getFuelConsumptionKgPerOur() {
        return fuelConsumptionKgPerOur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return rangeKilometers == aircraft.rangeKilometers &&
                fuelConsumptionKgPerOur == aircraft.fuelConsumptionKgPerOur;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rangeKilometers, fuelConsumptionKgPerOur);
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "rangeKilometers=" + rangeKilometers +
                ", fuelConsumptionKgPerOur=" + fuelConsumptionKgPerOur +
                '}';
    }
}
