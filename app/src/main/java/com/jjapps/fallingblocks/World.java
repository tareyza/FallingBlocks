package com.jjapps.fallingblocks;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class World implements IWorld {

    private final double width, height;
    private final List<ImmutableGameObject> objects;
    private final IGameObjectFactory factory;
    private final IPalette palette;

    public World(double width, double height, IGameObjectFactory factory, IPalette palette) {
        this.width = width;
        this.height = height;
        this.factory = factory;
        this.palette = palette;
        this.objects = new ArrayList<>();
    }

    @Override public void update() {
        ImmutableGameObject nObject = new ImmutableGameObject(factory.create());
        if (nObject != null)
            objects.add(nObject);
        for (ImmutableGameObject object : objects) {
            object.update();
        }
    }

    @Override public List<ImmutableGameObject> getObjects() {
        return new ArrayList<>(this.objects);
    }

    @Override public IGameObjectFactory getObjectFactory() {
        return factory;
    }

    @Override public IPalette getColorPalette() {
        return palette;
    }

    @Override public double getWidth() {
        return width;
    }

    @Override public double getHeight() {
        return height;
    }

    @Override public String toString() {
        return String.format("World with dimensions: (%f,%f), objects: " + objects + "factory: " + factory + "and palette: " + palette, width, height);
    }
}