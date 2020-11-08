package test.Part3;
import main.Part3.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
class SphereAndWallTest {
    Sphere sphere;
    Wall wall;
    @BeforeEach
    void initSphere() {
        sphere = new Sphere(true);
        wall = new Wall(Condition.FLAT, Measurement.HighQualityLaser);
        sphere.initInnerSurface(wall);
    }
    @AfterEach
    void printPhrase(){
        System.out.println("Тест Завершен");
    }
    @Test
    void initInnerSurfaceIfWallIsFlat() {
        assertEquals(wall,sphere.getInnerSurface());
    }

    @Test
    void initInnerSurfaceIfWallIsAlreadySet() {
        Wall wall1 = new Wall(Condition.FLAT,Measurement.HighQualityLaser);
        sphere.initInnerSurface(wall1);
        assertEquals(wall,sphere.getInnerSurface());
    }
    @Test
    void isHollow() {
        sphere.setHollow(true);
        assertTrue(sphere.isHollow());
    }
    @Test
    void changeInnerSurface() {
        Wall wall1 = new Wall(Condition.FLAT,Measurement.HighQualityLaser);
        sphere.changeInnerSurface(wall1);
        assertEquals(wall1,sphere.getInnerSurface());
    }
    @Test
    void changeInnerSurfaceIfWallIsNotFlat() {
        sphere.deleteInnerSurface();
        Wall wall1 = new Wall(Condition.CONVEX,Measurement.HighQualityLaser);
        sphere.changeInnerSurface(wall1);
        assertNull(sphere.getInnerSurface());
    }
    @Test
    void wallCondition() {
        wall.setWallCondition(Condition.BUMPY);
        assertEquals(wall.getWallCondition(),Condition.BUMPY);
    }
    @Test
    void isCurved() {
        wall.setIfCurved();
        assertTrue(wall.isCurved());
    }
    @Test
    void getEdges() {
        Edges edges = new Edges(5,1);
        wall.setEdges(edges);
        assertEquals(edges,wall.getEdges());
    }
    @Test
    void deleteInnerSurface() {
        sphere.deleteInnerSurface();
        assertNull(sphere.getInnerSurface());

    }
    @ParameterizedTest
    @EnumSource(
            value = Condition.class,
            names = {"FLAT"},
            mode = EnumSource.Mode.EXCLUDE)
    void initInnerSurfaceIfWallIsNotFlat(Condition condition) {
        sphere.deleteInnerSurface();
        wall.setWallCondition(condition);
        sphere.changeInnerSurface(wall);
        assertNull(sphere.getInnerSurface());
    }

}
