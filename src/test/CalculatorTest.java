
import main.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void sum(){
        final int expected = 4;
        final int actual = calculator.sum(2,2);
        assertEquals(expected,actual);
    }
}