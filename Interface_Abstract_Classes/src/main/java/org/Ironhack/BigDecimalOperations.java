package org.Ironhack;
import java.math.*;


public class BigDecimalOperations {
    public static double roundToHundredth(BigDecimal value) {
        return value.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double reverseSignAndRound(BigDecimal number) {
        BigDecimal reversed = number.negate();
        return reversed.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("4.2545");
        System.out.println(roundToHundredth(number));

        BigDecimal number1 = new BigDecimal("1.2345");
        BigDecimal number2 = new BigDecimal("-45.67");
        System.out.println(reverseSignAndRound(number1));
        System.out.println(reverseSignAndRound(number2));
    }
}
