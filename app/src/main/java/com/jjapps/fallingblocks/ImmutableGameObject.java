package com.jjapps.fallingblocks;

import android.graphics.Point;
import android.support.annotation.NonNull;

/**
 *
 */
public class ImmutableGameObject extends GameObjectDecorator {

    private static final String TAG = "[IMMUTABLE] ";

    public ImmutableGameObject(@NonNull IGameObject object) {
        super(object);
    }

    @Override public IGameObject withPoint(@NonNull Point bounds) {
        throw new UnsupportedOperationException("This Object, " + this + ", is immutable");
    }

    @Override public IGameObject withComponent(@NonNull IComponent component) {
        throw new UnsupportedOperationException("This Object, " + this + ", is immutable");
    }

    @Override public String toString() {
        return TAG + super.toString();
    }
}