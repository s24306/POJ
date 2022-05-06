package Zad1;

public class MainShapes {
    public static void main(String[] args) throws Exception {
        Shape[] shapesArray = new Shape[4];
        shapesArray[0] = new Rectangle(2, 3);
        shapesArray[1] = new Circle(5);
        shapesArray[2] = new Square(6);
        shapesArray[3] = new Triangle(2, 2, 3 ,4);

        for(int i = 0; i < shapesArray.length; i++){
            System.out.println(shapesArray[i].getArea());
            System.out.println(shapesArray[i].getPerimeter());
        }
    }
}
