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
}
