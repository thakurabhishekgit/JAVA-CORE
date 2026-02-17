package DSA;

import java.util.*;

public class RevisionForDsa {

    public static void main(String[] args) {

        int arr[] = { 10, 23, 4, 3, 2, 45, 3 };
        Integer arrI[] = { 10, 23, 4, 3, 2, 45, 3 };
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // sort in decsending order
        Arrays.sort(arrI, (a, b) -> b - a);
        System.out.println(Arrays.toString(arrI));

        List<Integer> list = Arrays.asList(arrI);

        list.sort((a, b) -> a - b);
        System.out.println(list);

        list.contains(10);

        // get index of element
        list.indexOf(10);

        // sum of all elements

    }
}
