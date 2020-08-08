package advancedfeatures.lesson1.homework.inheritance.shape;

public class Circle extends Shape {

    private String name;
    private int area;
    private int perimeter;

    public Circle(String shapeName, String name, int area, int perimeter) {
        super(shapeName);
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;
    }

    @Override
    public int getArea() {
        return area;
    }

    @Override
    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

}
