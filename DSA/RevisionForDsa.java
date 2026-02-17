package DSA;

import java.util.*;

public class RevisionForDsa {

    public static void main(String[] args) {

        // int arr[] = { 10, 23, 4, 3, 2, 45, 3 };
        // Integer arrI[] = { 10, 23, 4, 3, 2, 45, 3 };
        // // Arrays.sort(arr);
        // // System.out.println(Arrays.toString(arr));

        // // sort in decsending order
        // Arrays.sort(arrI, (a, b) -> b - a);
        // System.out.println(Arrays.toString(arrI));

        // List<Integer> list = Arrays.asList(arrI);

        // list.sort((a, b) -> a - b);
        // System.out.println(list);

        // list.contains(10);

        // // get index of element
        // list.indexOf(10);

        // // sum of all elements

        System.out.println(twoSum(new int[] { 2, 7, 11, 15 }, 9));

        System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));

        System.out.println(maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));

        System.out.println(majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));

        System.out.println(subarraySum(new int[] { 1, 1, 1 }, 2));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int res = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                res = Math.max(res, prices[r] - prices[l]);
            } else {
                l = r;
            }
            r += 1;
        }
        return res;
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = nums[0];

        for (int num : nums) {
            sum += num;
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        // if (entry.getValue() > nums.length / 2) {
        // return entry.getKey();
        // }
        // }
        for (Integer key : map.keySet()) {
            if (map.get(key) > nums.length / 2) {
                return key;
            }
        }
        return -1;
    }

    public static int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // important base case

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static int lengthOfLongestSubstring(String s) {

        int res = 0;
        int l = 0;
        Set<Character> set = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l += 1;
            }
            set.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

}