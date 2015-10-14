package com.jjapps.fallingblocks;

import android.support.annotation.ColorInt;
import android.support.annotation.Size;

/**
 * This is a simple, immutable representation of a color scheme.  Implementations should
 * maintain an indexed collection of color representations, in descending order by priority.
 * Standard order for a tri-color scheme is [Foreground, Background, Accent].
 * <p/>
 * Every world will have a palette of colors.  This is so graphics components can
 * maintain a consistent look when rendering blocks.
 */
public interface IPalette {

    @ColorInt int getColor(int index);

    @Size(min = 3) int size();
}