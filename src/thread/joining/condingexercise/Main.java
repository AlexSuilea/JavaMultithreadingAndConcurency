package thread.joining.condingexercise;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        ComplexCalculation complexCalculation = new ComplexCalculation();
        BigInteger result = complexCalculation.calculateResult(new BigInteger("500"), new BigInteger("111"),
                new BigInteger("400"), new BigInteger("100"));

        System.out.println(result);
    }
}
