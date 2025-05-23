import java.util.ArrayList;
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

    }
}