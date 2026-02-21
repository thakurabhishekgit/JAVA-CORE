package DSA;

import java.util.*;

public class BinaryConvertion {
    public static void main(String[] args) {
        int num = 10;
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary representation of " + num + " is: " + binary);

        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal representation of " + binary + " is: " + decimal);
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i < right + 1; i++) {
            int setBits = Integer.bitCount(i);
            if (isPrime(setBits)) {
                count++;
            }
        }
        return count;
    }
}
