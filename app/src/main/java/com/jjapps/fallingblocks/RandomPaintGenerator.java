package com.jjapps.fallingblocks;

import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by jagen31 on 7/29/15.
 */
public class RandomPaintGenerator implements ShapePaintGenerator{

    @Override
    public void paint(FallingShape shape, String type) {
        Paint paint = new Paint();
        paint.setColor(Color.argb(255, getRandomByte(), getRandomByte(), getRandomByte()));
        shape.setPaint(paint);
    }

    private int getRandomByte(){
        return (int)(Math.random() * 200 + 50);
    }
}
