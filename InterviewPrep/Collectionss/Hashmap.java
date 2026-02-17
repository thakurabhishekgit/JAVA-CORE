package InterviewPrep.Collectionss;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        System.out.println("HashMap example placeholder");
        // HashMap implementation can be added here

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        System.out.println("HashMap: " + map);
        map.remove(2);
        System.out.println("After removal: " + map);

        HashMap<Integer, Integer> map1 = new HashMap<>();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5 };

        for (int i : arr) {
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }

        map1.containsKey(5);
        System.out.println("Frequency of elements: " + map1);

        map1.containsValue(4);
        System.out.println("Contains value 4: " + map1.containsValue(4));

        for (Integer key : map1.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map1.get(key));
        }

        for (HashMap.Entry<Integer, Integer> entry : map1.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        map.get(1);
    }
}
