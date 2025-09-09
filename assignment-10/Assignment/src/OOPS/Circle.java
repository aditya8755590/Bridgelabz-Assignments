package OOPS;

// Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.
public class Circle {
    int radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
