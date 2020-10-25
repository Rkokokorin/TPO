package main.Part3;

public class Measurement {
    private final TypesOfMeasurement measurementType;

    public Measurement(TypesOfMeasurement measurementType) {
        this.measurementType = measurementType;
    }

    public TypesOfMeasurement getMeasurementType() {
        return measurementType;
    }

    public boolean measureIfWallIsCurved(Wall wall){
        return (wall.isCurved()) && (this.getMeasurementType().equals(TypesOfMeasurement.HighQualityLaser));

    }

}
