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

    Iterator<Point> getPoints();

    IGameObject withPoint(@NonNull Point point);

    IGameObject withComponent(@NonNull IComponent component);
}