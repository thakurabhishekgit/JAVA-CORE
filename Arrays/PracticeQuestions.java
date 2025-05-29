import java.util.*;
// import java.util.stream.Collectors;

public class PracticeQuestions {
    // [16, 17, 4, 3, 5, 2] → 17, 5, 2, 3, 4, 16
    public static void main(String[] args) {
        // int[] arr = { 1886, 17, 4, 3, 5, 200 };
        // int maxx = arr[0];
        // for (int i = 0; i < arr.length - 1; i++) {

        // int[] subarray = Arrays.copyOfRange(arr, i + 1, arr.length);
        // System.out.println("Subarray: " + Arrays.toString(subarray));
        // int maxInSubarray = Arrays.stream(subarray).max().getAsInt();
        // System.out.println("Max in subarray: " + maxInSubarray);
        // maxx = Math.max(maxx, maxInSubarray);
        // }
        // System.out.println("Maximum value : " + maxx);

        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(16, 17, 4, 3, 5, 2));
        // arr.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        // arr.stream().filter(x -> x % 2 != 0).forEach(System.out::println);

        // String s = "aababcabc";
        // Set<String> set = new HashSet<>();
        // int count = 0;

        // for (int i = 0; i < s.length() - 2; i++) {
        // String triplet = s.substring(i, i + 3);
        // set.clear(); // clear set for every window
        // for (char c : triplet.toCharArray()) {
        // set.add(String.valueOf(c));
        // }
        // if (set.size() == 3) {
        // count++;
        // }
        // }

        // System.out.println("Count of distinct triplets: " + count);

        //

        int[] nums = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        double maxSumAvg = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - k + 1; i++) {
            int[] subarray = Arrays.copyOfRange(nums, i, i + k);
            double average = Arrays.stream(subarray).average().orElse(0.0);
            System.out.printf("Average of subarray %s: %.2f%n", Arrays.toString(subarray), average);
            maxSumAvg = Math.max(maxSumAvg, average);

        }
        System.out.println("Maximum average of any " + k + " consecutive elements: " + maxSumAvg);
    }

}
