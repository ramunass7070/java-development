package fundamentals_coding.circle;

public class Circle {
    private double radius;
    private String color;
    private static double pi = Math.PI;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getCircleCircumstance() {
        return 2 * pi * radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }

    public String getColor() {
        return color;
    }

}
