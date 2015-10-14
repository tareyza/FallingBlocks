package com.jjapps.fallingblocks;

import android.support.annotation.ColorInt;

/**
 * Created by jarge_000 on 10/14/2015.
 */
public class Palette implements IPalette {

    private int[] colors;

    public Palette(@ColorInt int... colors) {
        if (colors.length < 3) {
            throw new IllegalArgumentException("Palette is guaranteed to have at least 3 colors.");
        }
    }

    @Override public int getColor(int index) {
        if (index > colors.length || index < 0)
            throw new IllegalArgumentException("Out of range");
        return colors[index];
    }

    @Override public int size() {
        return colors.length;
    }
}
