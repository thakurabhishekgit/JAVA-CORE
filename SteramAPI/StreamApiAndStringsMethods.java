package SteramAPI;
import java.util.*;
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

    }
}
