import java.util.*;

public class ArraysAndHash {
    public static void main(String[] args) {
        // // Scanner sc = new Scanner(System.in);
        // // String input[] = sc.nextLine().split(" ");
        // // int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        // // System.out.println("Original array: " + Arrays.toString(arr));
        // int arr1[] = { 5, 2, 9, 1, 5, 6 };
        // int arr2[] = { 3, 7, 2, 3, 8, 1, 5, 6 };
        // int[] result = checkOcuurance(arr1, arr2);
        // // System.out.println("Resulting array: " + Arrays.toString(result));
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int num : result) {
        // map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // for (Map.Entry<Integer, Integer> e : map.entrySet()) {
        // // System.out.println(+e.getKey() + "->" + e.getValue());
        // if (map.containsKey(10)) {
        // System.out.println("10 is present in the map");
        // } else {
        // System.out.println("10 is not present in the map");
        // }
        // }

        // }

        // public static int[] checkOcuurance(int[] arr1, int[] arr2) {
        // Map<Integer, Integer> map1 = new HashMap<>();
        // Map<Integer, Integer> map2 = new HashMap<>();

        // for (int num : arr1) {
        // map1.put(num, map1.getOrDefault(num, 0) + 1);
        // }

        // for (int num : arr2) {
        // map2.put(num, map2.getOrDefault(num, 0) + 1);
        // }
        // System.out.println("Map 1: " + map1);
        // System.out.println("Map 2: " + map2);
        // ArrayList<Integer> result = new ArrayList<>();
        // for (Map.Entry<Integer, Integer> e : map1.entrySet()) {
        // // System.out.println("Element: " + e.getKey() + ", Frequency: " +
        // // e.getValue());
        // if (map2.containsKey(e.getKey())) {
        // result.add(e.getKey());
        // }
        // System.out.println(map1.values());
        // }

        // for (Map.Entry<Integer, Integer> e : map2.entrySet()) {
        // if (!map1.containsKey(e.getKey())) {
        // result.add(e.getKey());
        // }
        // }

        // return result.stream()
        // .mapToInt(Integer::intValue)
        // .toArray();

        // String s = "abcabc";
        // char S[] = s.toCharArray();
        // Map<Character, Integer> map = new HashMap<>();
        // Set<Integer> set = new HashSet<>();
        // for (char num : S) {
        // map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // for (int len : map.values()) {
        // set.add(len);
        // }

        // System.err.println(set.size());

        int[] nums = { 1, 1, 2, 2, 2, 3 };
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> values = new ArrayList<>(frequencyMap.values());
        Collections.sort(values);

    }

}