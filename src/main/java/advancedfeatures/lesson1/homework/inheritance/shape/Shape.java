package advancedfeatures.lesson1.homework.inheritance.shape;

public class Shape {

    private String name;
    private int area;
    private int perimeter;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}

