package ss7_abstract_class_interface.exercise.Colorable.geometry;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1, "yellow", false);
        shapes[1] = new Rectangle(2, 3, "infinity", true);
        shapes[2] = new Square(1, "Red", true);
        for (Shape a : shapes) {
            System.out.println(a);
        }
        System.out.println("=============================");
        //ColorableSquare
        shapes[2].howToColor();
        shapes[2].getArea();
        System.out.println("Square with area = " + shapes[2].getArea());
    }
}
