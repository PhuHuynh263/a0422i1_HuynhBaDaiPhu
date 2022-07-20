package ss4_class_object.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta() {
        return Math.pow(getB(), 2) - 4 * getA() * getC();
    }

    public double getRoot1() {
        return (-getB() + Math.sqrt(Math.pow(getB(), 2) - 4 * getA() * getC())) / 2 * getA();
    }

    public double getRoot2() {
        return (-getB() - Math.sqrt(Math.pow(getB(), 2) - 4 * getA() * getC())) / 2 * getA();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, r1, r2, delta;
        QuadraticEquation qe = new QuadraticEquation();
        System.out.print("Enter a : ");
        a = scanner.nextDouble();
        qe.setA(a);
        System.out.print("Enter b: ");
        b = scanner.nextDouble();
        qe.setB(b);
        System.out.print("Enter c: ");
        c = scanner.nextDouble();
        qe.setC(c);

        delta = qe.getDelta();
        r1 = qe.getRoot1();
        r2 = qe.getRoot2();

        if (delta > 0) {
            System.out.print("The equation has 2 roots: " + r1 + " and " + r2);
        } else if (delta == 0) {
            System.out.println("The equation has 1 root: " + r1);
        } else {
            System.out.print("The equation has no roots!");
        }
    }
}

