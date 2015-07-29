package com.jjapps.fallingblocks;

/**
 * Created by jagen31 on 7/29/15.
 */
public class RandomLocationGenerator implements ShapeLocationGenerator{

    private int width;

    public RandomLocationGenerator(int width){
        this.width = width;
    }

    @Override
    public void locate(FallingShape shape) {
        shape.setLocation((int)(Math.random() * width - shape.getWidth() / 2), -shape.getHeight());
    }
}
