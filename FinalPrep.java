
import java.util.*;

public class FinalPrep {
    public static void main(String[] args) {
        // taking array as input
        // Scanner sc = new Scanner(System.in);
        // String[] a = sc.nextLine().split(" ");
        // int[] arr = Arrays.stream(a).mapToInt(Integer::parseInt).toArray();
        // for (int num : arr) {
        // System.out.print(num + " ");
        // }
        // take string as input
        // String str = sc.nextLine();
        // char[] star = str.toCharArray();
        // for (char s : star) {
        // System.err.println(s);
        // }

        // getting arrays as output without iteration
        // int[] arr = { 1, 2, 3, 4, 5, 1 };
        // System.out.println(Arrays.toString(arr));
        // // max element
        // System.out.println(Arrays.stream(arr).max().getAsInt());
        // // min element
        // System.out.println(Arrays.stream(arr).min().getAsInt());

        // // sum
        // System.out.println(Arrays.stream(arr).sum());
        // // sort
        // Arrays.sort(arr);
        // System.out.println(" array: " + Arrays.toString(arr));
        // // reverse
        // int[] sortedDesc = Arrays.stream(arr)
        // .boxed()
        // .sorted(Collections.reverseOrder())
        // .mapToInt(Integer::intValue)
        // .toArray();

        // System.out.println(Arrays.toString(sortedDesc));
        // sliding window sum
        // int SlidingSum = 0;
        // int k = 3;
        // for (int i = 0; i < k; i++) {
        // SlidingSum += arr[i];
        // }
        // int max = 0;
        // // sliding window
        // for (int i = k; i < arr.length; i++) {
        // SlidingSum += arr[i] - arr[i - k];
        // max = Math.max(max, SlidingSum);
        // }
        // System.out.println(max);

        // prefix sum
        // int[] prefixSum = new int[arr.length];
        // prefixSum[0] = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        // prefixSum[i] = prefixSum[i - 1] + arr[i];
        // }
        // System.out.println("Prefix sum: " + Arrays.toString(prefixSum));

        // hashmap methods
        int[] arrH = { 1, 2, 3, 4, 5, 1, 2, 2 };
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arrH) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // for (Map.Entry<Integer, Integer> e : map.entrySet()) {
        // if (e.getValue() > 1) {
        // System.out.println("Element: " + e.getKey() + ", Frequency: " +
        // e.getValue());
        // }
        // }
        // for (int key : map.keySet()) {
        // System.out.println(key);
        // }

        // hashing and sorting

        int[] nums = { 1, 5, 4, 2, 9, 9, 9 };
        int k = 3;

        // Output: 15
        // Explanation: The subarrays of nums with length 3 are:
        // - [1,5,4] which meets the requirements and has a sum of 10.
        // - [5,4,2] which meets the requirements and has a sum of 11.
        // - [4,2,9] which meets the requirements and has a sum of 15.
        // - [2,9,9] which does not meet the requirements because the element 9 is
        // repeated.
        // - [9,9,9] which does not meet the requirements because the element 9 is
        // repeated.
        // We return 15 because it is the maximum subarray sum of all the subarrays that
        // meet the conditions

        int maxSum = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            Set<Integer> uniqueElements = new HashSet<>();
            int currentSum = 0;
            boolean isValid = true;

            for (int j = i; j < i + k; j++) {
                if (uniqueElements.contains(nums[j])) {
                    isValid = false;
                    break;
                }
                uniqueElements.add(nums[j]);
                currentSum += nums[j];
            }

            if (isValid) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        System.out.println("Maximum subarray sum of length " + k + " with unique elements: " + maxSum);

    }

}
