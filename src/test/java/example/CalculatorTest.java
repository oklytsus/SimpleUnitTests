package example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import s1.Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @BeforeAll
    static public void setUp() {

        System.out.println("Setting up resources for the test");
    }

    @Test
    public void testAdd() {
        assertEquals(10, Calculator.add(5, 3));
    }

       @Test
    public void testSubtract() {
        assertEquals(3, Calculator.subtract(8, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(20, Calculator.multiply(4, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, Calculator.divide(10, 5), 0.001);
    }

    @Test
    public void testDivideByZero() {
        Calculator.divide(10, 0);
    }

    @AfterAll
    static public void tearDown() {
        System.out.println("Cleaning up resources after the test");
    }

}
