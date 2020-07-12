package fundamentals.mockito;

import fundamentals_testing.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)  // @RunWith naudojama tik virs klases
public class Example {

    @Mock
    Calculator calculator = new Calculator();

    @Test
    public void verifyThatAdditionWasCalled() {
        //given
        when(calculator.add(eq(1), eq(2)))
                .thenReturn(12);                    // kai kvieciamas calc.add
        // su argumentaiss 1,2, returnina 12 VISADA,
        // metodas aprasyme  gali buti tuscias

        //when
        int result = calculator.add(1, 2);

        //then
        verify(calculator).add(1, 2);               //tikrina ar buvo iskviestas calculator.add metodas su bet kokiais arguments(any())
        verify(calculator, never()).divide(1, 2);   //tikrina kad tikrai nebutu buves iskviestas calculator.divide metodas

        Assert.assertEquals(12, result);    //tikrina, ar calculator.add(1,2) eil26 duoda expected verte
    }


}
