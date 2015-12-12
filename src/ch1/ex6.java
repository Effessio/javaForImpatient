package ch1;

import java.math.BigInteger;

/**
 * @author effessio
 */
public class ex6 {
    public static void main(String[] args) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i < 1001; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result.toString());
    }
}
