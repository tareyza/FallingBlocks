package com.jjapps.fallingblocks;

import android.graphics.Point;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class GameObject implements IGameObject {

    private final IWorld world;
    private final List<IComponent> components;

    private List<Point> points;

    public GameObject(@NonNull IWorld world) {
        this.world = world;
        components = new ArrayList<>();
        points = new ArrayList<>();
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

    @Override public Iterator<Point> getPoints() {
        return points.iterator();
    }

    @Override public GameObject withPoint(@NonNull Point point) {
        this.points.add(point);
        return this;
    }

    @Override public String toString() {
        return "GameObject @{" + points + "} with components " + components;
    }
}