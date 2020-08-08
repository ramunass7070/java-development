package advancedfeatures.lesson2.interfaces.shapes_sample;

public class Circle implements Shape, ColoredShape {

    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


    @Override
    public void colorize(String color) {
        System.out.println("coloring shape in: " + color);
    }
}
