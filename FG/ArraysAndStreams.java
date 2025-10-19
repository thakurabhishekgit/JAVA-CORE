package FG;

import java.util.*;

public class ArraysAndStreams {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // int arr[] = Arrays.stream(str.split("
        // ")).mapToInt(Integer::parseInt).toArray();
        int arr[] = { 5, 2, 8, 3, 1 };
        System.out.println("Array: " + Arrays.toString(arr));

        // Arrays.stream(arr).forEach(x -> System.out.println(x));

        Arrays.stream(arr).filter(x -> x > 3).forEach(System.out::println);

        // sorted
        Arrays.stream(arr).sorted().forEach(System.out::println);

        // reverse sorted
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // sum
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum: " + sum);

        // 2. map(Function)
        // Transforms each element.
        Arrays.stream(arr).map(x -> x * 2).forEach(x -> System.out.print(x + " "));
        // if we want to collect the transformed elements into a new array
        int doubledArr[] = Arrays.stream(arr).map(x -> x * 2).toArray();
        System.out.println("\nDoubled Array: " + Arrays.toString(doubledArr));

        // distinct
        int arrWithDuplicates[] = { 5, 2, 8, 3, 1, 2, 5, 8 };
        System.out.println("Array with duplicates: " + Arrays.toString(arrWithDuplicates));
        Arrays.stream(arrWithDuplicates).distinct().forEach(System.out::println);
        // limit and skip
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.stream().limit(3).forEach(System.out::println); // 1 2 3
        nums.stream().skip(2).forEach(System.out::println); // 3 4 5
        // count
        long count = nums.stream().filter(n -> n > 2).count();
        System.out.println(count);

        // min and max
        int max = Arrays.stream(arr).max().orElse(0);
        System.out.println("Max: " + max);
        int min = Arrays.stream(arr).min().orElse(0);
        System.out.println("Min: " + min);

        // average
        double avg = Arrays.stream(arr).average().orElse(0.0);
        System.out.println("Average: " + avg);
        // collection
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        System.out.println("List: " + list);

    }
}
