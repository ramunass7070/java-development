package fundamentals.tdd;

import fundamentals_testing.tdd.Figure;
import fundamentals_testing.tdd.FigureMain;
import fundamentals_testing.tdd.FigureType;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static fundamentals_testing.tdd.FigureType.*;
import static org.assertj.core.api.Assertions.*;

public class FigureTest {

    FigureMain figureMain = new FigureMain();


    @Test
    public void calculateSquarePerimeter() {
        //given
        Figure figure = new Figure(2, 2, SQUARE);
//        int length = 2;
//        int width = 2;

        //when
        int result = figureMain.calculatePerimeter(figure);

        //then
        assertThat(result).isEqualTo(8);
    }

    @Test
    public void calculateCirclePerimeter() {
        //given
        Figure circle = new Figure(1, CIRCLE);

        //when
        int result = figureMain.calculatePerimeter(circle);

        //then
        assertThat(result).isEqualTo(6);
    }









}
