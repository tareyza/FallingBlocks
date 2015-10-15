package com.jjapps.fallingblocks;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

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

    @Override public Bounds getBounds() {
        return object.getBounds();
    }

    @Override public IGameObject withBounds(@Nullable Bounds bounds) {
        return object.withBounds(bounds);
    }

    @Override public IGameObject withComponent(@NonNull IComponent component) {
        return object.withComponent(component);
    }

    @Override public String toString() {
        return object.toString();
    }
}
