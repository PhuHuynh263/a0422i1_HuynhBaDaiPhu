package ss7_abstract_class_interface.practise.Circle;

public class ComparableCircle extends Circle {
    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, Boolean filled) {
        super(radius, color, filled);
    }

    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
