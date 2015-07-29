package com.jjapps.fallingblocks;

import android.graphics.Path;
import android.graphics.RectF;

/**
 * Created by jagen31 on 7/29/15.
 */
public class DefaultShapeFactory implements ShapeFactory{

    @Override
    public FallingShape getRectangle(float width, float height) {
        Path path = new Path();
        path.lineTo(width, 0);
        path.lineTo(width, height);
        path.lineTo(0, height);
        path.lineTo(0, 0);
        FallingShape shape = new FallingShape();
        shape.setPath(path);
        return shape;
    }

    @Override
    public FallingShape getTriangle(float width, float height) {
        Path path = new Path();
        path.moveTo(width / 2, 0);
        path.lineTo(width, height);
        path.lineTo(0, height);
        path.lineTo(width / 2, 0);
        FallingShape shape = new FallingShape();
        shape.setPath(path);
        return shape;
    }

    @Override
    public FallingShape getOval(float width, float height) {
        Path path = new Path();
        RectF rect = new RectF();
        rect.set(0, 0, width, height);
        path.addOval(rect, Path.Direction.CW);
        FallingShape shape = new FallingShape();
        shape.setPath(path);
        return shape;
    }

    @Override
    public FallingShape getShapeByName(String shapeName, float width, float height) {
        switch (shapeName) {
            case "rectangle":
            case "rect":
                return getRectangle(width, height);
            case "triangle":
            case "tri":
                return getTriangle(width, height);
            case "oval":
                return getOval(width, height);
            default:
                return null;
        }
    }
}
