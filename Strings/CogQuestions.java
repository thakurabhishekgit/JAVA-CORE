import java.util.*;

public class CogQuestions {
    public static void main(String[] args) {
        // Given a string containing only lowercase alphabets, identify the characters
        // that occur more than once. Output these characters sorted by decreasing
        // frequency. If two characters have the same frequency, the one with the lower
        // ASCII value comes first

        // String str = "abcdefghaabca";
        // Map<Character, Integer> frequencyMap = new HashMap<>();
        // for (char c : str.toCharArray()) {
        // frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        // }

        // System.err.println(frequencyMap);
        // String result = "";
        // for (Map.Entry<Character, Integer> e : frequencyMap.entrySet()) {
        // if (e.getValue() > 1) {
        // result += e.getKey();
        // }
        // }
        // System.err.println("Characters that occur more than once: " + result);

        // voewls or consonants
        // String str = "abcdefghaabca";
        // Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o',
        // 'u'));
        // for (char c : str.toCharArray()) {
        // if (vowels.contains(c)) {
        // System.out.println(c + " is a vowel");
        // } else {
        // System.out.println(c + " is a consonant");
        // }
        // }

        // String str = "hello world";
        // System.err.println(String.join("", str.split(" ")));

        // String word = "hello";
        // String available = "welldonehoneyr";
        // Map<Character, Integer> wordCount = new HashMap<>();
        // for (char c : word.toCharArray()) {
        // wordCount.put(c, wordCount.getOrDefault(c, 0) + 1);
        // }
        // boolean canForm = true;
        // for (char c : wordCount.keySet()) {
        // if (available.indexOf(c) == -1 || available.indexOf(c) < wordCount.get(c)) {
        // canForm = false;
        // break;
        // }
        // }
        // System.err.println(canForm);

        // String word = "abcdefdb";
        // char ch = 'f';
        // String sub = word.substring(0, word.indexOf(ch));
        // StringBuilder sb = new StringBuilder(sub);
        // sb.reverse();
        // String reversed = sb.toString();
        // System.err.println(reversed.concat(word.substring(word.indexOf(ch))));

        // String s = "IceCreAm";
        // Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u',
        // 'A', 'E', 'I', 'O', 'U'));
        // int left = 0;
        // int right = s.length() - 1;
        // StringBuilder sb = new StringBuilder(s);
        // while (left < right) {
        // while (left < right && !vowels.contains(s.charAt(left))) {
        // left++;
        // }
        // while (left < right && !vowels.contains(s.charAt(right))) {
        // right--;
        // }
        // char temp = s.charAt(right);
        // sb.setCharAt(left, sb.charAt(right));
        // sb.setCharAt(right, temp);
        // left++;
        // right--;

        // }
        // System.err.println("Reversed Vowels: " + sb.toString());

        System.err.println(Integer.parseInt("200202"));
        // 97
        // String str = "hello world";
        // System.out.println(str.lastIndexOf('l'));
        Map<Character, Integer> frequencyMap = new HashMap<>(
                Map.of(
                        'a', 3,
                        'b', 2,
                        'c', 1,
                        'd', 4,
                        'e', 2));
        System.out.println("Frequency Map: " + frequencyMap);
        String str = "xabcdeg";
        String newString = "";
        for (char c : str.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                newString += frequencyMap.get(c) + " ";
            } else {
                System.out.println("Character: " + c + " is not in the frequency map.");
            }
        }
        System.out.println("New String: " + newString.trim());

        // sort
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println("Sorted String: " + new String(arr));
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
