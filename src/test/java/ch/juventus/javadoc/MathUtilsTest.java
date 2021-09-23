package ch.juventus.javadoc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private static MathUtils mathUtils;

    @BeforeAll
    static void setUp(){
        mathUtils = new MathUtils();
    }

    @Test
    public void shouldReturnSumWhenGiven2Doubles(){
        //given
        List<Double> numbers = new ArrayList<>();
        numbers.add(2.5);
        numbers.add(7.5);
        //when
        double sum = mathUtils.addition(numbers);
        //then

        assertEquals(10, sum, "Should return 10, but didn't");
    }

    @Test
    public void shouldReturnSumWhenGivenNothing() {
        //given
        List<Double> numbers = new ArrayList<>();
        //when
        double sum = mathUtils.addition(numbers);
        //then
        assertEquals(0, sum, "Should return 0, but didn't");
    }

    @Test
    public void shouldReturnMultiplicationOfTwoNumbers() {
        //given
        double a = -5.0;
        double b = 10.1;
        //when
        double result = mathUtils.multiplication(a, b);
        //then
        assertEquals(-50.5, result, "Should return 50.5, but didn't");
    }

    @Test
    public void shouldReturnZeroBecauseBothVariablesAreZero() {
        //given
        double a = 0;
        double b = 5;
        //when
        double result = mathUtils.multiplication(a, b);
        //then
        assertEquals(0, result, "result should be 0, because the two variables = 0");
    }


    @Test
    public void shouldThrowExeptionBecauseItsDividedByZero() {
        //given
        double a = 10;
        double b = 0;
        //when
        Exception exception = assertThrows(Exception.class, () -> mathUtils.division(a,b));
        //then
        assertEquals("Dividor is 0", exception.getMessage());
    }


}
