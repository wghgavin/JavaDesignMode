package BuiderMode;

public abstract class Builder {
    public Actor actor = new Actor();
    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public Actor getActor(){
        buildType();
        buildSex();
        buildFace();
        return this.actor;
    }
}
