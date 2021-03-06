package planes;

import classifications.MilitaryType;
import java.util.Objects;

public class MilitaryPlane extends Plane{

    private MilitaryType militaryType;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity,
                         MilitaryType militaryType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryType = militaryType;
    }

    public MilitaryType getMilitaryType() {
        return militaryType;
    }

    @Override
    public String toString() {
        return "MilitaryPlane{" +
                "model='" + super.getModel() + '\'' +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", maxFlightDistance=" + super.getMaxFlightDistance() +
                ", maxLoadCapacity=" + super.getMaxLoadCapacity() +
                ", militaryType=" + militaryType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane militaryPlane = (MilitaryPlane) o;
        return militaryType == militaryPlane.militaryType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryType);
    }
}
