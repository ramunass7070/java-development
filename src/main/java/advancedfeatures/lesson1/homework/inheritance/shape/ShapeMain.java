package advancedfeatures.lesson1.homework.inheritance.shape;

public class ShapeMain {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Shape("undefined");
        shapes[1] = new Circle("Circle", "raudonas", 10, 10);
        shapes[2] = new Rectangle("kvadratas", "melynas", 11, 12);

        for (Shape sh : shapes) {
            System.out.println(sh.toString());
        }

    }
}
