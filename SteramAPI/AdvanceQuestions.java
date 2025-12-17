package SteramAPI;
import java.util.*;
import java.util.stream.Collectors;

public class AdvanceQuestions {
    public static void main(String[] args) {

        //Stream api with Hashmap
        // print key value pair

        List<Integer> nums = Arrays.asList(1,2,3,4,12,1,2,3,4,5,2,7,5,5 ,3 ,3);
        //just printing
        nums.stream()
                .collect(Collectors.groupingBy(
                        x -> x,
                        Collectors.counting()
                ))
                .forEach((key , value) ->
                        System.out.println("Key : " + key +" Value : " + value));

        //stroing in a map

        Map<Integer , Long> map =
                nums.stream()
                        .collect(Collectors.groupingBy(
                                x -> x,
                                Collectors.counting()
                        ));
        map.forEach((key , value) ->
                System.out.println("Key : " + key +" Value : " + value));


        int maxFreq = nums.stream()
                .collect(Collectors.groupingBy(
                        x ->x ,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println("maxFreqKey : " + maxFreq);


        //printing most frequent key and value

         nums.stream()
                .collect(Collectors.groupingBy(
                        x -> x,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(entry ->
                System.out.println(entry.getKey() + " -> " + entry.getValue())
        );



    }
}
