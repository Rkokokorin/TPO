package main.Part3;

public class Wall {
    private Condition wallCondition;
    private Edges edges;
    private boolean isCurved;
    public Wall(Condition wallCondition) {
        this.wallCondition = wallCondition;
        this.setCurved(true);
    }
    public Condition getWallCondition() {
        return wallCondition;
    }
    public void setWallCondition(Condition wallCondition) {
        this.wallCondition = wallCondition;
    }
    public boolean isCurved() {
        return isCurved;
    }
    public void setCurved(boolean curved) {
        isCurved = curved;
    }

    public Edges getEdges() {
        return edges;
    }
    public void setEdges(Edges edges) {
        this.edges=edges;
    }

}
