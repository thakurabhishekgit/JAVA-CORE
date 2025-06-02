import java.util.*;

public class ArrayListDSAProblems {

    // 1. Reverse an ArrayList
    public static void reverseList(ArrayList<Integer> list) {
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
    }

    // 2. Remove all duplicates from an ArrayList
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>(list); // maintains insertion order
        ArrayList<Integer> result = new ArrayList<>(set);
        System.out.println("After Removing Duplicates: " + result);
        return result;
    }

    // 3. Count frequency of each element in a list
    public static void countFrequency(ArrayList<Integer> list) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : list) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequencies:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // 4. Find the longest increasing subsequence (LIS)
    public static int longestIncreasingSubsequence(ArrayList<Integer> list) {
        int n = list.size();
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (list.get(i) > list.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLIS = Arrays.stream(dp).max().getAsInt();
        System.out.println("Longest Increasing Subsequence Length: " + maxLIS);
        return maxLIS;
    }

    // 5. Merge two sorted ArrayLists into one
    public static ArrayList<Integer> mergeSortedLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                merged.add(list1.get(i++));
            } else {
                merged.add(list2.get(j++));
            }
        }

        while (i < list1.size())
            merged.add(list1.get(i++));
        while (j < list2.size())
            merged.add(list2.get(j++));

        System.out.println("Merged Sorted List: " + merged);
        return merged;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 2, 8, 3, 3, 3, 1));
        System.out.println("Original List: " + list);

        // 1. Reverse
        reverseList(new ArrayList<>(list)); // Use copy to preserve original for next methods

        // 2. Remove Duplicates
        ArrayList<Integer> noDup = removeDuplicates(new ArrayList<>(list));
        System.out.println("Original List After Removing Duplicates: " + noDup);
        // 3. Frequency Count
        countFrequency(new ArrayList<>(list));

        // 4. Longest Increasing Subsequence
        longestIncreasingSubsequence(new ArrayList<>(list));

        // 5. Merge Sorted Lists
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        mergeSortedLists(list1, list2);
    }
}
