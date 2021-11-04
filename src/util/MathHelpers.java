package util;

import java.util.stream.IntStream;

public class MathHelpers {
    public static boolean isPrime(int number) {
        return !IntStream.rangeClosed(2, (int) Math.sqrt(number+1.0)).anyMatch(i -> number % i == 0);
    }
}
