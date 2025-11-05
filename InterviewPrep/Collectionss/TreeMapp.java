package InterviewPrep.Collectionss;

import java.util.TreeMap;

public class TreeMapp {
    public static void main(String[] args) {
        System.out.println("TreeMap example placeholder");
        // TreeMap implementation can be added here
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        System.out.println("TreeMap: " + treeMap);

        treeMap.remove(1);
        System.out.println("After removal: " + treeMap);
        treeMap.putIfAbsent(0, "Zero");
        System.out.println("After adding first entry: " + treeMap);

        treeMap.put(4, "Four");
        System.out.println("After adding last entry: " + treeMap);
    }

}
