import java.util.*;
public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: space-separated integers
        System.out.print("Enter array elements (space-separated): ");
        String[] input = sc.nextLine().split(" ");
        int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        // PREFIX SUM
        int[] prefix = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            prefix[i] = (i == 0) ? arr[i] : prefix[i - 1] + arr[i];
        }

        // SUFFIX SUM
        int[] suffix = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            suffix[i] = (i == arr.length - 1) ? arr[i] : suffix[i + 1] + arr[i];
        }

        // Output
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Prefix sum array: " + Arrays.toString(prefix));
        System.out.println("Suffix sum array: " + Arrays.toString(suffix));
        sc.close();
    }
}
