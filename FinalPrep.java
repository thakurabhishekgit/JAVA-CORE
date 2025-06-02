
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

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));

        Map<Integer, Integer> def = new LinkedHashMap<>(
                Map.of(
                        1, 10,
                        2, 20,
                        3, 30,
                        4, 40,
                        5, 50,
                        6, 60,
                        7, 70,
                        8, 80,
                        9, 90,
                        10, 100));

        def.entrySet().stream().sorted(Map.Entry.comparingByKey(Collections.reverseOrder()))
                .forEachOrdered(e -> System.out.println(e.getKey() + " " + e.getValue())); // (null, null)

        Set<Integer> set = new HashSet<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        set.add(11);
        System.out.println("Set: " + set);

    }

}
