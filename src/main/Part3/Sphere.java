package main.Part3;

public class Sphere {
    private boolean isHollow;
    private Wall innerSurface;
    public void initInnerSurface(Wall wall){
        if ((wall.getWallCondition()== Condition.FLAT))
        if (this.innerSurface == null)
        this.innerSurface=wall;
        else
            System.out.println("У этой сферы уже инициализирована внутренняя поверхность");
        else System.out.println("Эта  стена не может быть внутренней поверхностью сферы");
    }

    public boolean isHollow() {
        return isHollow;
    }

    public void setHollow(boolean hollow) {
        isHollow = hollow;
    }
    public Wall getInnerSurface(){
        return this.innerSurface;
    }

    public void changeInnerSurface(Wall wall)
    {if (wall.getWallCondition() == Condition.FLAT)
        this.innerSurface=wall;
    else System.out.println("Эта  стена не может быть внутренней поверхностью сферы");
    }
}
