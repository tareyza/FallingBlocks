package com.jjapps.fallingblocks;

import android.graphics.Path;
import android.graphics.RectF;

/**
 * Created by jagen31 on 7/29/15.
 */
public class DefaultShapeFactory implements ShapeFactory{

    private ShapePaintGenerator paintGenerator;
    private ShapeDimensionGenerator dimensionGenerator;
    private ShapeLocationGenerator locationGenerator;

    public DefaultShapeFactory(int width, int height){
        paintGenerator = new RandomPaintGenerator();
        dimensionGenerator = new RandomDimensionGenerator(width, height);
        locationGenerator = new RandomLocationGenerator(width);
    }

    @Override
    public FallingShape getRectangle() {
        Path path = new Path();
        path.lineTo(10, 0);
        path.lineTo(10, 10);
        path.lineTo(0, 10);
        path.lineTo(0, 0);
        FallingShape shape = new FallingShape();
        shape.setPath(path);
        createShape(shape, "rectangle");
        return shape;
    }

    @Override
    public FallingShape getTriangle() {
        Path path = new Path();
        path.moveTo(5, 0);
        path.lineTo(10, 10);
        path.lineTo(0, 10);
        path.lineTo(5, 0);
        FallingShape shape = new FallingShape();
        shape.setPath(path);
        createShape(shape, "triangle");
        return shape;
    }

    @Override
    public FallingShape getOval() {
        Path path = new Path();
        RectF rect = new RectF();
        rect.set(0, 0, 10, 10);
        path.addOval(rect, Path.Direction.CW);
        FallingShape shape = new FallingShape();
        shape.setPath(path);
        createShape(shape, "oval");
        return shape;
    }

    @Override
    public FallingShape getShapeByName(String shapeName) {
        switch (shapeName) {
            case "rectangle":
            case "rect":
                return getRectangle();
            case "triangle":
            case "tri":
                return getTriangle();
            case "oval":
                return getOval();
            default:
                return null;
        }
    }

    public void createShape(FallingShape shape, String type){
        dimensionGenerator.dimension(shape);
        locationGenerator.locate(shape);
        paintGenerator.paint(shape, type);
    }
}
