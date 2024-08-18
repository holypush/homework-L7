import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(FactorialCalculator.factorial(0), 1);
    }

    @Test
    public void testFactorialOfOne() {
        Assert.assertEquals(FactorialCalculator.factorial(1), 1);
    }

    @Test
    public void testFactorialOfTwo() {
        Assert.assertEquals(FactorialCalculator.factorial(2), 2);
    }

    @Test
    public void testFactorialOfThree() {
        Assert.assertEquals(FactorialCalculator.factorial(3), 6);
    }

    @Test
    public void testFactorialOfFive() {
        Assert.assertEquals(FactorialCalculator.factorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Число должно быть неотрицательным.")
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator.factorial(-1);
    }
}