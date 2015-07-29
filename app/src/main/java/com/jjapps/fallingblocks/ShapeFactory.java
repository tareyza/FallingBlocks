package com.jjapps.fallingblocks;

import android.graphics.drawable.ShapeDrawable;

/**
 * Created by jagen31 on 7/29/15.
 */
public interface ShapeFactory {

    FallingShape getRectangle();

    FallingShape getTriangle();

    FallingShape getOval();

    FallingShape getShapeByName(String shapeName);


}
