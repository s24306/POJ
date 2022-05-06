package Zad1;

public class Rectangle extends Shape{
    private double x;
    private double y;

    public Rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    double getPerimeter() {
        return x * y;
    }

    @Override
    double getArea() {
        return 2 * (x + y);
    }
}
