package com.jjapps.fallingblocks;

import android.graphics.Point;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.Iterator;

/**
 *
 */
public interface IGameObject {

    void update();

    Bounds getBounds();

    void setBounds(@Nullable Bounds bounds);

    IGameObject withComponent(@NonNull IComponent component);
}