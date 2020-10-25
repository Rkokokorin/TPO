package test.Part3;
import main.Part3.Condition;
import main.Part3.Measurement;
import main.Part3.TypesOfMeasurement;
import main.Part3.Wall;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class MeasurementTest {
    @Test
    void getMeasurementType() {
        Measurement measurement = new Measurement(TypesOfMeasurement.LowQualityLaser);
        assertEquals(TypesOfMeasurement.LowQualityLaser, measurement.getMeasurementType());
    }

    @Test
    void testMeasurePositive() {
        Wall wall = new Wall(Condition.FLAT);
        Measurement measurement = new Measurement(TypesOfMeasurement.HighQualityLaser);
        assertTrue(measurement.measureIfWallIsCurved(wall));
    }

    @Test
    void testMeasureIfWallIsNotCurved() {
        Wall wall = new Wall(Condition.FLAT);
        wall.setCurved(false);
        Measurement measurement = new Measurement(TypesOfMeasurement.HighQualityLaser);
        assertFalse(measurement.measureIfWallIsCurved(wall));
    }
    @Test
    void testMeasureIfMeasurementIsOther() {
        Wall wall = new Wall(Condition.FLAT);
        Measurement measurement = new Measurement(TypesOfMeasurement.OnEye);
        assertFalse(measurement.measureIfWallIsCurved(wall));
    }
}
