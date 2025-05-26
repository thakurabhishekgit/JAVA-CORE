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
        System.out.println("aslist: " + Arrays.asList(arr).toString());
        System.out.println("aslist with stream: " + Arrays.stream(arr).boxed().toList());
        System.out.println("Max: " + Arrays.stream(arr).max().orElseThrow());
        System.out.println("Min: " + Arrays.stream(arr).min().orElseThrow());
        System.out.println("Average: " + Arrays.stream(arr).average().orElseThrow());
        System.out.println("Sum: " + Arrays.stream(arr).sum());
        System.out.println("Sorted: " + Arrays.stream(arr).sorted().boxed().toList());
        System.out.println("Distinct: " + Arrays.stream(arr).distinct().boxed().toList());
        System.out.println("Reversed: " + Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).toList());
        System.out.println(Collections.max(Arrays.stream(arr).boxed().toList()));
        System.out.println(Collections.min(Arrays.stream(arr).boxed().toList()));

        // Frequency count

    }

}
