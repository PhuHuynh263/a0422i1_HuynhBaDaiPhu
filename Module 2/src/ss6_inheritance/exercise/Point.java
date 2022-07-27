package ss6_inheritance.exercise;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] result = {this.x, this.y};
        return result;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x =" + x +
                ", y =" + y;
    }
}

class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] result = {this.xSpeed, this.ySpeed};
        return result;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return super.toString() + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed;
    }

    public MoveablePoint move() {
        // x = x + xSpeed
        super.setX(super.getX() + xSpeed);
        // y = y + ySpeed
        super.setY(super.getY() + ySpeed);
        return this;
    }
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1, 2, 1, 1);
        System.out.println(moveablePoint);
        MoveablePoint moveablePoint1 = moveablePoint.move();
        System.out.println(moveablePoint1);
        System.out.println(moveablePoint.move());
    }
}


