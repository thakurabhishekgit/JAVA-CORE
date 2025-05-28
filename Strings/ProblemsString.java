import java.util.*;

public class ProblemsString {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // String[] arr = sc.nextLine().split(" ");
        // System.out.println("Split String: " + Arrays.toString(arr));

        // for (String s : arr) {
        // StringBuilder sb = new StringBuilder(s);
        // sb.reverse();
        // System.out.println("Reversed Word: " + sb.toString());
        // }

        // String str1 = "hellooo";
        // String str2 = "ooolleh";
        // StringBuilder sb1 = new StringBuilder(str1);
        // StringBuilder sb2 = new StringBuilder(str2);
        // if (sb1.reverse().toString().equals(sb2.reverse().toString())) {
        // System.out.println("The two strings are anagram of each other.");
        // } else {
        // System.out.println("The two strings are NOT anagram of each other.");
        // }

        // // anagram check
        // String s1 = "listen";
        // String s2 = "silent";
        // char[] arr1 = s1.toCharArray();
        // char[] arr2 = s2.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // if (Arrays.equals(arr1, arr2)) {
        // System.out.println("The two strings are anagram of each other.");
        // } else {
        // System.out.println("The two strings are NOT anagram of each other.");
        // }

        // // unique subset in a string
        // String uni = "abcbcassd";
        // int windwosize = 3;
        // ArrayList<String> result = new ArrayList<>();
        // for (int i = 0; i < uni.length() - windwosize + 1; i++) {
        // String sub = uni.substring(i, windwosize + i);
        // // if (sub.chars().distinct().count() == windwosize) {
        // // System.out.println("Unique Subset: " + sub);
        // // }
        // Set<Character> set = new LinkedHashSet<>();
        // int windowSize = windwosize; // Size of the substring to check
        // for (char c : sub.toCharArray()) {
        // set.add(c);
        // }

        // if (set.size() == windowSize) {
        // System.out.println("Unique Substring: " + sub);
        // result.add(sub);
        // }

        // }
        // System.out.println("All unique substrings of size " + windwosize + ": " +
        // result.size() + result);

        String s = "abcabcbb";
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

    }
}
