package test.Part3;

import main.Part3.Condition;
import main.Part3.Sphere;
import main.Part3.Wall;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class SphereTest {

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
    void isHollow() {
        Sphere sphere = new Sphere();
        sphere.setHollow(true);
        assertTrue(sphere.isHollow());
    }


    @Test
    void changeInnerSurface() {
    }
}