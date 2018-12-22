package lesson9.circle;

public class Circle {
    private int radius;
    private double pi = Math.PI;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double square() {
        return pi * Math.pow(radius, 2);
    }

    public double length() {
        return pi * 2 * radius;
    }
}
