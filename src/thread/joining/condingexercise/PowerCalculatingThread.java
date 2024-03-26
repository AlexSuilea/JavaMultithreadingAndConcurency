package thread.joining.condingexercise;

import java.math.BigInteger;

public class PowerCalculatingThread extends Thread {
    private BigInteger result = BigInteger.ONE;
    private BigInteger base;
    private BigInteger power;

    public PowerCalculatingThread(BigInteger base, BigInteger power) {
        this.base = base;
        this.power = power;
    }

    @Override
    public void run() {
        this.result = pow(base, power);
    }

    private BigInteger pow(BigInteger base, BigInteger power) {
        BigInteger tempResult = BigInteger.ONE;
        for(BigInteger i = BigInteger.ZERO; i.compareTo(power) !=0; i = i.add(BigInteger.ONE)) {
            tempResult = tempResult.multiply(base);
        }
        return tempResult;
    }

    public BigInteger getResult() {
        return result;
    }
}
