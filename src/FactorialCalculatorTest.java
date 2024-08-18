import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, FactorialCalculator.factorial(1));
    }

    @Test
    public void testFactorialOfTwo() {
        assertEquals(2, FactorialCalculator.factorial(2));
    }

    @Test
    public void testFactorialOfThree() {
        assertEquals(6, FactorialCalculator.factorial(3));
    }

    @Test
    public void testFactorialOfFive() {
        assertEquals(120, FactorialCalculator.factorial(5));
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.factorial(-1);
        });
        assertEquals("Число должно быть неотрицательным.", exception.getMessage());
    }
}