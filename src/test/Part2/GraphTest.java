package test.Part2;
import main.Part2.Graph;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class GraphTest {
    @Test
    void testEmptyGraph(){
        Graph g = new Graph(0);
        assertEquals("", g.BFS(0));
    }

    @Test
    void testOneVertexGraph(){
        Graph g = new Graph(1);
        assertEquals("0", g.BFS(0));
    }

    @Test
    void testThreeVertexGraphFromZero(){
        Graph g = new Graph(3);
        g.addBidirectionalEdge(0, 1);
        g.addBidirectionalEdge(1, 2);

        assertEquals("0 1 2", g.BFS(0));
    }
    @Test
    void testThreeVertexGraph(){
        Graph g = new Graph(3);
        g.addEdge(0, 1);
        g.addEdge(1, 2);

        assertEquals("2", g.BFS(2));
    }

    @Test
    void testThreeVertexGraphFromOne(){
        Graph g = new Graph(3);
        g.addBidirectionalEdge(0, 1);
        g.addBidirectionalEdge(1, 2);

        assertEquals("1 0 2", g.BFS(1));
    }
    @Test
    void testOrientedThreeVertexGraphFromOne(){
        Graph g = new Graph(3);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);

        assertEquals("0 1 2", g.BFS(0));
    }

    @Test
    void testEightVertexGraph(){
        Graph g = new Graph(8);
        g.addBidirectionalEdge(0, 1);
        g.addBidirectionalEdge(0, 4);
        g.addBidirectionalEdge(1, 3);
        g.addBidirectionalEdge(1, 5);
        g.addBidirectionalEdge(1, 6);
        g.addBidirectionalEdge(2, 6);
        g.addBidirectionalEdge(3, 7);
        g.addBidirectionalEdge(4, 6);
        g.addBidirectionalEdge(6, 7);

        assertEquals("0 1 4 3 5 6 7 2", g.BFS(0));
    }
}
