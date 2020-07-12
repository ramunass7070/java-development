package fundamentals_testing.tdd;

public class Figure {
    int length;
    int width;
    int radius;
    FigureType figureType;

    public Figure(int length, int width, FigureType figureType) {
        this.length = length;
        this.width = width;
        this.figureType = figureType;
    }

    public Figure(int radius, FigureType figureType) {
        this.radius = radius;
        this.figureType = figureType;
    }

}
