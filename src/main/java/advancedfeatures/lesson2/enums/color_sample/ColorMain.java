package advancedfeatures.lesson2.enums.color_sample;


import java.util.Arrays;

public class ColorMain {

    public static void main(String[] args) {

//        System.out.println("Possible colors");
//
//        for (Color color : Color.values()) {
//            System.out.print("case ");
//            System.out.print(color.name());
//            System.out.print(": \n\nbreak;\n");
//        }

        Color color = Color.BLUE;

        switch (color) {
            case BLUE:
                System.out.println("Painting in " + color.BLUE);
                break;
            case RED:
                System.out.println("Painting in " + color.RED);
                break;
            case GREEN:
                System.out.println("Painting in " + color.GREEN);
                break;
            case YELLOW:
                System.out.println("Painting in " + color.YELLOW);
                break;
            default:
                System.out.println("No color selected: ");
                break;
        }

        System.out.println("Painting in " + color.getCode());

        System.out.println(Arrays.toString(Color.values()));

    }


}
