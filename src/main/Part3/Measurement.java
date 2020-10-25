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
        return this.getMeasurementType() == TypesOfMeasurement.HighQualityLaser;

    }

}
