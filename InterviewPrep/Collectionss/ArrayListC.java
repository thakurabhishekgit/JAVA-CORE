package InterviewPrep.Collectionss;

import java.util.ArrayList;

public class ArrayListC {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);
        list.remove("Hello");
        System.out.println(list);
        System.out.println("Size: " + list.size());
        for (String s : list) {
            System.out.println(s);
        }
        // list.clear();
        // System.out.println("After clear, size: " + list.size());

        // list.contains("world");
        System.out.println("Contains 'World': " + list.contains("World"));
        System.out.println("Index of 'World': " + list.indexOf("World"));

        System.out.println("sliding window example:");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

    }

}
