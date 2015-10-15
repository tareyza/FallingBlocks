package com.jjapps.fallingblocks;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class GameObject implements IGameObject {

    private final IWorld world;
    private final List<IComponent> components;

    private Bounds bounds;

    public GameObject(@NonNull IWorld world) {
        this.world = world;
        components = new ArrayList<>();
    }

    @Override public void update() {
        for (IComponent component : components) {
            component.update(world, this);
        }
    }

    @Override public IGameObject withComponent(@NonNull IComponent component) {
        this.components.add(component);
        return this;
    }

    @Override public Bounds getBounds() {
        return bounds;
    }

    @Override public GameObject withBounds(@Nullable Bounds bounds) {
        this.bounds = bounds;
        return this;
    }

    @Override public String toString() {
        return "GameObject @" + bounds + " with components " + components;
    }
}
