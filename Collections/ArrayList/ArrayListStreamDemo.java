import java.util.*;
import java.util.stream.*;

public class ArrayListStreamDemo {
    public static void main(String[] args) {
        // Initial ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 7, 2, 3, 8, 1, 5, 6));

        // 1. Filter even numbers
        List<Integer> evens = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);

        // 2. Square each element
        List<Integer> squares = list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // 3. Sum of all elements
        int sum = list.stream()
                .mapToInt(x -> x)
                .sum();
        System.out.println("Sum: " + sum);

        // 4. Remove duplicates and sort
        List<Integer> sortedUnique = list.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Unique: " + sortedUnique);

        // 5. Count numbers greater than 5
        long countGreaterThan5 = list.stream()
                .filter(x -> x > 5)
                .count();
        System.out.println("Count > 5: " + countGreaterThan5);

        // 6. Max and Min values
        int max = list.stream().max(Integer::compare).get();
        int min = list.stream().min(Integer::compare).get();
        System.out.println("Max: " + max + ", Min: " + min);

        // 7. Convert to String list (e.g., Num5, Num3, ...)
        List<String> asStrings = list.stream()
                .map(x -> "Num" + x)
                .collect(Collectors.toList());
        System.out.println("String List: " + asStrings);

        // 8. Frequency of each element
        Map<Integer, Long> frequencyMap = list.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println("Frequency Map: " + frequencyMap);

        // 9. First 5 elements (like slicing)
        List<Integer> firstFive = list.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("First 5 elements: " + firstFive);

        // 10. Skip first 3 elements
        List<Integer> skipThree = list.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println("Skip first 3: " + skipThree);
    }
}
