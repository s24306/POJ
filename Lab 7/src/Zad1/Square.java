package Zad1;

public class Square extends Shape{
    private double x;

    public Square(double x){
        this.x = x;
    }

    @Override
    double getPerimeter() {
        return 4 * x;
    }

    @Override
    double getArea() {
        return x * x;
    }
}
