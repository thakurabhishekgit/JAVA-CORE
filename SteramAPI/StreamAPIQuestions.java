package SteramAPI;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIQuestions {
    public static void main(String[] args) {
        //Count elements > 10
        int[] arr = {20,3,55,6,7,744,2};

        long count = Arrays.stream(arr)
                .filter(x -> x > 10)
                .count();
        System.out.println(count);
        //sorting in ascending
        List<Integer> sortedAsc = Arrays.stream(arr)
                .sorted()
                .boxed()
                .toList();

        //sorting in descending
        //method 1 (storing in array and lsits)
         int[] sortedDescArr = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                 .mapToInt(Integer::intValue)
                .toArray();
         System.out.println(Arrays.toString(sortedDescArr));

         List<Integer> exp = Arrays.asList(10 , 20 , 30 ,40);
         List<Integer> sortedDescList = exp.stream()
                .sorted(Collections.reverseOrder())
                        .toList();
         System.out.println(sortedDescList);

        //method 2
        int sortDescUsingLambda[] = Arrays.stream(arr)
                .boxed()
                .sorted((a , b) -> b - a)
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(sortDescUsingLambda) + " sortDescUsingLambda");


        //2nd largest number in array
        int secondLargest = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .skip(2)
                .findFirst()
                .orElseThrow();

        System.out.println("Second largest : " + secondLargest);


        //remove duplicates without using distinct

        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);

        List<Integer> withoutDuplicates = duplicateNumbers.stream()
                .filter(seen::add) //or filter(x -> seen.add(x))
                .toList();
        System.out.println("withoutDuplicates" + withoutDuplicates);


        //getDuplicates in list
        Set<Integer> seen1 = new HashSet<>();
        List<Integer> uniqueNumbers = duplicateNumbers
                .stream()
                .filter(i -> !seen1.add(i))
                .toList();

        System.out.println(uniqueNumbers + " unique elements");

        //. How do you sort the given list of decimals in reverse order?
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        List<Double> decimalDesSorted = decimalList.stream()
                .sorted(Collections.reverseOrder())
                .toList();
        System.out.println("decimalDesSorted : " + decimalDesSorted);

        Double max = decimalDesSorted.stream().max(Double::compare ).get();
        System.out.println(max + " maxx");

        //even or odd
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> evenOrOdd = numbers.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        System.out.println(evenOrOdd + " evenOrOdd");
        //any match and all match
       Boolean evenOrOddd = numbers.stream()
                .allMatch(x -> x % 2 == 0);
        System.out.println(evenOrOddd + " evenOrOdd");

        Boolean anymatch = numbers.stream()
                .anyMatch(x -> x > 8);
        System.out.println(anymatch + " any match");

        //Find all peaks
        //(element greater than both neighbors)
        int[] arry = {1, 3, 2, 4, 1, 5, 3 , 4, 5};
        IntStream.range(1 , arry.length - 1 )
                .filter(i -> arry[i] > arry[i - 1] && arry[i] < arry[i + 1])
                .map(i -> arry[i])
                .forEach(System.out::println);


       //sum of even index elements

       List<Integer> nums = Arrays.asList(20,3,54,323,45,3);
       int summ = IntStream
               .range(0 , nums.size())
               .filter(i -> i % 2 == 0)
               .map(i -> nums.get(i))
               .sum();

       System.out.println(summ);

       //Remove duplicates and return array

        int dup[] = {1,2,34,5,2,12,311,1,2,3};

        int real[] = Arrays.stream(dup)
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(real) + "distinct");


        //top 3 elements from array
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95,
                14, 56, 87);

        List<Integer> topThree = listOfIntegers
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println(topThree + "topThree");


        // merge two sorted array

        int[] a = new int[] { 4, 2, 7, 1 };
        int[] b = new int[] { 8, 3, 9, 5 };

        int [] combined = Stream.concat(
                Arrays.stream(a).boxed(),
                Arrays.stream(b).boxed()
        )
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(combined) + "comboned two arrays and sorted");



        int[] combined2 = IntStream.concat(
                        Arrays.stream(a),
                        Arrays.stream(b)
                )
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(combined2));


        //common elements bewteen two array
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        List<Integer> commonListOf2 = list1.stream()
                .filter(x -> list2.contains(x))
                .toList();
        System.out.println(commonListOf2 + "commonListOf2");

//        You have List<List<Integer>>. How do you create a single List<Integer>?
//        Input: List<List<Integer>> nums = List.of(List.of(1, 2), List.of(3, 4));
//        Output: [1,2,3,4]You have List<List<Integer>>. How do you create a single List<Integer>?
//        Input: List<List<Integer>> nums = List.of(List.of(1, 2), List.of(3, 4));
//        Output: [1,2,3,4]


        List<List<Integer>> numss = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );

        List<Integer> result = numss.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(result); // [1, 2, 3, 4]

        //Stream api using hashmap













    }
}
