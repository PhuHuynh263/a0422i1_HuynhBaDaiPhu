package ss6_inheritance.exercise;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    private float point2D[];

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

    public void setXY(float x, float y) {
        point2D[0] = this.x;
        point2D[1] = this.y;
    }

    public float getXY() {
        return point2D[2];
    }

    public String toString() {
        return "X : " + x + " Y : " + y;
    }
}

class Point3D extends Point2D {
    private float z = 0.0f;
    private float point3D[];

    Point3D(float x, float y, float z) {
    }

    Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y) {
        point3D[0] = getX();
        point3D[1] = getX();
        point3D[2] = this.z;
    }

    public float getXYZ() {
        return point3D[3];
    }

    public String toString() {
        return "X : " + getX() + " Y : " + getY() + " Z : " + z;
    }

    public static void main(String[] args) {
        //Point2D
        Point2D point2D = new Point2D();
        point2D.setX(10);
        point2D.setY(15);
        System.out.println(point2D.toString());

        //Point3D
        Point3D point3D = new Point3D();
        point3D.setX(20);
        point3D.setY(15);
        point3D.setZ(10);
        System.out.println(point3D.toString());
    }
}
