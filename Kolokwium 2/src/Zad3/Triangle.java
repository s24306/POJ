package Zad3;

public class Triangle {
    private float a;
    private float h;

    public Triangle(){
        this.a = 1;
        this.h = 2;
    }

    public Triangle(int h){
        this();
        this.h = h;
    }

    public float caluclateArea(){
        return (this.a * this.h) / 2;
    }

    public float getA() {
        return a;
    }

    public float getH() {
        return h;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setH(float h) {
        this.h = h;
    }
}
