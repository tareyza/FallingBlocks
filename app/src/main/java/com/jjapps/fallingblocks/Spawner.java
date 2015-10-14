package com.jjapps.fallingblocks;

import android.support.annotation.NonNull;

/**
 *
 */
public class Spawner implements IGameObjectFactory {

    private final IGameObjectFactory factory;

    public Spawner(IGameObjectFactory factory) {
        this.factory = factory;
    }

    @Override public IGameObject create() {
        return factory.create();
    }

    @Override public IWorld getWorld() {
        return factory.getWorld();
    }

    @Override public void setWorld(@NonNull IWorld world) {
        factory.setWorld(world);
    }

    @Override public String toString() {
        return factory.toString();
    }
}