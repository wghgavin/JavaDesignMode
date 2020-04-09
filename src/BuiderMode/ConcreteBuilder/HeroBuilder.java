package BuiderMode.ConcreteBuilder;

import BuiderMode.Builder;

public class HeroBuilder extends Builder {
    @Override
    public void buildType() {
        actor.setType("Hero");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("方");
    }
}
