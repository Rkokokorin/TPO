package test;

import main.CosExpansion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;




class CosExpansionTest {
    private static final double DELTA = 1e-6;
    private static final double EPSILON = 1e-3;

    @Test
    void testZero() {
        assertEquals(Math.cos(0), CosExpansion.expanse(0), DELTA);
    }
    @Test
    void testZeroMinusEpsilon() {
        assertEquals(Math.cos(-EPSILON), CosExpansion.expanse(-EPSILON), DELTA);
    }
    @Test
    void testZeroPlusEpsilon() {
        assertEquals(Math.cos(EPSILON), CosExpansion.expanse(EPSILON), DELTA);
    }

    @Test
    void testMinusPI() {
        assertEquals(Math.cos(-Math.PI), CosExpansion.expanse(-Math.PI), DELTA);
    }
    @Test
    void testMinusPIMinusEpsilon() {
        assertEquals(Math.cos(-Math.PI-EPSILON), CosExpansion.expanse(-Math.PI-EPSILON), DELTA);
    }
    @Test
    void testMinusPIPlusEpsilon() {
        assertEquals(Math.cos(-Math.PI+EPSILON), CosExpansion.expanse(-Math.PI+EPSILON), DELTA);
    }

    @Test
    void testPI() {
        assertEquals(Math.cos(Math.PI), CosExpansion.expanse(Math.PI), DELTA);
    }
    @Test
    void testPIMinusEpsilon() {
        assertEquals(Math.cos(Math.PI-EPSILON), CosExpansion.expanse(Math.PI-EPSILON), DELTA);
    }
    @Test
    void testPIPlusEpsilon() {
        assertEquals(Math.cos(Math.PI+EPSILON), CosExpansion.expanse(Math.PI+EPSILON), DELTA);
    }

    @Test
    void testHalfPi() {
        assertEquals(Math.cos(Math.PI/2), CosExpansion.expanse(Math.PI/2), DELTA);
    }

    @Test
    void testMinusHalfPi() {
        assertEquals(Math.cos(-Math.PI/2), CosExpansion.expanse(-Math.PI/2), DELTA);
    }

    @Test
    void testMinusHalfOne() {
        assertEquals(Math.cos(-0.5), CosExpansion.expanse(-0.5), DELTA);
    }
    @Test
    void testQuoterOfPlusDecrease() {
        assertEquals(Math.cos(1.04), CosExpansion.expanse(1.04), DELTA);
    }
    @Test
    void testThirdQuoterOfPlusDecrease() {
        assertEquals(Math.cos(2.09), CosExpansion.expanse(2.09), DELTA);
    }
    @Test
    void testQuoterOfMinusIncrease() {
        assertEquals(Math.cos(-1.04), CosExpansion.expanse(-1.04), DELTA);
    }
    @Test
    void testThirdQuoterOfMinusIncrease() {
        assertEquals(Math.cos(-2.09), CosExpansion.expanse(-2.09), DELTA);
    }


}