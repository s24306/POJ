package Zad2;
import org.w3c.dom.css.Rect;

import java.util.*;

public class FiguresMain {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(2, 4);
        FigureInterface arr[] = {circle, square, rectangle};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].calculateArea());
            System.out.println(arr[i].calculatePerimeter());
        }
    }
}
