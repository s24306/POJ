package Zad2;

public class Square implements FigureInterface {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public double calculateArea() {
        return Math.pow(a, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }
}
