import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input[] = sc.nextLine().split(" ");
        int arr[] = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        sc.close();
        System.out.println("Original array: " + Arrays.toString(arr));
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println("Duplicate found: " + num);
            } else {
                System.out.println("Added to set: " + num);
            }
        }
        System.out.println("Set: " + set);
        // // Check if a number is present in the set
        // int numberToCheck = 5;
        // if (set.contains(numberToCheck)) {
        // System.out.println(numberToCheck + " is present in the set.");
        // } else {
        // System.out.println(numberToCheck + " is not present in the set.");
        // }

    }

}
