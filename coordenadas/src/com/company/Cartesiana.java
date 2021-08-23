package com.company;

public class Cartesiana{
    private float x,y;
    private float r,θ;
    private float radio;
    private float angulo;


    public Cartesiana(float x, float y)
    {
        this.x=x;
        this.y=y;
    }
    public Cartesiana polar_cartesiano (float cord_x, double cord_y) {
        float x=(float) (r * Math.cos(θ));
        float y= (float) (r * Math.sin(θ));
        return new Cartesiana(x,y);

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
