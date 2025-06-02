
import java.util.*;

public class LastMint {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String[] input = sc.nextLine().split(" ");
        // int[] arr = Arrays.stream(input)
        // .mapToInt(Integer::parseInt)
        // .toArray();

        // int[] nums = { 1, 1, 2, 2, 2, 3 };
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int num : nums) {
        // map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // map.entrySet().stream()
        // .sorted(Map.Entry.comparingByValue())
        // .forEach(
        // entry -> System.out.println("Element: " + entry.getKey() + ", Frequency: " +
        // entry.getValue()));

        // sliding window with max average

        // int[] nums = { 1, 12, -5, -6, 50, 3 };
        // int k = 4;
        // double maxSum = 0;
        // for (int i = 0; i < k; i++) {
        // maxSum += nums[i];
        // }

        // double currentSum = maxSum;

        // // Slide the window from index k to end
        // for (int i = k; i < nums.length; i++) {
        // currentSum += nums[i] - nums[i - k];
        // maxSum = Math.max(maxSum, currentSum);
        // }
        // double maxAvg = maxSum / k;
        // System.out.printf("Maximum average of any %d consecutive elements: %.2f%n",
        // k, maxAvg);

        String s = "aababcabc";
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            String triplet = s.substring(i, i + 3);
            set.clear(); // clear set for every window
            for (char c : triplet.toCharArray()) {
                set.add(c);
            }
            if (set.size() == 3) {
                count++;
            }
        }
        System.out.println(count);

    }
}