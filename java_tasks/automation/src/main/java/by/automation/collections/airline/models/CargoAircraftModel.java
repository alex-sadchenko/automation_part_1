package by.automation.collections.airline.models;

public enum CargoAircraftModel {
    AIRBUS_330_200F(7400, 5900, 61000),
    BOEING_747_8F(8130, 10200, 140000),
    BOEING_777F(9040, 7000, 103000);

    int rangeKilometers;
    int fuelConsumptionKgPerOur;
    int maxLoadKilograms;

    CargoAircraftModel(int rangeKilometers, int fuelConsumptionKgPerOur,
                       int maxLoadKilograms) {
        this.rangeKilometers = rangeKilometers;
        this.fuelConsumptionKgPerOur = fuelConsumptionKgPerOur;
        this.maxLoadKilograms = maxLoadKilograms;
    }

    public int getRangeKilometers() {
        return rangeKilometers;
    }

    public int getFuelConsumptionKgPerOur() {
        return fuelConsumptionKgPerOur;
    }

    public int getMaxLoadKilograms() {
        return maxLoadKilograms;
    }
}
