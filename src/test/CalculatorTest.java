import org.junit.Assert;
import org.junit.Test;
import main.Calculator;


public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void ATestMethod(){
        Assert.assertTrue(true);
    }

    @Test
    public void sum(){
        final int expected = 4;
        final int actual = calculator.sum(2,2);
        Assert.assertEquals(expected,actual);
    }
}