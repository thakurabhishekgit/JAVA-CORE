import java.util.Arrays;

public class LambdaArrayExample {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 3, 1 };

        // Print all elements using lambda
        Arrays.stream(arr).forEach(x -> System.out.println(x));

        // Filter elements > 3
        System.out.println("Filtered (>3):");
        Arrays.stream(arr)
                .filter(x -> x > 3)
                .forEach(System.out::println);

        // Sort and print
        System.out.println("Sorted:");
        Arrays.stream(arr)
                .sorted()
                .forEach(System.out::println);

        // Sum
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum: " + sum);
    }
}
