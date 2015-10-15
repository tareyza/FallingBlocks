package com.jjapps.fallingblocks;

/**
 *
 */
class Bounds {

    private double x,y;
    private double width, height;
    private double rotation;

    private Bounds(double x, double y, double width, double height, double rotation){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.rotation = rotation;
    }

    static class Builder{

        private double x,y;
        private double width, height;
        private double rotation;

        public void x(double x){
            this.x = x;
        }

        public void y(double y){
            this.y = y;
        }

        public void width(double width){
            this.width = width;
        }

        public void height(double height){
            this.height = height;
        }

        public void rotation(double rotation){
            this.rotation = rotation;
        }

        public Bounds build(){
            return new Bounds(x, y, width, height, rotation);
        }
    }
}
