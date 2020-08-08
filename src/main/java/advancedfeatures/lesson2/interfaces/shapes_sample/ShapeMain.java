package advancedfeatures.lesson2.interfaces.shapes_sample;

public class ShapeMain {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println("===========================");

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        System.out.println("===========================");

        Shape circleShape = new Circle(7);
        System.out.println(circleShape.getArea());
        System.out.println(circleShape.getPerimeter());
        circle.colorize("Red");

        System.out.println("===========================");
        ColoredShape coloredShape = circle; // cia casting yra circle objekto i ColoredShape interface

        /**
         Casting does not change the actual object type. Only the reference type gets changed.
         Upcasting is always safe and never fails.
         Downcasting can risk throwing a ClassCastException, so the instanceof operator is used to check type before casting.
         */

        coloredShape.colorize("Blue");

        /**
         ColoredShape coloredShape1 = (ColoredShape) rectangle; // negalim castinti rectangle, nes Rectangle neimplementina ColoredShape - mes exception.
         coloredShape1.colorize("Pink");
         */
        System.out.println("======Cube object==========");

        Cube cube = new Cube(3);
        System.out.println(cube.getArea());
        System.out.println(cube.getPerimeter());
        System.out.println(cube.getVolume());

        System.out.println("=====Cube casted as Shape==");
        Shape shape = cube;

        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
        System.out.println("=====Cube casted as Shape3D==");
        Shape3D shape3D = cube;
        System.out.println(shape3D.getArea());
        System.out.println(shape3D.getPerimeter());
        System.out.println(shape3D.getVolume());

    }
}
