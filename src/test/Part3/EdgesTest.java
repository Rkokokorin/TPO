package test.Part3;
import main.Part3.Edges;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class EdgesTest {
    @Test
    void clampEdges() throws InterruptedException {
        Edges edges = new Edges(13,3);
        edges.clampEdges();
        assertTrue(edges.areClamped());
    }
    @Test
    void getClampingTime() {
        Edges edges = new Edges(13,1);
        assertEquals(1,edges.getClampingTime());
    }
    @Test
    void getNumber() {
        Edges edges = new Edges(13,10);
        assertEquals(13,edges.getNumber());
    }
    @Test
    void areClamped() {
        Edges edges = new Edges(13,10);
        assertFalse(edges.areClamped());

    }
}