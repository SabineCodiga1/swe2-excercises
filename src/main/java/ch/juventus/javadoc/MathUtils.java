package ch.juventus.javadoc;

import java.util.List;

/**
 * Class for several math operations
 *
 * @author Sabine Codiga
 * @version 1.0
 * @since 16.09.2021
 */
public class MathUtils {

    /**
     * @param numbers list of numbers
     * @return the sum of the total numbers in the list
     */
    public double addition(List<Double> numbers) {
        double sum = 0.0;
        for (Double number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * @param a minuend
     * @param b subtrahend
     * @return the subtraction of a and b
     */
    public double subtraction(double a, double b) {
        return a - b;
    }

    /**
     * @param a first multiplicand
     * @param b second multiplicand
     * @return the multiplication of a and b
     */
    public double multiplication(double a, double b) {
        double result = a*b;
        return result;
    }

    /**
     * @param a dividend
     * @param b divisor
     * @return the quotient of a and b
     */
    public double division(double a, double b) throws Exception {

        if (b == 0){
            throw new Exception("Dividor is 0");
        }

        return a / b;
    }
}

