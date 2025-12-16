package SteramAPI;

import java.util.*;

public class ArraysAndStringsAPIMethods {
    public static void main(String[] args) {

        int[] arr = { 5, 2, 9, 1, 5, 6 };
        System.out.println("\nOriginal array: " + Arrays.toString(arr));
        System.out.println(" sum of array:" + Arrays.stream(arr).sum());
        System.out.println("Length of array: " + arr.length);
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("Max: " + Arrays.stream(arr).max().getAsInt());
        System.out.println("Min: " + Arrays.stream(arr).min().getAsInt());
        System.out.println("Average: " + (int) Arrays.stream(arr).average().orElse(0));
        System.out.printf("Average: %.1f\n", Arrays.stream(arr).average().orElse(0.0));
        System.out.println("Count: " + Arrays.stream(arr).count());
        System.out.println("Sum: " + Arrays.stream(arr).sum());
        System.out.println("Sorted: " + Arrays.stream(arr).sorted().boxed().toList());
        System.out.println("Distinct: " + Arrays.stream(arr).distinct().boxed().toList());
        System.out.println("Reversed: " + Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).toList());
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));


    }
}
