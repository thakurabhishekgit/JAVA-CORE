import java.util.*;

public class ArrayConcepts {
    public static void main(String[] args) {
        // 1. Basic Array Declaration and Initialization
        int[] numbers = { 5, 2, 9, 1, 5, 6 };
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // 2. Accessing Elements
        System.out.println("First element: " + numbers[0]);

        // 3. Length of Array
        System.out.println("Array length: " + numbers.length);

        // 4. Iterating with for loop
        System.out.print("Iterating: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // 5. Iterating with for-each
        System.out.print("\nEnhanced loop: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // 6. Sorting
        Arrays.sort(numbers);
        System.out.println("\nSorted Array: " + Arrays.toString(numbers));

        // 7. Binary Search (after sorting)
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("Index of 5: " + index);

        // 8. Fill Array
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Filled Array: " + Arrays.toString(filled));

        // 9. Copy Array
        int[] copied = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(copied));

        // 10. Copy Range
        int[] range = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Copy Range (1-4): " + Arrays.toString(range));

        // 11. Reverse Array
        reverseArray(numbers);
        System.out.println("Reversed Array: " + Arrays.toString(numbers));

        // 12. Frequency Count
        frequencyCount(new int[] { 1, 2, 2, 3, 1, 4, 2 });

        // 13. Max & Min using Streams
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Max: " + max + ", Min: " + min);

        // 14. Remove Duplicates
        int[] withDuplicates = { 1, 2, 2, 3, 3, 4 };
        int[] unique = Arrays.stream(withDuplicates).distinct().toArray();
        System.out.println("After removing duplicates: " + Arrays.toString(unique));

        // 15. Using Streams to filter & map
        int[] evensDoubled = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toArray();
        System.out.println("Even numbers doubled: " + Arrays.toString(evensDoubled));

        // 16. Multidimensional Arrays
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        System.out.println("Matrix: " + Arrays.deepToString(matrix));
    }

    // Helper method to reverse an array
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    // Helper method for frequency count
    public static void frequencyCount(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency Count:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
