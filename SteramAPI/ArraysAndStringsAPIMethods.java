package SteramAPI;

import java.util.*;

public class ArraysAndStringsAPIMethods {
    public static void main(String[] args) {
        //for array
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



        List<Integer> list = Arrays.asList(20, 3, 55, 6, 7, 744, 2);

        System.out.println("\nOriginal list: " + list);

// Length
        System.out.println("Length of list: " + list.size());

// Print elements
        list.stream().forEach(System.out::println);

// Sum
        System.out.println("Sum of list: " +
                list.stream().mapToInt(Integer::intValue).sum());

// Max
        System.out.println("Max: " +
                list.stream().max(Integer::compareTo).get());

// Min
        System.out.println("Min: " +
                list.stream().min(Integer::compareTo).get());

// Average
        System.out.println("Average: " +
                list.stream().mapToInt(Integer::intValue).average().orElse(0));

// Average formatted
        System.out.printf("Average: %.1f\n",
                list.stream().mapToInt(Integer::intValue).average().orElse(0.0));

// Count
        System.out.println("Count: " + list.stream().count());

// Sorted (ascending)
        System.out.println("Sorted: " +
                list.stream().sorted().toList());

// Distinct
        System.out.println("Distinct: " +
                list.stream().distinct().toList());

// Reversed (descending)
        System.out.println("Reversed: " +
                list.stream().sorted(Collections.reverseOrder()).toList());

// Sort list in-place
        Collections.sort(list);
        System.out.println("Sorted list (in-place): " + list);


    }
}
