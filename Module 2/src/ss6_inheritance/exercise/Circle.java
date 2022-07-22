package ss6_inheritance.exercise;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";
    private double area;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle  " + "\n"
                + "Radius is : " + radius + "\n"
                + " Color is : " + color + "\n"
                + " Area is : " + getArea() + "\n"
                + "==================================";
    }
}

class Cylinder extends Circle {
    private double height = 1.0;
    private double volume;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public String toString() {
        return "Cylinder  " + "\n"
                + "Radius is : " + getRadius() + "\n"
                + " Color is : " + getColor() + "\n"
                + " Height is : " + height + "\n"
                + " Volume is : " + getVolume() + "\n"
                + "==================================";
    }


    public static void main(String[] args) {
        //Hình tròn
        Circle circle = new Circle();
        circle.getColor();
        circle.setRadius(20);
        circle.getArea();
        System.out.println(circle.toString());

        //Hình trụ
        Cylinder cylinder = new Cylinder();
        cylinder.setColor("Blue");
        cylinder.setRadius(30);
        cylinder.setHeight(10);
        cylinder.getVolume();
        System.out.println(cylinder.toString());
    }
}


