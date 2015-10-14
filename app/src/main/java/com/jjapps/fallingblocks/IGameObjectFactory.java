package com.jjapps.fallingblocks;

import android.support.annotation.NonNull;

/**
 *
 */
public interface IGameObjectFactory {

    IGameObject create();

    IWorld getWorld();

    void setWorld(@NonNull IWorld world);
}