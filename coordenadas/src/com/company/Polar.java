package com.company;
public class Polar {
    private float radio,angulo;
    private float x,y;  // en radianes
    private float r,θ;

    public Polar(float radio, float angulo) {
        this.radio = radio;
        this.angulo = angulo;
    }
    public Cartesiana polar_cartesiano(float radio, double angulo)
    {
        float r=(float)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        float θ= (float) Math.atan(y/x);
        return new Cartesiana(r,θ);
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio){
            this.radio = radio;
        }

    public float getAngulo() {
                return angulo;
            }


    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }
}


