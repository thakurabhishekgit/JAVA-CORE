package DSA;

import java.util.Arrays;

public class RevisionForDsa {

    public static void main(String[] args) {

        int arr[] = { 10, 23, 4, 3, 2, 45, 3 };
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // sort in decsending order

        Arrays.sort(arr, (a, b) -> b - a);
        System.out.println(Arrays.toString(arr));
    }
}
