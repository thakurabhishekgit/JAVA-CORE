import java.util.*;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr);

        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr);

        // Check if the string contains a substring
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

        // Replace a substring
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced: " + replacedStr);

        // Split the string into an array
        String[] words = str.split(", ");
        System.out.println("Split: " + Arrays.toString(words));

        // Trim whitespace
        String trimmedStr = "   Hello, World!   ".trim();
        System.out.println("Trimmed: '" + trimmedStr + "'");

        // Check if the string starts with a prefix
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        // Check if the string ends with a suffix
        boolean endsWithExclamation = str.endsWith("!");
        System.out.println("Ends with '!': " + endsWithExclamation);
        // Get the length of the string
        int length = str.length();
        System.out.println("Length: " + length);

        for (char c : str.toCharArray()) {
            System.out.println("Character: " + c);
        }

        // Get the character at a specific index
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        char ch = 'A';
        int ascii = (int) ch; // 65
        System.out.println("ASCII value of '" + ch + "': " + ascii);

        int asciii = 97;
        char chh = (char) asciii; // 'a'
        System.out.println("Character for ASCII 97: " + chh);

        // Check if the string is empty
        boolean isEmpty = str.isEmpty();
        System.out.println("Is empty: " + isEmpty);

        System.err.println(Character.isDigit(ch));
        System.err.println(Character.isLetter(ch));
        System.err.println(Character.isUpperCase(ch));
        System.err.println(Character.isLowerCase(ch));
        System.err.println(Character.isWhitespace(ch));

        // Compare two strings
        String str2 = "Hello, World!";
        boolean areEqual = str.equals(str2);
        System.out.println("Are equal: " + areEqual);

        // Compare ignoring case
        boolean areEqualIgnoreCase = str.equalsIgnoreCase("hello, world!");
        System.out.println("Are equal ignoring case: " + areEqualIgnoreCase);

        // Find the index of a character or substring
        int indexOfWorld = str.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);

        // Find the last index of a character or substring
        int lastIndexOfO = str.lastIndexOf('o');
        System.out.println("Last index of 'o': " + lastIndexOfO);
    }

}
