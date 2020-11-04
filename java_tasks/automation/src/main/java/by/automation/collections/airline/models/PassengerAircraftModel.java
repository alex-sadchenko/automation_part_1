package by.automation.collections.airline.models;

public enum PassengerAircraftModel {
    AIRBUS_A350_900(15000, 315, 5800, 55000),
    AIRBUS_A330_300(11300, 295, 5900,51000),
    AIRBUS_A321(5900, 185, 2700, 21200),
    AIRBUS_A320(6100,150, 2500, 16600),
    BOEING_B747_300(10300,412, 11300, 68600),
    BOEING_B777_200(14200, 301, 6700, 51200),
    BOEING_B737_800(5400, 180, 2500, 20500),
    BOMBARDIER_DASH8_Q400(2500, 70, 1060, 8700),
    BOMBARDIER_CRJ_100(1800, 50, 1100, 4500),
    ATR_72_500(1500, 70, 660, 7000);

    private int rangeKilometers;
    private int passengerCapacity;
    private int fuelConsumptionKgPerOur;
    private int maxCommercialLoadKilograms;


    PassengerAircraftModel(int rangeKilometers, int passengerCapacity, int fuelConsumptionKgPerOur,
                           int maxCommercialLoadKilograms) {
        this.rangeKilometers = rangeKilometers;
        this.passengerCapacity = passengerCapacity;
        this.fuelConsumptionKgPerOur = fuelConsumptionKgPerOur;
        this.maxCommercialLoadKilograms = maxCommercialLoadKilograms;
    }

    public int getRangeKilometers() {
        return rangeKilometers;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getFuelConsumptionKgPerOur() {
        return fuelConsumptionKgPerOur;
    }

    public int getMaxCommercialLoadKilograms() {
        return maxCommercialLoadKilograms;
    }
}
