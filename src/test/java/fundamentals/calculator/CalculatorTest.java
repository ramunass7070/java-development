package fundamentals.calculator;

import fundamentals_testing.calculator.Calculator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void addTwoNumbers() {
        //given  // pradiniai duomenys, kurie bus naudojami when dalyje
        int num1 = 1;
        int num2 = 2;

        //when
        int result = calculator.add(num1, num2);  //

        //then
        Assert.assertEquals(3, result);

    }

    @Test
    public void divideTest() {
        //given
        int num1 = 1;
                int num2 = 2;
                int num4 = 4;
                int num5 = 5;
                int num6 = 6;

        //when
        int result1 = calculator.divide(num4, num2);
        int result2 = calculator.divide(num5, num5);

        //then
        Assert.assertEquals(2, result1);
        Assert.assertEquals(1, result2);
    }

    @Test(expected = ArithmeticException.class)
    public void shouldThrowArithmeticExceptionDividingByZero() {
        //given
        int numOne = 4;
        int numTwo = 0;

        //When
        int result = calculator.divide(numOne, numTwo);

        //then
        // should thor exception

    }

    @Test
    public void assertWithRulesShouldThrowArithmeticException() {
    //given
        int numberOne = 4;
        int numberTwo = 0;
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("/ by zero");
    //when
        calculator.divide(numberOne, numberTwo);
    //then
    }

}
