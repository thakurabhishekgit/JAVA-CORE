package Stacks;

import java.util.*;

public class StackLeetcode {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "([]})";
        Map<Character, Character> map = new HashMap<>(
                Map.of(
                        ')', '(',
                        '}', '{',
                        ']', '['));
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == map.get(c)) {
                    stack.pop();
                } else {
                    System.out.println("Not balanced");
                    return;
                }
            } else {
                stack.push(c);
            }
        }
        System.out.println("Balanced");
    }
}
