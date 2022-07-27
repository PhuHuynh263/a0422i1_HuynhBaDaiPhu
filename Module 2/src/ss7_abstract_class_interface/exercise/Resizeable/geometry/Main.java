package ss7_abstract_class_interface.exercise.Resizeable.geometry;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        int y = (int) Math.floor(Math.random() * 10);
        int z = (int) Math.floor(Math.random() * 1000);
        System.out.println("x = " + x + "\n" + "y = " + y + "\n" + "z = " + z);
        System.out.println("=====================================");
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "yellow", false);
        shapes[1] = new Rectangle(x, y, "infinity", true);
        shapes[2] = new Square(x);
        for (Shape a : shapes) {
            System.out.println(a);
        }

        System.out.println("===============Resize================");

        //ResizeCircle
        Circle circle = new Circle();
        circle.resize(z);
        circle.getArea();
        System.out.println("A Circle with ResizeArea = " + circle.getArea());


        //ResizeCircle
        Rectangle rectangle = new Rectangle();
        rectangle.resize(z);
        rectangle.getArea();
        rectangle.getPerimeter();
        System.out.println("A Rectangle with ResizeArea = " + circle.getArea() + ", and Perimeter = " + circle.getPerimeter());


        //ResizeSquare
        Square square = new Square();
        square.resize(z);
        square.getArea();
        System.out.println("A Square with ResizeArea = " + square.getArea());
    }
}
