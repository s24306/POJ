package Zad2;

public class Circle implements FigureInterface {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
}
