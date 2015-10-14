package com.jjapps.fallingblocks;

import android.support.annotation.NonNull;

/**
 *
 */
public class GameObjectFactory implements IGameObjectFactory {

    private IWorld world;

    public IGameObject create() {
        if (world == null) {
            throw new IllegalStateException("World is null.");
        }
        return new GameObject(world);
    }

    public IWorld getWorld() {
        return world;
    }

    public void setWorld(@NonNull IWorld world) {
        this.world = world;
    }

    @Override public String toString() {
        return "GameObjectFactory with world " + world;
    }
}