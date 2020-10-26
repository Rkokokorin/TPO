package main.Part3;
public class Edges {
    private boolean areClamped;
    private int number;
    private int clampingTime;
    public Edges(int num, int time) {
        areClamped=false;
        number=num;
        clampingTime =time;
    }
    public void clampEdges() throws InterruptedException {
        Thread.sleep(clampingTime*1000);
        areClamped=true;
    }
    public int getClampingTime() {
        return clampingTime;
    }
    public void setClampingTime(int clampingTime) {
        this.clampingTime = clampingTime;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public boolean areClamped() {
        return areClamped;
    }
}
