import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.contains(3));
        // list.clear();
        System.out.println(list);

        List<String> alphabet = new ArrayList<>(List.of("A", "B", "C"));
        alphabet.forEach(item -> System.out.println(item));
        System.out.println(alphabet);

        List<Integer> filtered = list.stream()
                .filter(item -> item % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(filtered);

        Collections.sort(list); // Ascending
        // Collections.sort(list, Collections.reverseOrder()); // Descending

        int idx = list.indexOf(1); // Get index of element
        boolean found = list.contains(1); // Search for element

        System.out.println(list);
        System.out.println(idx);
        System.out.println(found);

        // list.removeIf(item -> item % 2 == 0);
        // System.out.println(list);

        // list.addAll(list);
        // System.out.println(list); add new list

        int sum = list.stream().mapToInt(i -> i).sum();
        System.out.println(sum);

        int max = Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);

        list.set(1, 10);
        System.out.println(list);

        list.forEach(System.out::println);

        list.replaceAll(item -> item * 2);
        System.out.println(list);

        list.sort(Collections.reverseOrder());
        System.out.println(list);

        list.sort(null);
        System.out.println(list);

        for (int val : list.subList(0, 2)) {
            System.out.println(val);
        }

        System.out.println(list.subList(0, 2));

    }
}