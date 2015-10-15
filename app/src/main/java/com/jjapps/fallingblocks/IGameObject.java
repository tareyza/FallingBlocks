package com.jjapps.fallingblocks;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 *
 */
public interface IGameObject {

    void update();

    Bounds getBounds();

    IGameObject withBounds(@Nullable Bounds bounds);

    IGameObject withComponent(@NonNull IComponent component);
}
