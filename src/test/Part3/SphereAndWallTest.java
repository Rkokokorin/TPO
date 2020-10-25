package test.Part3;

import main.Part3.Condition;
import main.Part3.Sphere;
import main.Part3.Wall;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SphereAndWallTest {


    @Test
    void initInnerSurfaceIfWallIsFlat() {
        Wall wall = new Wall(Condition.FLAT);
        Sphere sphere = new Sphere();
        sphere.initInnerSurface(wall);
        assertEquals(wall,sphere.getInnerSurface());
    }
    @Test
    void initInnerSurfaceIfWallIsNotFlat() {
        Wall wall = new Wall(Condition.BUMPY);
        Sphere sphere = new Sphere();
        sphere.initInnerSurface(wall);
        assertNull(sphere.getInnerSurface());
    }
    @Test
    void initInnerSurfaceIfWallIsAlreadySet() {
        Wall wall = new Wall(Condition.FLAT);
        Wall wall1 = new Wall(Condition.FLAT);
        Sphere sphere = new Sphere();
        sphere.initInnerSurface(wall);
        sphere.initInnerSurface(wall1);
        assertEquals(wall,sphere.getInnerSurface());
    }

    @Test
    void isHollow() {
        Sphere sphere = new Sphere();
        sphere.setHollow(true);
        assertTrue(sphere.isHollow());
    }
    @Test
    void changeInnerSurface() {
        Wall wall = new Wall(Condition.FLAT);
        Wall wall1 = new Wall(Condition.FLAT);
        Sphere sphere = new Sphere();
        sphere.initInnerSurface(wall);
        sphere.changeInnerSurface(wall1);
        assertEquals(wall1,sphere.getInnerSurface());
    }
    @Test
    void changeInnerSurfaceIfWallIsNotFlat() {

        Wall wall1 = new Wall(Condition.CONVEX);
        Sphere sphere = new Sphere();
        sphere.changeInnerSurface(wall1);
        assertNull(sphere.getInnerSurface());
    }
    @Test
    void setWallCondition() {
        Wall wall = new Wall(Condition.FLAT);
        wall.setWallCondition(Condition.BUMPY);
        assertEquals(wall.getWallCondition(),Condition.BUMPY);
    }
}