package thread.joining.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Long> inputNumbers = Arrays.asList(100_000_000L, 3435L, 356L, 2324L, 4678L, 29L, 4567L);
        List<FactorialThread> threads = new ArrayList<>();

        for (Long inputNumber : inputNumbers) {
            threads.add(new FactorialThread(inputNumber));
        }

        for (Thread thread : threads) {
            thread.setDaemon(true);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join(2000);
        }

        for(int i=0; i < inputNumbers.size(); i++) {
            FactorialThread factorialThread = threads.get(i);

            if(factorialThread.isFinished()) {
                System.out.println("Factorial of " +inputNumbers.get(i)+ " is " + factorialThread.getResult());
            } else {
                System.out.println("The calculation of " +inputNumbers.get(i) + " is still in progress");
            }
        }
    }

    public static class FactorialThread extends Thread {
        private boolean isFinished = false;
        private BigInteger result = BigInteger.ZERO;
        private long inputNumber;

        public FactorialThread(long inputNumber) {
            this.inputNumber = inputNumber;
        }

        @Override
        public void run() {
            this.result = factorial(inputNumber);
            this.isFinished = true;
        }

        public BigInteger factorial(long inputNumber){
            BigInteger tempResult = BigInteger.ONE;

            for(long i = inputNumber; i > 0; i--) {
                tempResult = tempResult.multiply(new BigInteger(Long.toString(i)));
            }
            return tempResult;
        }

        public boolean isFinished() {
            return isFinished;
        }

        public BigInteger getResult() {
            return result;
        }
    }
}
