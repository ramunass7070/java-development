package fundamentals_testing.tdd;

public class FigureMain {

//    public int calculatePerimeter(int length, int width) {
//        return 2 * (length + width);
//    }

    public int calculatePerimeter(Figure figure) {
        switch (figure.figureType) {
            case CIRCLE:
                return (int) (2 * Math.PI * figure.radius);
            case SQUARE:
                return 2 * (figure.length + figure.width);
            default:
                return -1;
        }
    }
}

