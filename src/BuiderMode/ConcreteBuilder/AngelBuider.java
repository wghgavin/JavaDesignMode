package BuiderMode.ConcreteBuilder;

import BuiderMode.Builder;

public class AngelBuider extends Builder {
    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("原型");
    }
}
