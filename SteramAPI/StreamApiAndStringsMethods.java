package SteramAPI;
import java.util.*;
import java.util.stream.Collectors;

public class StreamApiAndStringsMethods {
    public static void main(String[] args) {
        String s = "Hello World";
        //print ascii values
        s.chars()
                .forEach(System.out::println);

        s.chars()
                .mapToObj(c -> (char)c)
                .forEach(System.out::println);


        String str =  "java stream api";
//        String[] arr = str.split(" ");
//        System.out.println(Arrays.toString(arr));
        Arrays.stream(str.split(" "))
                .filter(c -> c.startsWith("j"))
                .forEach(System.out::println);

        String word = "programming";
        word.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .forEach(System.out::println);

        Map<Character , Long> resWord = word.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        c -> c ,
                        Collectors.counting()
                ));
        resWord.forEach((key , value) ->
                System.out.println(key + " -> " + value));

        //longest word in a list
        List<String> words = Arrays.asList("cat", "elephant", "dog", "giraffe", "zebra");

        Optional<String> maxx = words.stream()
                .max(Comparator.comparingInt(String::length));





    }
}
