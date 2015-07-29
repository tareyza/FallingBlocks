package com.jjapps.fallingblocks;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/**
 * Created by jagen31 on 7/29/15.
 */
public class FallingShape {

    private float x, y, width, height, rotation;
    private Paint paint;
    private Path path;

    /**
     * Get the x coordinate of this shape.
     * @return the x coordinate
     */
    public float getX(){
        return this.x;
    }

    /**
     * Get the y coordinate of this shape.
     * @return the y coordinate
     */
    public float getY(){
        return this.y;
    }

    /**
     * Get the width of this shape.
     * @return the width
     */
    public float getWidth(){
        return this.width;
    }

    /**
     * Get the height of this shape.
     * @return the height
     */
    public float getHeight(){
        return this.height;
    }

    /**
     * Get the rotation of this shape.
     * @return the rotation
     */
    public float getRotation(){
        return this.rotation;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setLocation(int x, int y){
        Matrix translate = new Matrix();
        translate.setTranslate(x - this.x, y - this.y);
        path.transform(translate);
        this.x = x;
        this.y = y;
    }

    public void setDimension(int width, int height){
        Matrix scale = new Matrix();
        scale.setScale(width / this.width, height / this.height);
        path.transform(scale);
        this.width = width;
        this.height = height;
    }

    /**
     * Set the rotation of this shape.
     * @param rotation the rotation
     */
    public void setRotation(float rotation){
        Matrix rotate = new Matrix();
        rotate.setRotate(rotation - this.rotation);
        path.transform(rotate);
        this.rotation = rotation;
    }

    /**
     * Set the path of this shape.
     * @param path the path
     */
    public void setPath(Path path){
        this.path = path;
        RectF rect = new RectF();
        path.computeBounds(rect, true);
        this.x = 0;
        this.y = 0;
        this.width = rect.width();
        this.height = rect.height();
        this.rotation = 0;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    /**
     * Create a representation of this shape on the given canvas.
     * @param canvas the canvas on which to draw this shape
     */
    public void render(Canvas canvas){
        canvas.drawPath(this.path, this.paint);
    }
}
