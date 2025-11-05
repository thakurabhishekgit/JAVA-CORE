package InterviewPrep.Collectionss;

import java.util.LinkedHashMap;

public class LinkedHashMapp {
    public static void main(String[] args) {
        System.out.println("LinkedHashMap example placeholder");
        // LinkedHashMap implementation can be added here
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");
        System.out.println("LinkedHashMap: " + linkedHashMap);
        linkedHashMap.remove(2);
        System.out.println("After removal: " + linkedHashMap);

        linkedHashMap.values().forEach(value -> System.out.println("Value: " + value));
        System.out.println("Size of LinkedHashMap: " + linkedHashMap.size());

        linkedHashMap.clear();
        System.out.println("After clearing, size: " + linkedHashMap.size());
    }

}
