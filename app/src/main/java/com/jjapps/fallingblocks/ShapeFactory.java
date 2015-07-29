package com.jjapps.fallingblocks;

import android.graphics.drawable.ShapeDrawable;

/**
 * Created by jagen31 on 7/29/15.
 */
public interface ShapeFactory {

    FallingShape getRectangle(float width, float height);

    FallingShape getTriangle(float width, float height);

    FallingShape getOval(float width, float height);

    FallingShape getShapeByName(String shapeName, float width, float height);
}
