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
}