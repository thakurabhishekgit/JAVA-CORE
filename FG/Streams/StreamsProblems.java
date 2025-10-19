package FG.Streams;

import java.util.*;

public class StreamsProblems {
    // Sort in descending order after removing duplicates
    List<Integer> list = Arrays.asList(11, 11, 1, 3, 5, 6, 5);
    List<Integer> result = list.stream().distinct().sorted(Comparator.reverseOrder()).toList();

    List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);
    HashSet<Integer> seen = new HashSet<>();
    List<Integer> unique = duplicateNumbers.stream().filter(num -> seen.add(num))
            .toList();

}
