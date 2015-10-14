package com.jjapps.fallingblocks;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 *
 */
public interface IGameObject {

    void update();

    Bounds getBounds();

    IGameObject withBounds(@Nullable Bounds bounds);

    IGameObject withComponent(@NonNull IComponent component);

    class Bounds {

        private double x, y;
        private double width;
        private double height;

        public Bounds(double x, double y, double width, double height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return this.width;
        }

        public double getHeight() {
            return this.height;
        }

        @Override public String toString() {
            return String.format("Position: (%f, %f) Dimension: (%f, %f)",
                    this.x, this.y, this.width, this.height);
        }
    }
}