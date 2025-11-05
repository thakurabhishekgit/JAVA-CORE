package InterviewPrep.Collectionss;

import java.util.TreeSet;

public class TreeS {
    public static void main(String[] args) {
        System.out.println("TreeSet example placeholder");
        // TreeSet implementation can be added here
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(30);
        ts.add(10);
        ts.add(20);
        System.out.println("TreeSet: " + ts);
        ts.remove(10);
        System.out.println("After removal: " + ts);

        // ts.addFirst(5);
        // System.out.println("After adding 5: " + ts);

        // ts.addLast(40);
        // System.out.println("After adding 40: " + ts);

        ts.removeFirst();
        System.out.println("After removing first element: " + ts);

        System.out.println("Size of TreeSet: " + ts.size());
        for (Integer num : ts) {
            System.out.println(num);
        }
    }
}
