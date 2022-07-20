package ss4_class_object.exercise;

public class Fan {
    private final int Slow = 1;
    private final int Medium = 2;
    private final int Fast = 3;
    private int speed = 1;
    private boolean isTurnOn = false;
    private double radius = 5;
    private String color = "Blue";


    public Fan() {
    }

    public int getSlow() {
        return Slow;
    }

    public int getMedium() {
        return Medium;
    }

    public int getFast() {
        return Fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isTurnOn() {
        return isTurnOn;
    }

    public void setTurnOn(boolean turnOn) {
        isTurnOn = turnOn;
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

    public String toString() {
        if (isTurnOn) {
            return "Fan is on with speed : " + speed + ", color is : " + color + ", radius is : " + radius;
        } else {
            return "Fan is off with color is : " + color + ", radius is : " + radius;
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setTurnOn(true);
        fan1.isTurnOn();
        fan1.setSpeed(3);
        fan1.getSpeed();
        fan1.setRadius(10);
        fan1.getRadius();
        fan1.setColor("Yellow");
        fan1.getColor();
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setTurnOn(false);
        fan2.isTurnOn();
        fan2.setSpeed(2);
        fan2.getSpeed();
        fan2.getRadius();
        fan2.getColor();
        System.out.println(fan2.toString());
    }
}
