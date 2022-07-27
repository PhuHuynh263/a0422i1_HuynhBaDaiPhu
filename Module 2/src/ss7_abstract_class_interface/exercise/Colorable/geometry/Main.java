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
        System.out.println("========================================");
        System.out.println("A square with color " + shapes[2].getColor());
        System.out.println("===============Colorable================");

        //ColorableSquare
        shapes[2].howToColor("Black");
        System.out.println("A square with colorable " + shapes[2].getColor());
    }
}
