package advancedfeatures.lesson1.homework.inheritance.shape;

public class Rectangle extends Shape {

    private String name;
    private int area;
    private int perimeter;

    public Rectangle(String shapeName, String name, int area, int perimeter) {
        super(shapeName);
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

}
