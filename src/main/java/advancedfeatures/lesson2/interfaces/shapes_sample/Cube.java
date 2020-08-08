package advancedfeatures.lesson2.interfaces.shapes_sample;

public class Cube extends Rectangle implements Shape3D {

    private double height;

    public Cube(double height) {
        super(height, height);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return height * height * height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 6;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter() * 3;
    }
}
