package main.Part3;

public class Wall {

    private Condition wallCondition;


    public Wall(Condition wallCondition) {
        this.wallCondition = wallCondition;
    }

    public Condition getWallCondition() {
        return wallCondition;
    }

    public void setWallCondition(Condition wallCondition) {
        this.wallCondition = wallCondition;
    }
}
