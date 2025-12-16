package SteramAPI;
import java.util.*;
import java.util.stream.IntStream;

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










    }
}
