package Zad3;

public class MainZad3 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Triangle triangle2 = new Triangle(5);

        System.out.println(triangle.caluclateArea());
        System.out.println(triangle2.caluclateArea());

        EquilateralTriangle eq1 = new EquilateralTriangle(3);
        System.out.println(eq1.caluclateArea());
    }
}
