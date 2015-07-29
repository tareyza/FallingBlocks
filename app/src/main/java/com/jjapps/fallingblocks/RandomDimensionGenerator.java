package com.jjapps.fallingblocks;

/**
 * Created by jagen31 on 7/29/15.
 */
public class RandomDimensionGenerator implements ShapeDimensionGenerator {

    private int width, height;

    public RandomDimensionGenerator(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void dimension(FallingShape shape) {
        shape.setDimension((int)(Math.random() * width), (int)(Math.random() * height));
    }
}
