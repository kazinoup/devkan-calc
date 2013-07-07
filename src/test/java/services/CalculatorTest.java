package services;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    Calculator sut = new Calculator();

    @Test
    public void testAdd() {
        String actual = sut.add(1, 1);
        assertThat(actual, is("2"));
    }

    @Test
    public void testSubtract() {
        String actual = sut.subtract(5, 3);
        assertThat(actual, is("2"));
    }

    @Test
    public void testMultiply() {
        String actual = sut.multiply(5, 3);
        assertThat(actual, is("15"));
    }

    @Test
    public void testDivide() {
        String actual = sut.divide(10, 2);
        assertThat(actual, is("5"));

	actual = sut.divide(0, 1);
        assertThat(actual, is("0"));

	actual = sut.divide(1, 0);
        assertThat(actual, is("0œZƒGƒ‰["));
    }
}
