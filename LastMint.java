
import java.util.*;

public class LastMint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String[] input = sc.nextLine().split(" ");
        // int[] arr = Arrays.stream(input)
        // .mapToInt(Integer::parseInt)
        // .toArray();
        // System.out.println(Arrays.toString(arr));

        String input = sc.nextLine(); // e.g., "[1,2,3]"

        // Remove brackets and split
        input = input.replaceAll("[\\[\\]]", "");
        String[] parts = input.split(",");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        // Use arr[]
        System.out.println(Arrays.toString(arr));

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

        // String s = "aababcabc";
        // Set<Character> set = new HashSet<>();
        // int count = 0;
        // for (int i = 0; i < s.length() - 2; i++) {
        // String triplet = s.substring(i, i + 3);
        // set.clear(); // clear set for every window
        // for (char c : triplet.toCharArray()) {
        // set.add(c);
        // }
        // if (set.size() == 3) {
        // count++;
        // }
        // }
        // System.out.println(count);
        // int arr[] = { 1, 2, 3, 4, 5, 1, 2, 2 };
        // // int k = 3;
        // int prefixSum[] = new int[arr.length];
        // prefixSum[0] = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        // prefixSum[i] = prefixSum[i - 1] * arr[i];
        // }
        // System.out.println("Prefix sum: " + Arrays.toString(prefixSum));
        // int suffixSum[] = new int[arr.length];
        // suffixSum[arr.length - 1] = arr[arr.length - 1];
        // for (int i = arr.length - 2; i >= 0; i--) {
        // suffixSum[i] = suffixSum[i + 1] * arr[i];
        // }
        // System.out.println("Suffix sum: " + Arrays.toString(suffixSum));
        // int[] mul = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        // mul[i] = prefixSum[i] * suffixSum[i];
        // }
        // System.out.println("Multiplication of prefix and suffix sum: " +
        // Arrays.toString(mul));
        // String str = "aababcabc";
        // for (char c : str.toCharArray()) {
        // if (str.indexOf(c) == str.lastIndexOf(c)) {
        // System.out.println("First non-repeating character: " + c);
        // return;
        // }
        // }

        // System.out.println((int) 'z');
        // System.out.println((char) 122);
        String[] str = "aab , abcabc".split(" ,");
        Arrays.sort(str, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(str));

    }
}