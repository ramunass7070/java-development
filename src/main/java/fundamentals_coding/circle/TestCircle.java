package fundamentals_coding.circle;

import javax.swing.*;

public class TestCircle {
    public static void main(String... args) {
        Circle[] circles = initiateCircles(8);
        System.out.println(circles);
        printCircleData(circles);
    }

    public static Circle[] initiateCircles(int size) {
        Circle[] circles = new Circle[size];
        double radius = 9.125;
        String[] color = {"white", "black", "orange", "lemon", "pink", "blue"};
        for (int i = 0; i < size; i++) {
            circles[i] = new Circle(radius, color[i%color.length]);
            radius += radius + 2 * i * radius;
        }
        return circles;
    }

    public static void printCircleData(Circle[] circles) {
        for (Circle circle : circles
        ) {
            double area = circle.getArea();
            String color = circle.getColor();
            double perimeter = circle.getCircleCircumstance();
            System.out.printf("Circle circumstance: %.3f, Area %.3f, color: %s%n", perimeter, area, color);
        }

    }

}

