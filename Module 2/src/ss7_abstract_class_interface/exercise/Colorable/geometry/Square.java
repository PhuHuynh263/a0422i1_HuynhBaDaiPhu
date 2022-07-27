package ss7_abstract_class_interface.exercise.Colorable.geometry;

public class Square extends Shape {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "A Square with side = "
                + getSide()
                + ", Area = "
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String howToColor(String color) {
        return null;
    }

    @Override
    public void howToColor() {
        System.out.println("Color is all four side...");
    }
}

