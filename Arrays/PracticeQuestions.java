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

        // int[] nums = { 1, 12, -5, -6, 50, 3 };
        // int k = 4;
        // double maxSumAvg = Integer.MIN_VALUE;
        // for (int i = 0; i < nums.length - k + 1; i++) {
        // int[] subarray = Arrays.copyOfRange(nums, i, i + k);
        // double average = Arrays.stream(subarray).average().orElse(0.0);
        // System.out.printf("Average of subarray %s: %.2f%n",
        // Arrays.toString(subarray), average);
        // maxSumAvg = Math.max(maxSumAvg, average);

        // }
        // System.out.println("Maximum average of any " + k + " consecutive elements: "
        // + maxSumAvg);

        // int[] arr = { 16, 17, 4, 3, 5, 2 };
        // List<Integer> result = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        // int max = arr[i];
        // for (int j = i + 1; kj < arr.length; j++) {
        // if (arr[j] > max) {
        // max = arr[j];
        // }
        // }
        // result.add(max);
        // }
        // System.out.println("Result: " + result);

        // int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        // int m = 3;
        // int[] nums2 = { 2, 5, 6 };
        // int n = 3;
        // // Output: [1,2,2,3,5,6]

        // int i = m - 1;
        // int j = n - 1;
        // int k = m + n - 1;
        // while (i >= 0 && j >= 0) {
        // if (nums1[i] > nums2[j]) {
        // nums1[k] = nums1[i];
        // i--;
        // } else {
        // nums1[k] = nums2[j];
        // j--;
        // }
        // k--;
        // }
        // while (j >= 0) {
        // nums1[k] = nums2[j];
        // j--;
        // k--;
        // }
        // System.out.println("Merged array: " + Arrays.toString(nums1));

        // int[] nums = { 1, 2, 3, 1, 1, 3 };
        // Map<Integer, Integer> frequencyMap = new HashMap<>();
        // int count = 0;
        // for (int num : nums) {
        // frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        // }
        // for (int val : frequencyMap.values()) {
        // if (val > 1) {
        // count += (val * (val - 1)) / 2; // Combination of pairs
        // }
        // }
        // System.out.println("Count of pairs with equal values: " + count);

        // String sentence = "thequickbrownfoxjumpsoverthelazydog";
        // Set<Character> uniqueChars = new LinkedHashSet<>();
        // for (char c : sentence.toCharArray()) {
        // uniqueChars.add(c);
        // }
        // System.out.println("Unique characters in the sentence: " +
        // uniqueChars.size());

        int[][] nums1 = { { 1, 5 }, { 2, 3 }, { 4, 6 } };
        int[][] nums2 = { { 1, 2 }, { 3, 4 }, { 4, 6 } };
        // op : {{1,7}, {2,5}, {4,12}}
        Map<Integer, Integer> mapnums1 = new HashMap<>();
        for (int[] pair : nums1) {
            mapnums1.put(pair[0], pair[1]);
        }
        Map<Integer, Integer> mapnums2 = new HashMap<>();
        for (int[] pair : nums2) {
            mapnums2.put(pair[0], pair[1]);
        }
        List<int[]> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mapnums1.entrySet()) {
            int key = entry.getKey();
            int value1 = entry.getValue();
            if (mapnums2.containsKey(key)) {
                int value2 = mapnums2.get(key);
                result.add(new int[] { key, value1 + value2 });
            } else {
                result.add(new int[] { key, value1 });
            }
        }
        for (Map.Entry<Integer, Integer> entry : mapnums2.entrySet()) {
            int key = entry.getKey();
            int value2 = entry.getValue();
            if (!mapnums1.containsKey(key)) {
                result.add(new int[] { key, value2 });
            }
        }
        System.out.println("Merged array: " + Arrays.deepToString(result.toArray(new int[0][])));
    }

}
