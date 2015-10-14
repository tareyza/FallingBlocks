package com.jjapps.fallingblocks;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * This is the interface for a world.  Worlds are immutable objects which essentially represent
 * a level, managing all objects currently in the game.
 */
public interface IWorld {

    void update();

    @NonNull List<ImmutableGameObject> getObjects();

    @NonNull IGameObjectFactory getObjectFactory();

    @NonNull IPalette getColorPalette();

    double getWidth();

    double getHeight();
}