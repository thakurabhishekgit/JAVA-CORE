package InterviewPrep.Collectionss;

import java.util.LinkedHashSet;

public class LinkedHashSett {
    public static void main(String[] args) {
        System.out.println("Linked Hash Set example placeholder");

        // LinkedHashSet implementation can be added here
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        System.out.println("Linked Hash Set: " + lhs);

        lhs.remove(20);
        System.out.println("After removal: " + lhs);

        System.out.println("Size of Linked Hash Set: " + lhs.size());
        for (Integer num : lhs) {
            System.out.println(num);
        }
        lhs.add(10); // duplicate, will be ignored
        System.out.println("After adding duplicate 10: " + lhs);

        lhs.addLast(40);
        System.out.println("After adding 40: " + lhs);

        lhs.addFirst(5);
        System.out.println("After adding 5: " + lhs);

        lhs.removeFirst();
        System.out.println("After removing first element: " + lhs);

        lhs.clear();
        System.out.println("After clearing, size: " + lhs.size());
    }

}
