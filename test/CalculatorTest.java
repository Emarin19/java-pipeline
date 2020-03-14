
import calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void adding() {
        double actual = Calculator.adding(2, 50);
        double expected = 52;
        assertEquals(expected, actual);
    }

    @Test
    void substraction() {
        double actual = Calculator.substraction(85, 20);
        double expected = 65;
        assertEquals(expected, actual);
    }

    @Test
    void multiplication() {
        double actual = Calculator.multiplication(40, 2);
        double expected = 80;
        assertEquals(expected, actual);
    }

    @Test
    void division() {
        double actual = Calculator.division(40, 20);
        double expected = 2;
        assertEquals(expected, actual);
    }
}