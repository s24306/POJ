package Zad1;

public class Triangle extends Shape{
    private double x, y, z, h;

    public Triangle (double x, double y, double z, double h) throws Exception{
        if (((x + y) <= z) || ((x + z) <= y) || ((y + z) <= x)){
            throw new Exception("Impossible triangle");
        } else {
            this.x = x;
            this.y = y;
            this.z = z;
            this.h = h;
        }
    }

    @Override
    double getPerimeter() {
        return x + y + z;
    }

    @Override
    double getArea() {
        return (y * h)/2;
    }
}
