package ss5_access_modifier_static_method_static_property.exercise;


public class AccessModifier {
    private double radius = 1.0;
    private String color = "red";

    public AccessModifier(double r) {
        this.radius = r;
    }

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
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier(2);
        System.out.println(" Area is : " + accessModifier.getArea());
        System.out.println(" Color is : " + accessModifier.getColor());
        System.out.println(" Radius is : " + accessModifier.getRadius());
    }
}
