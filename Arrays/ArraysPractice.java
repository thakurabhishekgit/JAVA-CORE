import java.util.*;

public class ArraysPractice {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // for (int i = 0; i < size; i++) {
        // arr[i] = sc.nextInt();
        // }

        // Scanner sc = new Scanner(System.in);
        // int size = Integer.parseInt(sc.nextLine());
        // System.out.println("Enter " + size + " integers separated by spaces:");
        // String[] input = sc.nextLine().split(" ");
        // int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int[] arr = { 5, 2, 9, 1, 5, 6 };

        for (int num : arr) {
            System.out.print(num + " ");
        }
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

        int maxx = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            int[] range = Arrays.copyOfRange(arr, i, i + 3);
            System.out.println("Copy Range: " + Arrays.toString(range));
            int summ = Arrays.stream(range).sum();
            maxx = Math.min(summ, maxx);
        }
        System.out.println("Max sum of any 3 consecutive elements: " + maxx);

        // 1. Reverse an array

        // Frequency count
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, 9);
        System.out.println("Index of 30: " + index);
        int[] arrr = { 1, 2, 2, 3, 1, 4, 2 };
        reverseArray(arrr);
        System.out.println("Reversed array: " + Arrays.toString(arrr));

    }
    // 1. Reverse an array

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
