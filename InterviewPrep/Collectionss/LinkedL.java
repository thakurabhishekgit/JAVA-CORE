package InterviewPrep.Collectionss;

import java.util.LinkedList;
import java.util.List;

public class LinkedL {

    public static void main(String[] args) {
        System.out.println("Linked List example placeholder");

        // LinkedList implementation can be added here
        List<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);

        System.out.println("Linked List: " + ll);

        ll.remove(1); // removes element at index 1
        System.out.println("After removal: " + ll);
        System.out.println("Size of Linked List: " + ll.size());

        for (Integer num : ll) {
            System.out.println(num);
        }

        // remove number 30
        ll.remove(Integer.valueOf(30));

        System.out.println("After removing 30: " + ll);

        // clear the linked list
        ll.clear();
        System.out.println("After clearing, size: " + ll.size());
    }
}
