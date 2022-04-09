public class Lab4Task1 {
    public static void main(String[] args) {
        Circle2D circleWithoutParameters = new Circle2D();
        Circle2D circleWithParameters = new Circle2D(2, 3, 4);
        System.out.println("No parameters area: " + circleWithoutParameters.getArea());
        System.out.println("No parameters perimeter: " + circleWithoutParameters.getPerimeter());
        System.out.println("Parameters area: " + circleWithParameters.getArea());
        System.out.println("Parameters perimeter: " + circleWithParameters.getPerimeter());
    }
}
