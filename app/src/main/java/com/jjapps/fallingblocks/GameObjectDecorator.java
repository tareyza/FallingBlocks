package com.jjapps.fallingblocks;

import android.graphics.Point;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.Iterator;

/**
 *
 */
public class GameObjectDecorator implements IGameObject {

    private IGameObject object;

    public GameObjectDecorator(IGameObject object) {
        this.object = object;
    }

    @Override public void update() {
        object.update();
    }

    @Override public Iterator<Point> getPoints() {
        return object.getPoints();
    }

    @Override public IGameObject withPoint(@NonNull Point point) {
        return object.withPoint(point);
    }

    @Override public IGameObject withComponent(@NonNull IComponent component) {
        return object.withComponent(component);
    }

    @Override public String toString() {
        return object.toString();
    }
}
