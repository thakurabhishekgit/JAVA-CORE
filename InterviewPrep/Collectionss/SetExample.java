package InterviewPrep.Collectionss;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); // duplicate ignored

        System.out.println("Set: " + set);
        System.out.println("Contains Python? " + set.contains("Python"));

        set.remove("Java");
        System.out.println("After remove: " + set);

        for (String s : set)
            System.out.println(s);

        System.out.println("Contains 'Java': " + set.contains("Java"));

        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.clear();
        System.out.println("After clear, size: " + set.size());

        // iterator example
        Set<Integer> numSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator<Integer> iterator = numSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
