package main.Part3;

public class Wall {
    private Condition wallCondition;
    private Edges edges;
    Measurement measurement;
    private boolean isCurved;
    public Wall(Condition wallCondition, Measurement measurement) {
        this.measurement = measurement;
        this.wallCondition = wallCondition;
        this.setIfCurved();
    }
    public void setIfCurved() {
        this.isCurved = measurement.equals(Measurement.HighQualityLaser)
                && (this.getWallCondition().equals(Condition.FLAT));
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


    public Edges getEdges() {
        return edges;
    }
    public void setEdges(Edges edges) {
        this.edges=edges;
    }

}
