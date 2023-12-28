package example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import s2.Calculator2;


public class Calculator2Test {
    private Calculator2 calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator2();
    }

    @Test
    public void testAdd() {
        assertEquals(10, calculator.add(5, 5));
        assertEquals(-3, calculator.add(2, -5));
    }

    @Test
    public void testSubtract() {
        assertEquals(3, calculator.subtract(8, 5));
        assertEquals(7, calculator.subtract(10, 3));
    }

    @ParameterizedTest
    @CsvSource({"5, 3", "10, 4", "6, 7"})
    public void testMultiply(int a, int b) {
        int multiplyResult = calculator.multiply(a, b);
        assertEquals(a * b, multiplyResult);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(10, 5), 0.001);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
